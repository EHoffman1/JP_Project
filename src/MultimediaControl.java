/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: MultimediaControl.java
 * Date: 11/10/2018
 * DESC: MultimediaControl interface to create core methods of a media player
 *************************************************************************************************/

/**
 * Interface for different controls to use with movies, audio players, etc.
 */
public interface MultimediaControl {

  public void play();

  public void stop();

  public void previous();

  public void next();

}