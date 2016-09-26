import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Olivi on 11-09-2016.
 */
public class Test {


    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File ("grocery.txt"));

        GroceryList list = new GroceryList();

        while (input.hasNext()) {
            list.add(new GroceryItemOrder(input.next(), input.nextInt(), input.nextDouble()));
        }

        /*list.add(new GroceryItemOrder("Book", 2, 129.95));
        list.add(new GroceryItemOrder("Banana", 5, 1.00));
        list.add(new GroceryItemOrder("Shampoo", 1, 69.95));
        list.add(new GroceryItemOrder("Soda", 3, 10.95));
        list.add(new GroceryItemOrder("Milk", 2, 6.75));
        list.add(new GroceryItemOrder("Butter", 1, 5.00));
        list.add(new GroceryItemOrder("Rye bread", 1, 12.95));
        list.add(new GroceryItemOrder("Pasta", 1, 15.00));
        list.add(new GroceryItemOrder("Flowers", 2, 39.95));
        list.add(new GroceryItemOrder("Socks", 5, 10.00));
        list.add(new GroceryItemOrder("Beans", 1, 9.95)); */

        System.out.println(list.getTotalCost());
    }

    public Test() {
    }
}
