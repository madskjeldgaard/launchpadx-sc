# LaunchpadX

## A simple interface for the Novation Launchpad X controller

A simple interface for the Novation Launchpad X controller, mostly for changing layouts and writing things on the RGB led's.

For more info on the interface exposed by Novation: [click here](https://fael-downloads-prod.focusrite.com/customer/prod/s3fs-public/downloads/Launchpad%20X%20-%20Programmers%20Reference%20Manual.pdf).

## Installation

Open up SuperCollider and evaluate the following line of code:
`Quarks.install("https://github.com/madskjeldgaard/launchpadx-sc")`

## Example

```supercollider
(
// Setup and connect
MIDIClient.init();
l = LaunchpadX.new();
l.connect();
)

// Write some scrolling text
l.textScroll("Hello World!", loop:0, speed: rrand(1,20), colourspec: rrand(0,100))

// If looping text scroll, disable it
l.disableTextScroll();

// Select a layout
l.selectLayout(4);

// Activate programmer mode (set to 0 to return to live mode)
l.setLiveModeSwitch(1);

// You can render arbitrary 8x8 images on it
(
var image = Image.new(8, 8);

image.pixels_(
    Int32Array.fill(image.width * image.height, {
        Image.colorToPixel(Color.new255(255.rand,127.rand,255.rand,255))
    })
);

l.renderPixelGrid(image, type: 2);
)

// Render one static char
l.renderChar($M, 2, 30);

// Go back to live mode
l.setLiveModeSwitch(0);

// Select a layout
l.selectLayout(3);

// Sleep (turn off LEDS)
l.setSleepMode(0);

// Unsleep
l.setSleepMode(1);

// Silly example: Display latest code you evaluated on the Launchpad X
// See the Interpreter help file for more info on using the preprocessor
(
this.preProcessor = {|text| 
    l.textScroll(text, loop:0, speed: rrand(1,20), colourspec: rrand(0,100))
}
)
```
