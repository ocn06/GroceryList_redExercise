package Controller;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Created by Olivi on 11-09-2016.
 */
public class GroceryList {

    //Formating variable
    private static DecimalFormat df2 = new DecimalFormat(".##");

    GroceryItemOrder[] list = new GroceryItemOrder[10];
    int index = 0;

    //Default constructor
    public GroceryList() {
    }

    //Add method
    public void add (GroceryItemOrder item) {

        if (index < 10) {
            list[index] = item;
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
            totalCost+= list[i].getCost();
            System.out.println("Item: " + list[i].getName() + ", quantity: " + list[i].getQuantity() + ", price: " + df2.format(list[i].getPrice()) + " DKK" );
            System.out.println("\t\t" + df2.format(list[i].getCost()) +" DKK");
            System.out.println();
        }
        return "Total cost = " + totalCost + " DKK";
    }

    //toString method
    @Override
    public String toString() {
        return "Controller.GroceryList{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}

