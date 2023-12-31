// A class for writing text on the Launchpad using it's 8x8 grid of buttons
LaunchpadFont {

    // Render a char as an 8x8 image
    *get8x8Char{|char|
        // "A" as a 8x8 character
        var img = Image(8,8);
        var arrayOfPixels;

        switch (char,
            // All upper case characters
            $A, {
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,1,1,1,1,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,0,0,0,0,0,0
                ];

            },
            $B, {
                // "B"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,1,1,1,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $C, {
                // "C"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $D, {
                // "D"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,0,0,0,
                    0,1,0,0,0,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,1,0,0,
                    0,1,1,1,1,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $E, {
                // "E"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,1,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $F, {
                // "F"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,1,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $G, {
                // "G"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,1,1,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $H, {
                // "H"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,1,1,1,1,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $I, {
                // "I"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $J, {
                // "J"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,0,1,1,1,1,0,
                    0,0,0,0,0,0,1,0,
                    0,0,0,0,0,0,1,0,
                    0,0,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $K, {
                // "K"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,1,0,0,
                    0,1,0,0,1,0,0,0,
                    0,1,0,1,0,0,0,0,
                    0,1,1,0,0,0,0,0,
                    0,1,0,1,0,0,0,0,
                    0,1,0,0,1,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $L, {
                // "L"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $M, {
                // "M"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,1,0,0,1,1,0,
                    0,1,0,1,1,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $N, {
                // "N"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,1,0,0,0,1,0,
                    0,1,0,1,0,0,1,0,
                    0,1,0,0,1,0,1,0,
                    0,1,0,0,0,1,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $O, {
                // "O"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $P, {
                // "P"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,1,1,1,1,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $Q, {
                // "Q"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,1,0,1,0,
                    0,1,0,0,0,1,1,0,
                    0,0,1,1,1,1,0,1,
                    0,0,0,0,0,0,0,0
                ];
            },
            $R, {
                // "R"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,1,1,1,1,0,0,
                    0,1,0,1,0,0,0,0,
                    0,1,0,0,1,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $S, {
                // "S"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $T, {
                // "T"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,1,
                    0,0,0,1,0,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $U, {
                // "U"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $V, {
                // "V"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,0,0,1,0,0,
                    0,0,1,0,0,1,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $W, {
                // "W"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,1,0,1,0,0,
                    0,1,0,1,0,1,0,0,
                    0,1,0,1,0,1,0,0,
                    0,0,1,0,1,0,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $X, {
                // "X"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,0,0,1,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,1,0,0,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $Y, {
                // "Y"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,0,0,1,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $Z, {
                // "Z"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,0,0,0,0,1,0,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,1,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },

            // Same as above, but lower case characters
            $a, {
                // "a"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,0,0,1,1,0,0,
                    0,0,0,1,0,0,1,0,
                    0,0,1,0,0,0,0,1,
                    0,0,1,1,1,1,1,1,
                    0,1,0,0,0,0,0,1,
                    0,0,1,0,0,0,0,1,
                    0,0,0,0,0,0,0,0
                ];
            },
            $b, {
                // "b"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,0,0,0,0,0,
                    0,1,0,1,0,0,0,0,
                    0,1,0,0,1,0,0,0,
                    0,1,1,1,1,1,0,0,
                    0,1,0,0,0,1,0,0,
                    0,1,0,0,0,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $c, {
                // "c"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $d, {
                // "d"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,1,0,0,1,0,0,
                    0,0,0,0,0,1,0,0,
                    0,0,0,0,0,1,0,0,
                    0,0,1,0,0,1,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $e, {
                // "e"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,1,1,1,1,1,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $f, {
                // "f"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,0,1,1,1,0,0,
                    0,0,1,0,0,0,1,0,
                    0,0,1,1,1,1,1,0,
                    0,0,1,0,0,0,0,0,
                    0,0,1,0,0,0,0,0,
                    0,0,1,0,0,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $g, {
                // "g"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,0,0,1,1,0,0,
                    0,0,1,0,0,0,1,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $h, {
                // "h"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,1,1,1,1,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $i, {
                // "i"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,1,1,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $j, {
                // "j"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,1,0,
                    0,0,0,0,0,1,0,0,
                    0,0,0,0,0,1,0,0,
                    0,0,0,0,0,1,0,0,
                    0,1,0,0,0,1,0,0,
                    0,0,1,1,1,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $k, {
                // "k"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,1,0,0,
                    0,1,0,0,1,0,0,0,
                    0,1,1,1,0,0,0,0,
                    0,1,0,0,1,0,0,0,
                    0,1,0,0,0,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $l, {
                // "l"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $m, {
                // "m"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,1,0,0,1,1,0,
                    0,1,0,1,1,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $n, {
                // "n"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,1,0,0,0,1,0,
                    0,1,0,1,0,0,1,0,
                    0,1,0,0,1,0,1,0,
                    0,1,0,0,0,1,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $o, {
                // "o"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $p, {
                // "p"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,1,1,1,1,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $q, {
                // "q"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,1,0,0,1,0,
                    0,1,0,0,1,0,1,0,
                    0,0,1,1,0,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $r, {
                // "r"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,1,1,1,1,0,0,
                    0,1,0,1,0,0,0,0,
                    0,1,0,0,1,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $s, {
                // "s"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $t, {
                // "t"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,0,0,1,0,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $u, {
                // "u"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,1,0,0,
                    0,0,1,1,1,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $v, {
                // "v"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,0,0,1,0,0,
                    0,0,1,0,0,1,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $w, {
                // "w"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,1,0,0,1,0,
                    0,1,0,1,0,0,1,0,
                    0,1,0,1,1,1,0,0,
                    0,0,1,0,0,0,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $x, {
                // "x"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,0,0,1,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,1,0,0,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $y, {
                // "y"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,0,0,1,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,0,0,0,0,0
                ];
            },
            $z, {
                // "z"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,0,0,0,0,1,0,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,1,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,0,0,0,0,0,0,0
                ];
            },

            // Numbers 0-9
            $0, {
                // "0"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,1,1,0,
                    0,1,0,0,1,0,1,0,
                    0,1,0,1,0,0,1,0,
                    0,0,1,0,0,0,1,0,
                    0,0,0,1,1,1,0,0
                ];
            },
            $1, {
                // "1"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,1,1,1,0,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,1,1,1,1,1,0
                ];
            },
            $2, {
                // "2"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,0,0,0,0,0,1,0,
                    0,0,0,0,0,1,0,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,1,0,0,0,0,0,
                    0,1,1,1,1,1,1,0
                ];
            },
            $3, {
                // "3"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,0,0,0,0,0,1,0,
                    0,0,0,0,0,1,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,0,0,0,1,0,0,
                    0,0,0,0,0,0,1,0,
                    0,1,1,1,1,1,1,0
                ];
            },
            $4, {
                // "4"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,0,1,1,0,0,0,
                    0,0,1,0,1,0,0,0,
                    0,0,1,0,1,0,0,0,
                    0,1,0,0,1,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,0,1,0,0,0
                ];
            },
            $5, {
                // "5"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,1,1,1,1,0,0,
                    0,0,0,0,0,0,1,0,
                    0,0,0,0,0,0,1,0,
                    0,1,1,1,1,1,0,0
                ];
            },
            $6, {
                // "6"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,1,0,
                    0,1,0,0,0,0,0,0,
                    0,1,0,0,0,0,0,0,
                    0,1,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0
                ];
            },
            $7, {
                // "7"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,1,1,1,1,1,1,0,
                    0,0,0,0,0,0,1,0,
                    0,0,0,0,0,1,0,0,
                    0,0,0,0,1,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,0,1,0,0,0,0,
                    0,0,0,1,0,0,0,0
                ];
            },
            $8, {
                // "8"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,0,0
                ];
            },
            $9, {
                // "9"
                arrayOfPixels = Int32Array[
                    0,0,0,0,0,0,0,0,
                    0,0,1,1,1,1,0,0,
                    0,1,0,0,0,0,1,0,
                    0,1,0,0,0,0,1,0,
                    0,0,1,1,1,1,1,0,
                    0,0,0,0,0,0,1,0,
                    0,0,0,0,0,0,1,0,
                    0,1,1,1,1,1,0,0
                ];
            },

        );


        ^if(arrayOfPixels.notNil, {
            img.setPixels(arrayOfPixels);
            img;
        })
    }
}
