/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: Enum ItemType.java
 * Date: 10/02/2018
 * DESC: ItemType contains a collection of constants that represent data types
 *************************************************************************************************/

// Create an enum called ItemType
public enum ItemType {
  Audio("AU"), Visual("VI"), AudioMobile("AM"), VisualMobile("VM");

  public final String code;

  ItemType(String code){
    this.code = code;
  }
}
