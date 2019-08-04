package formJavaFx;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.*;


import javafx.scene.control.cell.PropertyValueFactory;


import org.springframework.stereotype.Component;
import personTable.Person;
import personTable.PersonTableVievColumn;


import java.net.URL;
import java.util.ResourceBundle;


@Component
public class ControllerFx  implements Initializable {
    public ControllerFx() {
    }
        @FXML
    private ObservableList<PersonTableVievColumn> observableList =FXCollections.observableArrayList();

      @FXML
    private TableView<PersonTableVievColumn> tableView1 ;

    @FXML
    private TableColumn<PersonTableVievColumn,String> columc1;
    @FXML
    private TableColumn<PersonTableVievColumn,String> columc2;


    @FXML
    private ListView table1;

    @FXML
    private Label label1;

    @Override
    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        initData();
        // устанавливаем тип и значение которое должно хранится в колонке
       columc1.setCellValueFactory(new PropertyValueFactory<PersonTableVievColumn, String>("colum1"));
      columc2.setCellValueFactory(new PropertyValueFactory<PersonTableVievColumn, String>("colum2"));

        // заполняем таблицу данными
      tableView1.setItems(observableList);
        setTable(new PersonTableVievColumn("dsf","gggg"));


        System.out.println(" start");

    }

    private void initData(){
        observableList.add(new PersonTableVievColumn("sdf","sdfs"));
        observableList.add(new PersonTableVievColumn("sdf2","sdf2"));
        observableList.add(new PersonTableVievColumn("sdf3","sdfs3"));
    }
    @FXML
    public void setTable(PersonTableVievColumn personTableVievColumn){
       observableList=tableView1.getItems();
        observableList.add(personTableVievColumn);

    }
    @FXML
    public void writeDatesTable(String one, String two){
        setTable(new PersonTableVievColumn(one,two));
    }

    @FXML
    public TableView<PersonTableVievColumn> getTableView1() {
        return tableView1;
    }

    @FXML
    public void setTableView1(TableView<PersonTableVievColumn> tableView1) {
        this.tableView1 = tableView1;
    }

    public void startButton(ActionEvent actionEvent) {
        System.out.println("Нажата кнопка");

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                getTableView1();
                getTableView1().getItems();
                getTableView1().getItems().toString();
                setTable(new PersonTableVievColumn("нажали","кнопку"));

            }
        });
    }
}
