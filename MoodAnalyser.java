package com.moodanalyser;

public class MoodAnalyser {

    String message;
    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("Sad")) {
            return "SAD";
        }else {
            return "HAPPY";
        }
    }
}


