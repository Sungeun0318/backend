package day06.과제;

public class Visualizer {
    String getStars(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += "★";
        }
        return result;
    }
}