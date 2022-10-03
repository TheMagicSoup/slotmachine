# FINAL PROJECT GITHUB REPOSITORY
## SLOT MACHINE
![HACKERMAN](https://c.tenor.com/Pm4S40MGsIQAAAAC/hacker-hackerman.gif)
## Method for implementing new symbol:
* Create subject.png & subjectspec.png
  * 226x226 dimensions, create subject.png
  * subjectspec.png will use premade background & border
* Add subject.png to gamestart gif
  * Edit template PDN file to accomodate subject
  * Add subject.png & use animation plugin to generate gif
* Add to Fruit.java
  * Add case for new symbol in spinner()
* Add to arraylist initialisation in initRNG
  * Extend condition of for loop in initRNG() to be i<total number of symbols
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
  * 100x100 resolution, 5px black border, transparent background
  * Calibri, bold, 22px, anti-aliasing disabled, text centered
