package sample.model;

import java.sql.Time;
import java.sql.Date;

public class Shifts {
    private String id;

    private String date;
    private String startshift;
    private String shiftduration;
    private String agent;
    private int weeknu;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartshift() {
        return startshift;
    }

    public void setStartshift(String startshift) {
        this.startshift = startshift;
    }

    public String getShiftduration() {
        return shiftduration;
    }

    public void setShiftduration(String shiftduration) {
        this.shiftduration = shiftduration;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public int getWeeknu() {
        return weeknu;
    }

    public void setWeeknu(int weeknu) {
        this.weeknu = weeknu;
    }
}
