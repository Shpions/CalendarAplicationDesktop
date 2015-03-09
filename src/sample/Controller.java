package sample;

import com.dio.Service.CalendarService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class Controller {


    @FXML
    Button search;
    @FXML
    TextField title;
    @FXML
    TextField description;
    @FXML
    DatePicker stdate;
    @FXML
    DatePicker edate;
    @FXML
    TextArea mailist;
    @FXML
    TextField hhstart;
    @FXML
    TextField mmstart;
    @FXML
    TextField hhdend;
    @FXML
    TextField mmend;
    @FXML
    Button create2;



    @FXML
    public void createAction(javafx.event.ActionEvent action) throws Exception {
        ((Node) (action.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("action.fxml"));
        Stage primary = new Stage();
        primary.setTitle("Hello World");
        primary.setScene(new Scene(root, 540, 300));
        primary.show();
    }

    @FXML
    public void deleteAction() {

    }

    @FXML
    public void searchAction() {

    }


    public void createEventAction() {
        String titl = title.getText();
        String desc = description.getText();
        Date start = new Date(stdate.getValue().toEpochDay());
        start.setHours(Integer.parseInt(hhstart.getText()));
        start.setMinutes(Integer.parseInt(mmstart.getText()));
        start.setSeconds(0);
        Date end = new Date(edate.getValue().toEpochDay());
        end.setHours(Integer.parseInt(hhdend.getText()));
        end.setMinutes(Integer.parseInt(mmend.getText()));
        end.setSeconds(0);
        String listmail = mailist.getText();
        List<String> mails = Arrays.asList(listmail.split("\\s*,\\s*"));
        CalendarService cs = new CalendarService();
        cs.add_Event(cs.create_Event(titl, desc, start, end, mails));
    }


    public void backToMain(javafx.event.ActionEvent action) throws Exception {
        ((Node) (action.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage primary = new Stage();
        primary.setTitle("Hello World");
        primary.setScene(new Scene(root, 540, 335));
        primary.show();
    }

    @FXML
    public void watchAction(javafx.event.ActionEvent action) throws Exception {
        ((Node) (action.getSource())).getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("eventList.fxml"));
        Stage primary = new Stage();
        primary.setTitle("Hello World");
        primary.setScene(new Scene(root, 540, 335));
        primary.show();

    }


}