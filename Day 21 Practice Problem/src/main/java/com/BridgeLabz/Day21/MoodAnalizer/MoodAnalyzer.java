package com.BridgeLabz.Day21.MoodAnalizer;

public class MoodAnalyzer {

    private String msg;
    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String msg){
        this.msg = msg;
    }

    public String analyzeMood() throws MoodAnalyzerException{
        try {
            if(msg.contains("Sad")){
                return "Sad";
            }
            return "Happy";
        }catch (NullPointerException e){
            return "Happy";
        }
    }
    public static void main(String[] args){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in bad Mood");
    }
}
