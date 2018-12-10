/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: AudioPlayerDriver.java
 * Date: 11/10/2018
 * DESC: Driver class for AudioPlayer to test the class
 *************************************************************************************************/
// Create a driver class for AudioPlayer that will test to see
// whether we can instantiate occurrences of it, use the media controls
// and print out their details to the console.
public class AudioPlayerDriver {

  /**
   * Driver for testing audio player.
   */
  public static void testAudioPlayer() {

    AudioPlayer ipod = new AudioPlayer("iPod Mini", "MP3");

    ipod.play();
    ipod.stop();
    ipod.previous();
    ipod.next();
    System.out.println(ipod.toString());

    AudioPlayer walkman = new AudioPlayer("Walkman", "WAV");
    System.out.println(walkman.toString());

  }

}
