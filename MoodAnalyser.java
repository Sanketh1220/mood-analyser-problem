package com.moodanalyser;

public class MoodAnalyser {

    String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0) {
                throw new MoodAnalysisException(MoodAnalysisException.exceptionType.getGiven_empty_input, "Entered Invalid Input");
            }

            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.exceptionType.given_null_input, "Entered null as Input");
        }
    }
}

