package org.example.creational.abstract_factory;

public class MediaPlayerFactory {

    public static MediaPlayer createMediaPlayer (String fileType){
        if(fileType.equalsIgnoreCase("audio")){
            return new AudioPlayer();
        } else if(fileType.equalsIgnoreCase("video")){
            return new VideoPlayer();
        } else {
            throw new IllegalArgumentException("Unsupported file type");
        }
    }
}
