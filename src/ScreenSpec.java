/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: ScreenSpec.java
 * Date: 11/10/2018
 * DESC: Interface that contains the specifications of the screen
 *************************************************************************************************/

/**
 * Interface for the details of different screens.
 */
public interface ScreenSpec {

  // Create an interface called ScreenSpec.  This will define 3 methods:

  String getResolution();

  int getRefreshRate();

  int getResponseTime();
}