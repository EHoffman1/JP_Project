/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: Enum ItemType.java
 * Date: 10/02/2018
 * DESC: ItemType contains a collection of constants that represent data types
 *************************************************************************************************/

// Create an enum called ItemType

/**
 * Enum for various product/item types.
 */
public enum ItemType {
  AUDIO("AU"), VISUAL("VI"), AUDIO_MOBILE("AM"), VISUAL_MOBILE("VM");

  public final String code;

  ItemType(String code) {
    this.code = code;
  }

  /**
   * Method that gets the item type code.
   *
   * @return item type code
   */
  String getCode() {
    return code;
  }
}