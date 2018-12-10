/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: Main.java
 * Date: 11/10/2018
 * DESC: Main class to test functionality of other classes.
 *************************************************************************************************/

import java.util.ArrayList;

import java.util.Collections;


public class Main {

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

  /**
   * Method that tests the creation of the collection of media players.
   *
   * @return Array list of the media players that were created
   */
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

  /**
   * Method that prints out the array list of media players.
   *
   * @return list of media players
   */
  private static <E> void print(ArrayList<E> productList) {
    for (E p :
        productList) {
      System.out.println(p);
    }

  }

}