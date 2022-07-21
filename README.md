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
  ```
  if(slot1.getID()==slot2.getID()&&slot2.getID()==slot3.getID()){
    switch(slot1.getID()){
    ...
    case <GIVEN ID>:
      winningsCalc(<GIVEN MULTIPLIER>);
      break;
    }
    ...
  }
  ```
  * If necessary, make case outside of `if(slot1.getID()==slot2.getID()&&slot2.getID()==slot3.getID()` for if 1 or 2 of them are present
  ```
  if(slot1.getID()==<GIVEN ID>||slot2.getID()==<GIVEN ID>||slot3.getID()==<GIVEN ID>){
    if(((slot1.getID()==slot2.getID()||slot1.getID()==slot3.getID())&&slot1.getID()==<GIVEN ID>)||((slot2.getID()==slot3.getID())&&slot2.getID()==<GIVEN ID>)){
      winningsCalc(<GIVEN MULTIPLIER>);
    } else {
      winningsCalc(<GIVEN MULTIPLIER>);
    }
  }
  ```
