package slotto;
import java.util.*;
public class Fruit {
    //Creating priv vars for name & id
    private String name;
    private int id;
    //Constructing fruit record
    public Fruit(String n, int i){
        name=n;
        id=i;
    }
    //Creating method for randomly creating a symbol based on a pool of IDs, and giving it a name
    public void spinner(ArrayList<Integer> randIDs) {
        Random ra = new Random();
        //Storing a random number as the ID for the object calling this method
        id = randIDs.get(ra.nextInt(randIDs.size()));
        //Stores the name of the object based on what id it has
        switch (id) {
            case 0:
                name = "Cherry";
                break;
            case 1:
                name = "Bell";
                break;
            case 2:
                name = "Bar";
                break;
            case 3:
                name = "Seven";
                break;
            case 4:
                name = "Lemon";
                break;
            case 5:
                name = "Grape";
                break;
            case 6:
                name = "Orange";
                break;
            case 7:
                name = "Skull";
                break;
            case 8:
                name = "Win";
                break;
            case 9:
                name = "Ball";
                break;
        }
    }
    //Returns name of object
    public String getName(){
        return name;
    }
    //Returns ID of object
    public int getID(){
        return id;
    }
    //Replaces object being called with the parameter object
    public void replace(Fruit x){
        name=x.name;
        id=x.id;
    }

}
