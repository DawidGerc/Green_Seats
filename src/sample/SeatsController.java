package sample;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import java.awt.event.ActionListener;
import java.beans.Visibility;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class SeatsController {
Main mejn = new Main();


    @FXML
    public GridPane labelMain;

    @FXML
    public Button butMon;

    @FXML
    public Button butTue;

    @FXML
    public Button butWed;

    @FXML
    public Button butThu;

    @FXML
    public Button butFri;

    @FXML
    public Button butSat;

    @FXML
    public Button butSun;

    @FXML

    public void handleButton(ActionEvent event){
        Button button = (Button) event.getSource();
        String id = button.getId();
        int weeknu = 11;
        System.out.println(" ");
        System.out.println(mejn.shiftsinWEEK(id,weeknu));
        labelMain.setVisible(true);
    }

    @FXML
    public void makeBook(ActionEvent event) { //booking button program

    }

    @FXML
    public void butDays(ActionEvent event) {
            Button but = (Button) event.getSource();
            String id = but.getId();

        if (id.equals("butMon")){
            butMon.setVisible(true);
            butTue.setVisible(false);
            butWed.setVisible(false);
            butThu.setVisible(false);
            butFri.setVisible(false);
            butSat.setVisible(false);
            butSun.setVisible(false);

        }
        if (id.equals("butTue")){
            butMon.setVisible(false);
            butTue.setVisible(true);
            butWed.setVisible(false);
            butThu.setVisible(false);
            butFri.setVisible(false);
            butSat.setVisible(false);
            butSun.setVisible(false);

        }
        if (id.equals("butWed")){
            butMon.setVisible(false);
            butTue.setVisible(false);
            butWed.setVisible(true);
            butThu.setVisible(false);
            butFri.setVisible(false);
            butSat.setVisible(false);
            butSun.setVisible(false);

        }
        if (id.equals("butThu")){
            butMon.setVisible(false);
            butTue.setVisible(false);
            butWed.setVisible(false);
            butThu.setVisible(true);
            butFri.setVisible(false);
            butSat.setVisible(false);
            butSun.setVisible(false);

        }
        if (id.equals("butFri")){
            butMon.setVisible(false);
            butTue.setVisible(false);
            butWed.setVisible(false);
            butThu.setVisible(false);
            butFri.setVisible(true);
            butSat.setVisible(false);
            butSun.setVisible(false);

        }
        if (id.equals("butSat")){
            butMon.setVisible(false);
            butTue.setVisible(false);
            butWed.setVisible(false);
            butThu.setVisible(false);
            butFri.setVisible(false);
            butSat.setVisible(true);
            butSun.setVisible(false);

        }
        if (id.equals("butSun")){
            butMon.setVisible(false);
            butTue.setVisible(false);
            butWed.setVisible(false);
            butThu.setVisible(false);
            butFri.setVisible(false);
            butSat.setVisible(false);
            butSun.setVisible(true);

        }


    }

}