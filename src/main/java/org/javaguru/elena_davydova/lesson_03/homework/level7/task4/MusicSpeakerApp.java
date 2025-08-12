package org.javaguru.elena_davydova.lesson_03.homework.level7.task4;

public class MusicSpeakerApp {
    public static void main(String[] args) {
        MusicSpeaker musicSpeaker = new MusicSpeaker("Alexa");

        musicSpeaker.levelVolume();
        musicSpeaker.levelVolume();
        System.out.println("Volume is " + musicSpeaker.getVolume());
        System.out.println("Music is turn on? Answer: " + musicSpeaker.isTurnOn());
        System.out.println("==============================");
        musicSpeaker.on();
        musicSpeaker.levelVolume();
        musicSpeaker.levelVolume();
        System.out.println("Volume is " + musicSpeaker.getVolume());
        System.out.println("Music is turn on? Answer: " + musicSpeaker.isTurnOn());

        musicSpeaker.levelVolume();
        musicSpeaker.levelVolume();
        musicSpeaker.levelVolume();
        System.out.println("==============================");
        System.out.println("Volume is " + musicSpeaker.getVolume());
        System.out.println("Music is turn on? Answer: " + musicSpeaker.isTurnOn());

        musicSpeaker.off();
        musicSpeaker.levelVolume();
        musicSpeaker.levelVolume();
        System.out.println("==============================");
        System.out.println("Volume is " + musicSpeaker.getVolume());
        System.out.println("Music is turn on? Answer: " + musicSpeaker.isTurnOn());
    }
}
