package javapatterns.structural.adapter;

/**
 * Created by marco on 02/04/16.
 */
public class AdapterPatternDemo {

    public AdapterPatternDemo() {
        System.out.println("\n### Adapter Pattern demo\n");
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new AdapterPatternDemo();
    }

}
