/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: Enum ItemType.java
 * Date: 10/02/2018
 * DESC: ItemType contains a collection of constants that represent data types
 *************************************************************************************************/

// Create an enum called ItemType
public enum ItemType {
  AUDIO("AU"), VISUAL("VI"), AUDIO_MOBILE("AM"), VISUAL_MOBILE("VM");

  public final String code;

  ItemType(String code) {
    this.code = code;
  }

  String getCode() {
    return code;
  }
}