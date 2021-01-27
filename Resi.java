import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

class Pizza{
    ArrayList<String> ingrediends;
    boolean delivered = false;

    Pizza(ArrayList<String> s){
        ingrediends = new ArrayList<String>(s);
    }
}

public class Resi{

    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        int numberOfPizzas = read.nextInt();
        ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
        int teamsOfTwo = read.nextInt();
        int teamsOfThree = read.nextInt();
        int teamsOfFour = read.nextInt();

        for(int i = 0; i < numberOfPizzas; i++){
            int num = read.nextInt();
            ArrayList<String> tmp = new ArrayList<String>();
            //using arraylist because of .contains method, much cleaner code than
            //for loop to search for ingrediends
            
            for(int j = 0; j < num; j++) tmp.add(read.next());
            pizzas.add(new Pizza(tmp));
        }

        solve(pizzas, teamsOfTwo, teamsOfThree, teamsOfFour);

        read.close();
    }

    public static void solve(ArrayList<Pizza> pizzas, int two, int three, int four){
        

    }
}