package com.moodanalyser;

public class MoodAnalysisException extends  Exception {
    public exceptionType type;

    public MoodAnalysisException(exceptionType given_null_input, String message) {
        super(message);
        this.type = type;
    }

    enum exceptionType {
        given_null_input,
        getGiven_empty_input
    }
}


