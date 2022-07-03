package slotto;
import java.util.*;
public class Fruit {
    private String name;
    private int id;
    public Fruit(String n, int i){
        name=n;
        id=i;
    }
    public void spinner(ArrayList<Integer> x) {
        Random ra = new Random();
        id = x.get(ra.nextInt(x.size()));
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
        }
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
    public void replace(Fruit x){
        name=x.name;
        id=x.id;
    }
}
