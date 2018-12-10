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
   * constructor used to take in the name of the
   * product and set to the field variable name.
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

  /**
   * Method that displays a message when the user plays a movie.
   */
  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  /**
   * Method that displays a message when the user stops a movie.
   */
  @Override
  public void stop() {
    System.out.println("Stopping movie");
  }

  /**
   * Method that displays a message when the user goes to a previous movie.
   */
  @Override
  public void previous() {
    System.out.println("Previous movie");
  }

  /**
   * Method that displays a message when the user skips a movie.
   */
  @Override
  public void next() {
    System.out.println("Next movie");
  }

  // Create a toString method that calls the product toString,
  // displays the monitor and the screen details.

  /**
   * To string method that displays the monitor type.
   *
   * @return Displays the type of monitor
   */
  @Override
  public String toString() {
    return super.toString() + "\n" + "Screen : " + screen + "\n" + "Monitor Type : "
        + monitorType;
  }
}