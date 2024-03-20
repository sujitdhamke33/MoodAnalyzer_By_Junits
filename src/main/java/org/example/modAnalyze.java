package org.example;

public class modAnalyze {
     private String message ;
     
    public modAnalyze() {
        this.message = "I am in the any Mood";
    }
    public modAnalyze(String message) {
        this.message = message;
    }

    public String analyzeMood (){
        if(message.contains("sad")){
            return "SAD";
        } else if (message.contains("any")) {
            return "HAPPY";
        }
        return "";
    }
}