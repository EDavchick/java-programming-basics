package org.javaguru.elena_davydova.lesson_03.homework.level7.task4;

public class MusicSpeaker {
    String model;
    int volume;
    boolean turnOn;

    public MusicSpeaker(String model) {
        this.model = model;
        this.volume = 0;
        this.turnOn = false;
    }

    /**
     * Научить музыкальную колонку включаться
     */
    void on(){
       this.turnOn = true;
    }

    /**
     * Научить музыкальную колонку увеличивать уровень звука на 1,
     * эта операция выполняется только если музыкальная колонка включена
     */
    void levelVolume(){
        if ((this.turnOn) && (this.volume < 10)){
            this.volume = this.volume + 1;
        }
    }

    /**
     * Научить музыкальную колонку выключаться, при этом уровень звука
     * сбрасывается на 0
     */
    void off(){
        this.turnOn = false;
        this.volume = 0;
    }

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isTurnOn() {
        return turnOn;
    }
}
