/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: PlayerDriver.java
 * Date: 11/10/2018
 * DESC: PlayerDriver tests all driver classes
 *************************************************************************************************/

public class PlayerDriver {

  public static void testPlayer() {

    MoviePlayer mp1 = new MoviePlayer("DBPOWER MK101", new Screen("720x480",
        40, 22),
        MonitorType.LCD);

    MoviePlayer mp2 = new MoviePlayer("Pyle PDV156BK", new Screen("1366x768",
        40, 22),
        MonitorType.LED);

    System.out.println(mp1);
    System.out.println(mp2);

    AudioPlayer ipod = new AudioPlayer("iPod Mini", "MP3");
    ipod.next();
    ipod.play();
    ipod.previous();
    ipod.stop();

    mp1.next();
    mp1.play();
    mp1.previous();
    mp1.stop();

  }

}
