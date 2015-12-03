package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float averageArea = 0;
        for (Rectangle r : rectangles) {
            averageArea += r.area();
        }
        averageArea /= rectangles.length;

        return averageArea;
    }
}
