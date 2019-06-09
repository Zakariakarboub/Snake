package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

import java.net.URL;
import java.util.ResourceBundle;

public class GridPaneController implements Initializable {

    @FXML
    private GridPane _gridpane;

    private void SetupGrid()

    {
        int _column_count = 19;
        int _row_count = 15;
        _gridpane.setGridLinesVisible(true);

        for (int x = 0 ; x < _column_count ; x++) {
            ColumnConstraints colConstraints = new ColumnConstraints();
            colConstraints.setHgrow(Priority.ALWAYS);
            colConstraints.setMaxWidth(40);
            _gridpane.getColumnConstraints().add(colConstraints);
        }

        for (int y = 0 ; y < _row_count ; y++) {
            RowConstraints rowConstraints = new RowConstraints();
            rowConstraints.setVgrow(Priority.ALWAYS);
            rowConstraints.setMaxHeight(40);
            _gridpane.getRowConstraints().add(rowConstraints);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        SetupGrid();
    }

}
