# FINAL PROJECT GITHUB REPOSITORY
## SLOT MACHINE
![HACKERMAN](https://c.tenor.com/Pm4S40MGsIQAAAAC/hacker-hackerman.gif)
## Method for implementing new symbol:
* Create subject.png & subjectspec.png
  * 100x100 dimensions, create subject.png
  * Load subject.png, 5px border w/ RGB set to [237, 32, 36]
* Add subject.png to gamestart gif
  * Create file w/ dimensions set to (animtempl.pdn existing width)+100x100
  * Add new colour to background, both layers from animtempl.pdn added to foreground
  * Add subject.png to end of animtempl.pdn
  * Put through paint.NET animation plugin
* Add to Fruit.java
  * Add case for new symbol in spinner()
* Add to arraylist initialisation in main
  * Extend condition of for loop in main() to be i<(previous amount of symbols)+1
* Add to checkSlots()
  * Make case in checkSlots() for if the player has 3 of new symbol in middle
  ```java
  if(slot1.getID()==slot2.getID()&&slot2.getID()==slot3.getID()){
    switch(slot1.getID()){
    ...
    case <GIVEN ID>:
      winningsCalc(<GIVEN MULTIPLIER>);
      break;
    }
    ...
  }

## Method for implementing new button
* Standard/released image
 * 100x100 resolution, 5px black border, [237,32,36] background
 * Calibri, bold, 22px, anti-aliasing disabled, text centered
* Pressed image
 * 100x100 resolution, 5px black border, [141,19,21] background
 * Calibri, bold, 22px, anti-alisaing disabled, text centered
