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

  Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  // Complete the methods from the ScreenSpec interface.

  @Override
  public String getResolution() {
    return resolution;
  }

  @Override
  public int getRefreshRate() {
    return refreshRate;
  }

  @Override
  public int getResponseTime() {
    return responseTime;
  }

  // Add a toString method that will return the details
  // of the 3 field in the same format as the Product Class.
  @Override
  public String toString() {
    return "Resolution : " + resolution + "\n" +
        "Refresh rate : " + refreshRate + "\n" +
        "Response time : " + responseTime;
  }
}
