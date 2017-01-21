package PaneOrganize;

import Naves.NaveT;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ODEMO
 */
public class PaneOrganizer {

    private BorderPane root;
    private Pane baseNaveT;
    private NaveT naveT;

    public PaneOrganizer() {
        root = new BorderPane();        
        baseNaveT = new Pane();
        naveT = new NaveT(baseNaveT);    
        root.setStyle("-fx-background-image: url(http://wallpapercave.com/wp/JzfvVHJ.jpg );" + "-fx-background-position: center center; "+ "-fx-background-repeat: stretch;");
        root.setBottom(baseNaveT);
        root.setOnKeyPressed(new Mover());
    
    }

    public BorderPane getRoot() {
        return root;
    }
    
    public void iniciar(Event e){
        Mover a = new Mover();
        a.handle((KeyEvent)e);
    }

    private class Mover implements EventHandler<KeyEvent> {

        private int distancia = 100;

        public void handle(KeyEvent e) {

            if (e.getCode() == KeyCode.RIGHT) {
                naveT.getImagen().setTranslateX(naveT.getImagen().getTranslateX()+distancia);
                //baseNaveT.setTranslateX(baseNaveT.getTranslateX()*distancia);
                //naveT.setLocX(naveT.getLocX() * distancia);
            } else if (e.getCode() == KeyCode.LEFT) {          
                naveT.getImagen().setTranslateX(naveT.getImagen().getTranslateX()-distancia);
                //baseNaveT.setTranslateX(baseNaveT.getTranslateX()*distancia);
                //naveT.setLocX(naveT.getLocX() * (-distancia));
            }

        }

    }
}
