package org.example.creational.abstract_factory;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("Playing audio file " + fileName);
    }
}
