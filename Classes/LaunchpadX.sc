// This class is a sysex interface for the Novation Launchpad X
// It is based on this manual's description of the sysex messages:
// https://fael-downloads-prod.focusrite.com/customer/prod/s3fs-public/downloads/Launchpad%20X%20-%20Programmers%20Reference%20Manual.pdf
LaunchpadX {
    var <midiout;

    // Midi target is an already connected MIDIOut
    *new{|midiTarget|
        ^super.newCopyArgs(midiTarget);
    }

    // If you want to connect to the Launchpad X, you can use this method
    connect{
        midiout = MIDIOut.newByName("Launchpad X", "LPX MIDI In");
    }

    // Switch between live mode (0) and programmer's mode (1)
    setLiveModeSwitch{|mode=0|
        midiout.sysex(Int8Array[240, 0, 32, 41, 2, 12, 14, mode, 247])
    }

    /*
    the available layouts are:
    - 00h (0): Session (only selectable in DAW mode)
    - 01h (1): Note mode
    - 04h (4): Custom mode 1 (Drum Rack by factory default)
    - 05h (5): Custom mode 2 (Keys by factory default)
    - 06h (6): Custom mode 3 (Lighting mode in Drum Rack layout by factory default)
    - 07h (7): Custom mode 4 (Lighting mode in Session layout by factory default)
    - 0Dh (13): DAW Faders (only selectable in DAW mode)
    - 7Fh (127): Programmer mode
    Readback variant is available by the followin
    */
    selectLayout{|layout=0|
        midiout.sysex(Int8Array[240, 0, 32, 41, 2, 12, 0, layout, 247])
    }


    // Scrolling text
    // 240 0 32 41 2 12 7 [<loop> [<speed> [<colourspec> [<text>]]]] 247
    // <loop> (1 byte) specifies whether the text should loop, 0: don’t loop, 1: loop.
    // <speed> (1 byte) specifies the speed of the text in pads/second
    // <colourspec> (2 – 4 bytes) is a colour specification.
    // <text> is the text to display.
    // The colour specification <colourspec>:
    // - If first byte is 0, then the next byte is colour from palette, 2 bytes total.
    // - If first byte is 1, then Red, Green and Blue follows (127: Max, 0: Min), 4 bytes total.
    // When the message is empty:
    // Host => Launchpad X:
    // Hex: F0h 00h 20h 29h 02h 0Ch 07h F7h Dec: 2400 32412 127 247
    // Any text scroll which was ongoing is terminated.
    // Omitting <text> results in changing the currently scrolling text’s configuration (looping, speed or colour). Turning off looping for a text scroll which was looping results in ending the scroll after the text completely scrolled out of the surface.
    // If <speed> is 40h or above, it is interpreted as a negative number, formed by subtracting 80h from it (text scrolls from left to right).
    textScroll{|text, loop=1, speed=10, colourspec=66|
        var textBytes = text.asAscii;
        var textLength = textBytes.size;
        var loopByte = loop;
        var speedByte = speed;
        var colourspecBytes = Array[0, colourspec];
        var colourspecLength = colourspecBytes.size;

        var message = [];
        var messageBeginning = [240, 0, 32, 41, 2, 12, 7, loopByte, speedByte];

        // Add message beginning
        messageBeginning.do{|byte, index|
            message = message.add(byte);
        };

        // Add colourspec
        colourspecBytes.do{|byte, index|
            message = message.add(byte);
        };

        // Add text
        if(textLength > 0, {
            textBytes.do{|byte, index|
                message = message.add(byte.asInteger);
            };
        });


        // Add end
        message = message.add(247);

        midiout.sysex(message.as(Int8Array));
    }

    disableTextScroll{
        midiout.sysex(Int8Array[240, 0, 32, 41, 2, 12, 7, 0, 247]);

    }

    // Dec: 240 0 32 41 2 12 8 <brightness>247
    setBrightness{|brightness|
        midiout.sysex(Int8Array[240, 0, 32, 41, 2, 12, 8, brightness, 247]);
    }

    // Whether internal and external leds should light up
    // Dec: 240 0 32 41 2 12 10 <internal> <external> 247
    setLEDFeedbacks{|internal=1, external=1|
        midiout.sysex(Int8Array[240, 0, 32, 41, 2, 12, 10, internal, external, 247]);
    }

    // Dec: 240 0 32 41 2 12 4 <curve> <fixed> 247
    // For <curve>, the followings are available:
    // - 0: Low (Playing soft notes is easier).
    // - 1: Medium.
    // - 2: High (Playing hard notes is easier).
    // - 3: Fixed velocity.
    // The <fixed> parameter provides the fixed velocity value to use when selecting Fixed velocity. By default, this is 7Fh. Changing this is not possible on the Setup menu.
    setVelocityCurve{|curve=1, fixed=127|
        midiout.sysex(Int8Array[240, 0, 32, 41, 2, 12, 4, curve, fixed, 247]);
    }

    // Dec: 240 0 32 41 2 12 11 <type> <threshold> 247
    // For <type>, the followings are available:
    // - 0: Polyphonic Aftertouch (Key Pressure events, A0h – AFh).
    // - 1: Channel Aftertouch (Channel Pressure events, D0h – DFh).
    // - 2: Aftertouch Off.
    // For <threshold>, the followings are available:
    // - 0: Low (Aftertouch is very sensitive)
    // - 1: Medium
    // - 2: High (Aftertouch only kicks in at high pressure on the pads)
    setAfterTouch{|type=0, threshold=1|
        midiout.sysex(Int8Array[240, 0, 32, 41, 2, 12, 11, type, threshold, 247]);
    }

    // Dec: 240 0 32 41 2 12 13 <mode> 247
    // Setting <mode> 0 turns off Fader velocity sensitivity, 1 turns it on.
    setFaderVelocityToggle{|mode=1|
        midiout.sysex(Int8Array[240, 0, 32, 41, 2, 12, 13, mode, 247]);
    }

    // 240 0 32 41 2 12 21 <mode> 247
    // Where <mode> is 0 for Chromatic mode, 1 is for Scale mode.
    setNoteModeMode{|mode=0|
        midiout.sysex(Int8Array[240, 0, 32, 41, 2, 12, 21, mode, 247]);
    }

    // TODO
    setNoteModeConfiguration{
        ^this.notImplemented
    }

    // 240 0 32 41 2 12 9 <mode> 247
    setSleepMode{|mode=0|
        midiout.sysex(Int8Array[240, 0, 32, 41, 2, 12, 9, mode, 247]);
    }

    // Takes an 8x8 image and renders it on the launchpad
    // Type is the type of image, 0 is a normal image, 1 is a flashing image, 2 is a pulsing image
    // Color is the color of the image, it is a midi value from 0 to 127
    renderPixelGrid{|image, type=0, color=66|
        var gridNotes = [
            (81..88), (71..78), (61..68), (51..58), (41..48), (31..38), (21..28), (11..18)
        ].flatten;

        image.pixels.do{|pixelValue, pixlNum|
            var note = gridNotes[pixlNum];
            midiout.noteOn(type, note, pixelValue * color);
        };
    }

    /*
    (
        r{
            loop{
                defer{
                    var char = [
                        $a, $b, $c, $d, $e, $f, $g, $h,
                        $i, $j, $k, $l, $m, $n, $o, $p,
                        $q, $r, $s, $t, $u, $v, $w, $x,
                        $y, $z, $A, $B, $C, $D, $E, $F,
                        $G, $H, $I, $J, $K, $L, $M, $N,
                        $O, $P, $Q, $R, $S, $T, $U, $V,
                        $W, $X, $Y, $Z, $0, $1, $2, $3,
                        $4, $5, $6, $7, $8, $9,
                    ].choose;

                    l.renderChar(char, 1, rrand(0, 127));
                };
                rrand(0.01,0.25).wait;
            }
        }.play
    )
    */
    renderChar{|char, type, color|
        var charPixels = LaunchpadFont.get8x8Char(char);
        if(charPixels.notNil, {
            this.renderPixelGrid(charPixels, type, color);
        }, {
            "Character not found in font".warn;
        })
    }
}
