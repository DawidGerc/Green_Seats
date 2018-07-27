package sample;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class SeatsController {
Main mejn = new Main();


    @FXML
    public void handleButton2(ActionEvent event) {
        Button button = (Button) event.getSource();
        String id = button.getId();

        System.out.println(id);
        System.out.println(mejn.seatOwner(id));
    }

    @FXML

    public void handleButton(ActionEvent event){
        Button button = (Button) event.getSource();
        String id = button.getId();
        int weeknu = 11;
        System.out.println(" ");
        System.out.println(mejn.shiftsinWEEK(id,weeknu));

    }

    @FXML
    public void makeBook(ActionEvent event) { //booking button program

    }

    @FXML
    public void butDayMon(ActionEvent event) {
        //label1.setVisible(false);
        Button button = (Button) event.getSource();
        String id = button.getId();
        //fx:id="butTue".setVisible(false);
    }
    @FXML
    public void butDayTue(ActionEvent event) {
        //label1.setVisible(false);

    }
    @FXML
    public void butDayWed(ActionEvent event) {
        //label1.setVisible(false);

    }
    @FXML
    public void butDayThu(ActionEvent event) {
        //label1.setVisible(false);

    }
    @FXML
    public void butDayFri(ActionEvent event) {
        //label1.setVisible(false);

    }
    @FXML
    public void butDaySat(ActionEvent event) {
        //label1.setVisible(false);

    }
    @FXML
    public void butDaySun(ActionEvent event) {
        //label1.setVisible(false);

    }
    @FXML
    public void showTable(ActionEvent event) {
        //Creating a Grid Pane
        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(400, 200);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        Text text1 = new Text("Email");
        gridPane.add(text1, 0, 0);


        //Creating a scene object



        }
}