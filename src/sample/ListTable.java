package sample;

import com.dio.Event;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Владимир on 08.03.2015.
 */
public class ListTable {
    @FXML
    private TableView<Event> tableview;
    @FXML
    private TableColumn<Event, String> descTab;
    @FXML
    private TableColumn<Event, Date> stdatTab;
    @FXML
    private TableColumn<Event, Date> endDatTab;
    @FXML
    private TableColumn<Event, String> attendersTab;
    @FXML
    private TableColumn<Event, String> titleTab;
    String s[] = {"xxi@ukr.net", "Ksu@ukr.net", "s@gmail.com"};
    List<String> m = new ArrayList<String>(Arrays.asList(s));
    private final ObservableList<Event.Builder> data =
            FXCollections.observableArrayList(
                    new Event.Builder().setEndDate(new Date(2015, 4, 5, 20, 00)).
                            setStartDate(new Date(2015, 4, 5, 12, 00)).setDescription("Beer patry").setTitle("Beer").
                            setAttenders(m),
                    new Event.Builder().setEndDate(new Date(2015, 5, 5, 21, 00)).
                            setStartDate(new Date(2015, 5, 5, 18, 20)).setDescription("Fuck up").setTitle("Meeting").
                            setAttenders(m),
                    new Event.Builder().setEndDate(new Date(2015, 5, 18, 14, 00)).
                            setStartDate(new Date(2015, 5, 18, 13, 00)).setDescription("greate lanch").setTitle("Lanch").
                            setAttenders(m));

    /*titleTab.setCellValueFactory(
            new PropertyValueFactory<Event, String>("Title"));
    descTab.setCellValueFactory(
            new PropertyValueFactory<Event, String>("Description"));
    stdatTab.setCellValueFactory(
            new PropertyValueFactory<Event, Date>("Start Date"));
    endDatTab.setCellValueFactory(
            new PropertyValueFactory<Event, Date>("End Date"));
    attendersTab.setCellValueFactory(
            new PropertyValueFactory<Event, String>("Attenders"));**/

    }

