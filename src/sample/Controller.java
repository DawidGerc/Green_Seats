package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.stage.Stage;


import javafx.event.ActionEvent;
import java.io.IOException;

public class Controller {

    @FXML
    public TabPane mainBorderPane;

    @FXML
    public void showSeats(ActionEvent event) {
        try{
            Stage stage;
            Parent root;
            stage=(Stage) ((Button) (event.getSource())).getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("seatsplan.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();


        }catch(IOException e){
            System.out.println("Couldnt load the dialog");
            e.printStackTrace();
            return;
        }
    }





}
