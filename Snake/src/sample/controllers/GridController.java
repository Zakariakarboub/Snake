package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.*;

import java.util.ResourceBundle;
import java.net.URL;

public class GridController implements Initializable {

    @FXML
    private GridPane _grid;


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        int rowCount = 15;
        int columnCount = 19;

        for(int i = 0;  i < columnCount; i++) {
            ColumnConstraints columnConstraints = new ColumnConstraints(40);
            columnConstraints.setHgrow(Priority.SOMETIMES);
            _grid.getColumnConstraints().add(columnConstraints);
    }

        for (int i = 0; i < rowCount; i++) {
            RowConstraints rowConstraints = new RowConstraints();
            rowConstraints.setVgrow(Priority.SOMETIMES)
        }

        for(int i = 0; i < columnCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                addEventPane(i, j);
            }
        }
    }

    private void addEventPane(int i, int j)
    {
        AnchorPane eventPane = new AnchorPane();
        _grid.add(eventPane, i, j);
    }

    private void setupGrid() {

    }

}
