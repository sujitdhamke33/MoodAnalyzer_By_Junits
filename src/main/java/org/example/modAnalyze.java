package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class modAnalyze {
    public String analyzeMood (String message){
        if(message.contains("sad")){
            return "SAD";
        } else if (message.contains("any")) {
            return "HAPPY";

        }
        return "";
    }
}