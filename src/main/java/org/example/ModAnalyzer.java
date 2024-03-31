package org.example;

class MoodAnalyserException extends Exception
{
    enum Mood{
        HAPPY,SAD,NULL,EMPTY;
    }

    public MoodAnalyserException(String message)
    {
        super(message);
    }
}

 class MoodAnalyser
{
    private String message;

    public MoodAnalyser() {}

    public MoodAnalyser(String message)
    {
        this.message=message;
    }
    public String AnalyseMood() throws MoodAnalyserException
    {
        try{
            if( message == null || message.isEmpty())
            {
                throw new MoodAnalyserException("Invalid Mood...");
            }
        }catch(MoodAnalyserException e) {
            return e.getMessage();
        }
        if(message.contains("sad")) {
            return "SAD";
        }
        else if(message.contains("happy")) {
            return "HAPPY";
        }
        return "";
    }
}
public class ModAnalyzer {
    public static void main(String[] args)
    {
        System.out.println("Mood Analyser Projects...");
    }
}