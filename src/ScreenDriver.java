/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: ScreenDriver.java
 * Date: 11/10/2018
 * DESC: ScreenDriver class to test Screen functionality
 *************************************************************************************************/

public class ScreenDriver {

  /**
   * Driver to test creating a screen.
   */
  public static void testScreen() {

    Screen screen = new Screen("1920x1080", 144, 1);

    System.out.println(screen);
  }

}
