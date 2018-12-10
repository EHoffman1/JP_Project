/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: MonitorType.java
 * Date: 11/10/2018
 * DESC: MonitorType enum that stores different types of monitors
 *************************************************************************************************/

/**
 * Enum that creates different types of monitors.
 */
enum MonitorType {

  // Create an enum called MonitorType

  LCD("LCD"), LED("LED");

  public String code;

  MonitorType(String code) {
    this.code = code;
  }

}