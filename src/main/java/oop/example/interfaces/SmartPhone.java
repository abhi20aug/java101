package oop.example.interfaces;

public class SmartPhone extends Phone implements ICamera, IMediaPlayer {

    public void clickImage() {
        System.out.println("clickImage started");
    }

    public void recordVideo() {
        System.out.println("recordVideo started");
    }

    public void playMp3() {
        System.out.println("playMp3 started");
    };

    public void playMp4() {
        System.out.println("playMp4 started");
    };

}
