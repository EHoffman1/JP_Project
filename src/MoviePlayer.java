/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: MoviePlayer.java
 * Date: 11/10/2018
 * DESC: Similar to audio player but for movie players
 *************************************************************************************************/

public class MoviePlayer extends Product implements MultimediaControl {

  // Create a class called MoviePlayer that extends Product and implements MultimediaControl.

  private MonitorType monitorType;
  private Screen screen;

  /**
   * constructor used to take in the name of the product and set to the field variable name. Assign
   * a serial number from the currentProductionNumber. Incremented the currentProductionNumber in
   * readiness for the next instance. Set manufacturedOn as the current date and time.
   *
   * @param name for product name.
   */
  MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.monitorType = monitorType;
    this.screen = screen;
  }

  // Complete the methods from the MultimediaControl
  // interface in a similar fashion to the audio player.
  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  @Override
  public void stop() {
    System.out.println("Stopping movie");
  }

  @Override
  public void previous() {
    System.out.println("Previous movie");
  }

  @Override
  public void next() {
    System.out.println("Next movie");
  }

  // Create a toString method that calls the product toString,
  // displays the monitor and the screen details.
  @Override
  public String toString() {
    return super.toString() + "\n" + "Screen : " + screen + "\n" + "Monitor Type : "
        + monitorType;
  }
}