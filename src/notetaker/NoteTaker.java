/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notetaker;

import NoteTakerMVC.Controller;
import NoteTakerMVC.Design;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author JEsus
 */
public class NoteTaker extends Application {
    public static final String BUILD_NUMBER = "17";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Design design = new Design();
        Controller controller = new Controller(design);
        Scene scene = new Scene(design, 400, 600);

        scene.getStylesheets().add("Styles/material-fx-v0_3.css");
        primaryStage.setTitle("Note Taker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
