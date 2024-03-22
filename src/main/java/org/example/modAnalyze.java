package org.example;

public class modAnalyze {
     private String message ;
     
    public modAnalyze(String message) {

        this.message = message;
    }
 public modAnalyze(){

 }

    public String analyzeMood () {
        try {
            if (message.contains("sad")) {
                return "SAD";
            } else if (message.contains("any")) {
                return "HAPPY";
            }
        } catch (Exception e) {
            return "HAPPY";
        }
        return "";
    }
}