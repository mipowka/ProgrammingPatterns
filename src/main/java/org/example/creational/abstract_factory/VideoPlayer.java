package org.example.creational.abstract_factory;

public class VideoPlayer implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("playing video file: " + fileName);
    }
}
