package com.huey.learning.oop.designprinciple.isp.good;

import com.huey.learning.oop.designprinciple.isp.MultiMediaFile;

public class MP4 implements AudioPlayer, VideoPlayer {

    @Override
    public void playVideo(MultiMediaFile file) {
        // Our code for playing audio files by MP4
    }

    @Override
    public void playAudio(MultiMediaFile file) {
        // Our code for playing video files by MP4
    }

}
