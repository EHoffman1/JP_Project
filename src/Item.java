/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: Interface Item.java
 * Date: 10/02/2018
 * DESC: Interface Item is a superclass to the abstract class Product.
 * It contains accessors, mutators, and fields that Product will use.
 *************************************************************************************************/

import java.util.Date;

// Create an interface called Item
public interface Item {

  // A constant called manufacturer that would be set to “OracleProduction”
  public final String manufacturer = "OracleProduction";

  // A method setProductionNumber that would have one integer parameter
  public void setProductionNumber(int productionNum);

  // A method setName that would have one String parameter
  public void setName(String name);

  // A method getName that would return a String
  public String getName();

  // A method getManufactureDate that would return a Date
  public Date getManufacturerDate();

  // A method getSerialNumber that would return an int
  public int getSerialNumber();

}
