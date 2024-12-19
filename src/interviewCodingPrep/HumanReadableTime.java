package interviewCodingPrep;

/*
 * Write a function, which takes a non-negative
 * integer (seconds) as input and returns the time in a human-readable
 * format (HH:MM:SS)
 *HH = hours, padded to 2 digits, range: 00 - 99
 *MM = minutes, padded to 2 digits, range: 00 - 59
 *SS = seconds, padded to 2 digits, range: 00 - 59
 *The maximum time never exceeds 359999 (99:59:59)
* */

import java.util.ArrayList;
import java.util.List;

public class HumanReadableTime {
    public static String makeReadable(int seconds){
        if(seconds==0){
            return "now";
        }
        List<String> timeParts = new ArrayList<>();
        int years = seconds/31536000; // 60*60*24*365
        if(years>0){
            timeParts.add(years + " year" + (years>1? "s": "")); // Pluralization
            seconds%=31536000;
        }

        int days = seconds/86400; // 60*60*24
        if(days>0){
            timeParts.add(days+ " day" + (days>1? "s": ""));// Pluralization
            seconds%= 86400;
        }

        int hours = seconds/3600; // 60*60
        if(hours>0){
            timeParts.add(hours + " hour" + (hours>1? "s": ""));// Pluralization
            seconds%= 3600;
        }

        int minutes = seconds/60; // 60*60
        if(minutes>0){
            timeParts.add(minutes + " minute"+ (minutes>1? "s": ""));// Pluralization
            seconds%= 60;
        }

        if(seconds > 0) {
            timeParts.add(seconds + " second"+ (seconds>1? "s": ""));
        }
        if(timeParts.size()>1){
            String lastPart = timeParts.remove(timeParts.size()-1);
            return String.join(", ", timeParts) + " and " + lastPart;
        }

        return Integer.toString(seconds);
    }

    public static void main(String[]args){
        int inputSeconds = 85000;
        String result = makeReadable(inputSeconds);
        System.out.println("Formatted duration " + result);
    }
}
