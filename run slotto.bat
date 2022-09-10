@ECHO OFF
ECHO Running slotto.jar...
cd %~p0
javac src/slotto/slotMachine.java
java -jar dist/slotto.jar
PAUSE