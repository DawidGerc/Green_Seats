package sample;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;




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
}