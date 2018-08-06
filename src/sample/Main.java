package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.model.Seats;
import sample.model.Shifts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main extends Application {

    public static Stage parentWindow;

    @Override
    public void start(Stage primaryStage) throws Exception {
        parentWindow = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("teams.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public String seatOwner(String ide) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Cant open data source");
            return null;
        }
        List<Seats> seats = datasource.querySeats();
        if (seats == null) {
            System.out.println("No Seats!");
            return null;
        }

        for (Seats seat : seats)
            if (seat.getSeatid().equals(ide))
                return seat.getSeatowner();

        datasource.close();
        return "koniec";
    }

    public String dater(String datetype) {
        try {
          Date date = new SimpleDateFormat("dd.MM.yyyy").parse(datetype);
            String dateofweek = new SimpleDateFormat("EE", Locale.ENGLISH).format(date);
            return dateofweek;
        } catch (java.text.ParseException e) {
            System.out.println("changing date error " + e);
        }

        return "Nie powiodło się";
    }

    public String shiftsinWEEK(String id, int weeknu) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Cant open data source");
            return null;
        }
        List<Shifts> shifts = datasource.queryShifts(weeknu);

        if (shifts == null) {
            System.out.println("No Shifts!");
            return null;
        }
        boolean f = false;
        for (Shifts shift : shifts) {
            if (shift.getId().equals(id)) {
                f = true;
                System.out.println(" Shifts starts on day : " + shift.getDate() +"; " +  dater(shift.getDate()) + " at time: " + shift.getStartshift());

            }
        }
        if (f = false) {
            return "take it is free";
        }

        datasource.close();
        return null;
    }

    public static void main(String[] args) {
        launch(args);
        //test:
        //   Main mejn = new Main();
        //System.out.println(mejn.seatOwner("4_4"));
    }
}
