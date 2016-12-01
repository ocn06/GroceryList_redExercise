package Controller;

import BusinessLogic.ReadFromFile;
import BusinessLogic.ReadFromFileImpl;
import DAO.FetchContent;
import DAO.FetchContentImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Olivi on 11-09-2016.
 */
public class Test {


    public static void main(String[] args) throws FileNotFoundException {

        FetchContent fetchContent = new FetchContentImpl();
        System.out.println(fetchContent );


        //Scanner input = new Scanner(new File ("grocery.txt"));

        GroceryList list = new GroceryList();

        while (input.hasNext()) {
            list.add(new GroceryItemOrder(input.next(), input.nextInt(), input.nextDouble()));
        }

        /*list.add(new Controller.GroceryItemOrder("Book", 2, 129.95));
        list.add(new Controller.GroceryItemOrder("Banana", 5, 1.00));
        list.add(new Controller.GroceryItemOrder("Shampoo", 1, 69.95));
        list.add(new Controller.GroceryItemOrder("Soda", 3, 10.95));
        list.add(new Controller.GroceryItemOrder("Milk", 2, 6.75));
        list.add(new Controller.GroceryItemOrder("Butter", 1, 5.00));
        list.add(new Controller.GroceryItemOrder("Rye bread", 1, 12.95));
        list.add(new Controller.GroceryItemOrder("Pasta", 1, 15.00));
        list.add(new Controller.GroceryItemOrder("Flowers", 2, 39.95));
        list.add(new Controller.GroceryItemOrder("Socks", 5, 10.00));
        list.add(new Controller.GroceryItemOrder("Beans", 1, 9.95)); */

        System.out.println(list.getTotalCost());
    }

    public Test() {
    }
}
