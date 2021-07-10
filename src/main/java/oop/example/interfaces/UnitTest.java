package oop.example.interfaces;

public class UnitTest {
    public static void main(String[] args) {

        Phone ph = new SmartPhone();
        ph.call();
        ph.sms();

        ICamera camPhone = new SmartPhone();
        camPhone.clickImage();
        camPhone.recordVideo();

        IMediaPlayer mediaPlayer = new SmartPhone();
        mediaPlayer.playMp3();
        mediaPlayer.playMp4();

    }

}
