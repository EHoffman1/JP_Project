/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: Abstract class Product.java
 * Date: 10/02/2018
 * DESC: This abstract class implements the interface Item
 * The purpose of this class is to add fields like serial number, manufacturer,
 * manufactured on, and name that help describe the Product Object
 * It also adds methods to set and get each field and to return the fields
 *************************************************************************************************/


import java.util.Date;

// Create an abstract type called Product that will implement the Item interface
abstract class Product implements Item {

  private int serialNumber;
  private String manufacturer = Item.manufacturer;
  private Date manufacturedOn;
  private String objectName;
  private int currentProductionNumber = 1;
  private java.util.Date date = new java.util.Date();

  // Add a constructor that will take in the name of the product
  // and set this to the field variable name
  // You will also assign a serial number from the currentProductionNumber
  // The  currentProductionNumber should be incremented in readiness for the next instance
  // Set manufacturedOn as the current date and time.

  /**
   * Assigning each variable to their parameter type
   *
   * @param name String value assigned to objectName
   */
  public Product(String name) {
    name = objectName;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = date;
  }

  // Complete the methods from the interface Item

  /**
   * public method to set the current production number
   *
   * @param productionNum integer value for the production number of the product
   */
  public void setProductionNumber(int productionNum) {
    currentProductionNumber = productionNum;
  }

  /**
   * public method to set the field name value
   *
   * @param name String value for the name of the product
   */
  public void setName(String name) {
    objectName = name;
  }

  /**
   * public method returning the name
   *
   * @return String value assigned to name
   */
  public Product getName() {
    return this;
  }

  /**
   * public method returning the date of manufacturing
   *
   * @return Date assigned to the manufacturedOn field
   */
  public Date getManufacturerDate() {
    return manufacturedOn;
  }

  /**
   * public method to return the serial number of the product
   *
   * @return integer value assigned to serialNumber
   */
  public int getSerialNumber() {
    return serialNumber;
  }

  // Add a toString method that returns Manufacturer, Serial Number, Date, and Name

  /**
   * public string method to return each field value
   *
   * @return Each string, integer, and date value assigned to each field
   */
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + objectName;
  }

}