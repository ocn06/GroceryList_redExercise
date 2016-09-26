import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Olivi on 11-09-2016.
 */
public class GroceryList2 {

    private static DecimalFormat df2 = new DecimalFormat(".##");

    ArrayList<GroceryItemOrder> list = new ArrayList<GroceryItemOrder>();
    int index = 0;

    //Default constructor
    public GroceryList2() {
    }

    //Add method
    public void add (GroceryItemOrder item) {

        if (index < 10) {
            list.add(item);
            index++;
        }

        else {
            System.out.println("Grocery list is full already");
            System.out.println();
        }
    }

    public String getTotalCost() {
        double totalCost = 0;

        for (int i = 0; i <= index-1; i++){
            totalCost+= list.get(i).getCost();
            System.out.println("Item: " + list.get(i).getName() + ", quantity: " + list.get(i).getQuantity() + ", price: " + df2.format(list.get(i).getPrice()) + " DKK" );
            System.out.println("\t\t" + df2.format(list.get(i).getCost()) +" DKK");
            System.out.println();
        }
        return "Total cost = " + totalCost + " DKK";
    }

    //toString method
    @Override
    public String toString() {
        return "GroceryList{" +
                "list=" + list.toString() +
                '}';
    }
}

