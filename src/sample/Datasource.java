package sample;

import sample.model.Seats;
import sample.model.Shifts;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Datasource {
    public static final String DB_NAME = "GreenSeats.db";

    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/mikolajhadzik/Desktop/Green_Seats/" + DB_NAME;

    public static final String TABLE_SEATS = "seats";
    public static final String COLUMN_SEATS_SEATID = "seatid";
    public static final String COLUMN_SEATS_SEATOWNER = "seatowner";


    public static final String TABLE_SHIFTS = "shifts";
    public static final String COLUMN_SHIFTS_SEATID = "seatid";
    public static final String COLUMN_SHIFTS_DATE = "date";
    public static final String COLUMN_SHIFTS_START = "startshift";
    public static final String COLUMN_SHIFTS_DURATION = "shiftduration";
    public static final String COLUMN_SHIFTS_AGENT = "agent";
    public static final String COLUMN_SHIFTS_WEEKNU = "weeknu";

    private Connection conn;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println("Coundt connect to datblase: " + e.getMessage());
            return false;
        }
    }

    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Couldnt close connection: " + e.getMessage());
        }
    }

    public List<Seats> querySeats() {

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_SEATS)) {

            List<Seats> seatslist = new ArrayList<>();
            while (results.next()) {
                Seats seat = new Seats();
                seat.setSeatid(results.getString(COLUMN_SEATS_SEATID));
                seat.setSeatowner(results.getString(COLUMN_SEATS_SEATOWNER));
                seatslist.add(seat);
            }
            return seatslist;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }

    public List<Shifts> queryShifts() {

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_SHIFTS)) {

            List<Shifts> shiftlist = new ArrayList<>();
            while (results.next()) {
                Shifts shift = new Shifts();
                shift.setId(results.getString(COLUMN_SHIFTS_SEATID));
                shift.setDate(results.getString(COLUMN_SHIFTS_DATE));
                shift.setAgent(results.getString(COLUMN_SHIFTS_AGENT));
                shift.setStartshift(results.getString(COLUMN_SHIFTS_START));
                shift.setShiftduration(results.getString(COLUMN_SHIFTS_DURATION));
                shift.setWeeknu(results.getInt(COLUMN_SHIFTS_WEEKNU));
                shiftlist.add(shift);
            }
            System.out.println("baza" + shiftlist.size());

            return shiftlist;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }
    public List<Shifts> queryShifts(int week) {
        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_SHIFTS + " WHERE "+ COLUMN_SHIFTS_WEEKNU +"="+week)) {

            List<Shifts> shiftlist = new ArrayList<>();
            while (results.next()) {
                Shifts shift = new Shifts();
                shift.setId(results.getString(COLUMN_SHIFTS_SEATID));
                shift.setDate(results.getString(COLUMN_SHIFTS_DATE));
                shift.setAgent(results.getString(COLUMN_SHIFTS_AGENT));
                shift.setStartshift(results.getString(COLUMN_SHIFTS_START));
                shift.setShiftduration(results.getString(COLUMN_SHIFTS_DURATION));
                shift.setWeeknu(results.getInt(COLUMN_SHIFTS_WEEKNU));
                shiftlist.add(shift);
            }
            System.out.println("baza" + shiftlist.size());

            return shiftlist;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }
}