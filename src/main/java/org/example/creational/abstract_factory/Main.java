package org.example.creational.abstract_factory;

public class Main {
    public static void main(String[] args) {
        MediaPlayer playerAudio = MediaPlayerFactory.createMediaPlayer("audio");
        MediaPlayer playerVideo = MediaPlayerFactory.createMediaPlayer("video");
        playerAudio.play("song.mp3");
        playerVideo.play("Venom 3");


    }
}
