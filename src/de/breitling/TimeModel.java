package de.breitling;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeModel {
    private int userID;
    private LocalTime timeStart;
    private LocalTime timeEnd;
    private double timeWorkedMinutes;

    public void calcMinutesWorked(String timeBegin, String timeEnd,int userID) throws ParseException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime timeStart = LocalTime.parse(timeBegin,formatter);
        LocalTime timeDone = LocalTime.parse(timeEnd,formatter);
        double minutesWorked = Duration.between(timeStart,timeDone).toMinutes();

        if (minutesWorked >= 600) {
            minutesWorked = minutesWorked - 45;
        } else if (minutesWorked >= 360) {
           minutesWorked = minutesWorked - 30;
        }
        this.timeStart = timeStart.truncatedTo(ChronoUnit.MINUTES);
        this.timeEnd = timeDone.truncatedTo(ChronoUnit.MINUTES);
        this.timeWorkedMinutes = minutesWorked;
        this.userID = userID;
    }

    public TimeModel(LocalTime timeStart, LocalTime timeEnd, int userID) throws ParseException {
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.userID = userID;
        calcMinutesWorked(timeStart.toString(),timeEnd.toString(),userID);
    }

    public TimeModel() {

    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public LocalTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalTime timeStart) {
        this.timeStart = timeStart;
    }

    public LocalTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    public double getTimeWorkedMinutes() {
        return timeWorkedMinutes;
    }

    public void setTimeWorkedMinutes(double timeWorkedMinutes) {
        this.timeWorkedMinutes = timeWorkedMinutes;
    }
}
