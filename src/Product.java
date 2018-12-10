/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: Abstract class Product.java
 * Date: 10/02/2018
 * DESC: This abstract class implements the interface Item
 * The purpose of this class is to add fields like serial number, manufacturer,
 * manufactured on, and name that help describe the Product Object
 * It also adds methods to set and get each field and to return the fields
 *************************************************************************************************/

import java.lang.String;
import java.util.Date;

// Create an abstract type called Product that will implement the Item interface
abstract class Product implements Item, Comparable<Product> {

  int serialNumber;
  String manufacturer = Item.manufacturer;
  Date manufacturedOn;
  String name;
  static int currentProductionNumber = 1;


  /**
   * Empty constructor for product.
   */
  public Product() {

  }

  // Add a constructor that will take in the name of the product
  // and set this to the field variable name
  // You will also assign a serial number from the currentProductionNumber
  // The  currentProductionNumber should be incremented in readiness for the next instance
  // Set manufacturedOn as the current date and time.

  /**
   * Constructor Assigning each variable to their parameter type.
   *
   * @param name String value assigned to objectName
   */
  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date();
  }

  // Complete the methods from the interface Item

  /**
   * public method to set the current production number.
   *
   * @param productionNum integer value for the production number of the product.
   */
  @Override
  public void setProductionNumber(int productionNum) {
    // shows as bug, but I couldn't figure out any way
    // to fix that would also work for the assignment
    currentProductionNumber = productionNum;
  }

  /**
   * public method to set the field name value.
   *
   * @param name String value for the name of the product
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   * public method returning the name.
   *
   * @return String value assigned to name
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * public method returning the date of manufacturing.
   *
   * @return Date assigned to the manufacturedOn field
   */
  @Override
  public Date getManufacturerDate() {
    return manufacturedOn;
  }

  /**
   * public method to return the serial number of the product.
   *
   * @return integer value assigned to serialNumber.
   */
  @Override
  public int getSerialNumber() {
    return serialNumber;
  }

  // Add a toString method that returns Manufacturer, Serial Number, Date, and Name

  /**
   * public string method to return each field value.
   *
   * @return Each string, integer, and date value assigned to each field
   */
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + name;
  }

  public int compareTo(Product o) {
    return name.compareTo(o.getName());
  }

}
