package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class Main extends Application
{

    private Parent rootNode;

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void init() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/views/GameScene.fxml"));
        rootNode = fxmlLoader.load();
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setScene(new Scene(rootNode));
        primaryStage.setResizable(false);
        primaryStage.setTitle("PROG2 ASS Snake - Zakaria Karboub");
        primaryStage.show();
    }
}