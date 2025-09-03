package org.javaguru.elena_davydova.lesson_05.homework.level_1;

public class DefineColor {
    public static void main(String[] args) {
        System.out.println(defineColor(567));
        System.out.println(defineColor(596));
        System.out.println(defineColor(440));
        System.out.println(defineColor(640));
        System.out.println(defineColor(230));
        System.out.println(defineColor(494));
    }

    static String defineColor(int color) {
        String light = "";
        if (color >= 380 && color <= 449) light = "Violet";
        else if (color >= 450 && color <= 494) light = "Blue";
        else if (color >= 495 && color <= 569) light = "Green";
        else if (color >= 570 && color <= 589) light = "Yellow";
        else if (color >= 590 && color <= 619) light = "Orange";
        else if (color >= 620 && color <= 750) light = "Red";
        else light = "Invisible Light";
        return light;
    }
}
