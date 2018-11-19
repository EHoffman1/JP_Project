import java.util.ArrayList;

import java.util.Collections;


public class Main {

  /**
   *   test the functionality of the program.
   */
  public static void main(String[] args) {

    // Write one line of code to create an ArrayList of products
    ArrayList<Product> productsArrayList;

    // Write one line of code to call testCollection and assign the result to the ArrayList
    productsArrayList = testCollection();

    // Write one line of code to sort the ArrayList
    Collections.sort(productsArrayList);

    // Call the print method on the ArrayList
    print(productsArrayList);
  }

  // Complete the header for the testCollection method here

  public static ArrayList<Product> testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen("720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    // Write one line of code here to create the collection
    ArrayList<Product> products = new ArrayList<Product>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  // Create print method here
  private static <E> void print(ArrayList<E> productList) {
    for (E p :
        productList) {
      System.out.println(p);
    }

  }

}