/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: Screen.java
 * Date: 11/10/2018
 * DESC: Screen class implements the ScreenSpec interface to return the details of the screen
 *************************************************************************************************/


public class Screen implements ScreenSpec {

  // Create a class called Screen that implements ScreenSpec

  private String resolution;
  private int refreshRate;
  private int responseTime;

  /**
   * Constructor for the screen of a movie player. It takes in
   * the resolution, refresh rate, and response time of the screen.
   *
   * @param resolution Screen resolution
   * @param refreshRate Screen refresh rate
   * @param responseTime Screen response time
   */
  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  // Complete the methods from the ScreenSpec interface.

  @Override
  /**
   * Method that gets the screen resolution
   */
  public String getResolution() {
    return resolution;
  }

  @Override
  /**
   * Method that gets the screen refresh rate
   */
  public int getRefreshRate() {
    return refreshRate;
  }

  @Override
  /**
   * Method that gets the screen response time
   */
  public int getResponseTime() {
    return responseTime;
  }

  // Add a toString method that will return the details
  // of the 3 field in the same format as the Product Class.
  @Override
  /**
   * To string method that displays screen details
   *
   * @return Displays screen resolution, refresh rate, and response time
   */
  public String toString() {
    return "Resolution : " + resolution + "\n"
        + "Refresh rate : " + refreshRate + "\n"
        + "Response time : " + responseTime;
  }
}
