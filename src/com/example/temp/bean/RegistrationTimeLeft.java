package com.example.temp.bean;
import java.time.LocalTime;

public class RegistrationTimeLeft {
    public static void main(String[]args){
        LocalTime currentTime = LocalTime.now();
        LocalTime registrationEndTime = LocalTime.of(23, 59); // Assuming registration ends at 11:59 PM
           int hoursLeft = registrationEndTime.getHour() - currentTime.getHour();
        int minutesLeft = registrationEndTime.getMinute() - currentTime.getMinute();
        if (minutesLeft < 0) {
            hoursLeft--;
            minutesLeft += 60;
        }
        System.out.println("Time left for registration: " + hoursLeft + " hours and " + minutesLeft + " minutes");


    }

    
}
