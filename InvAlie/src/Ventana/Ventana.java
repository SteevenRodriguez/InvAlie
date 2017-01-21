package Ventana;


import Naves.NaveT;
import PaneOrganize.PaneOrganizer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ODEMO
 */
public class Ventana extends Application{
    public void start(Stage stage){
        PaneOrganizer pane = new PaneOrganizer();
        Scene scene = new Scene(pane.getRoot());      
        scene.addEventFilter(KeyEvent.KEY_PRESSED, e->pane.iniciar(e));
        stage.setScene(scene);
        stage.setTitle("Invasion Alien");
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
