/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: AudioPlayer.java
 * Date: 11/10/2018
 * DESC: AudioPlayer gets the description of an audio player, it inherits Product
 * and implements MultimediaControl interface
 *************************************************************************************************/

public class AudioPlayer extends Product implements MultimediaControl {

  // Create a class called AudioPlayer that is a subclass
  // of Product and implements the MultimediaControl interface.

  private String audioSpecification;
  private ItemType mediaType = ItemType.AUDIO;

  // Create a constructor that will take in 2 parameters –name and audioSpecification.
  // The constructor should call its parents constructor and also setup the media type.

  /**
   * Taking the name of a product and setting it to its variable
   *
   * @param name for product name.
   */
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;
  }

  @Override
  public void play() {
    System.out.println("Playing");

  }

  @Override
  public void stop() {
    System.out.println("Stopping");

  }

  @Override
  public void previous() {
    System.out.println("Previous");

  }

  @Override
  public void next() {
    System.out.println("Next");

  }


  // Create a toString method that will display the superclasses
  // toString method, but also add rows for Audio Spec and Type.
  public String toString() {
    return super.toString() + "\n" + "Audio Spec : " + audioSpecification + "\n" + "Type : "
        + mediaType;
  }
}
