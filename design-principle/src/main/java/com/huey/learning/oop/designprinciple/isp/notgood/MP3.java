package com.huey.learning.oop.designprinciple.isp.notgood;

import com.huey.learning.oop.designprinciple.isp.MultiMediaFile;

public class MP3 implements Player {

    @Override
    public void playAudio(MultiMediaFile file) {
        // Our code for playing video files by MP3

    }

    @Override
    public void playVideo(MultiMediaFile file) {
        throw new UnsupportedOperationException("Unable to play the video file.");
    }

}
