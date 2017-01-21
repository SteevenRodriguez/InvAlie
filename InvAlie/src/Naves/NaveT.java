package Naves;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ODEMO
 */
public class NaveT {

    private Rectangle base1, base2;
    private Polygon pico1, pico2, alaDer, alaIzq;
    private Line linea1, linea2;
    //private int posX, posY;
    private Group imagen;

    public NaveT(Pane paneNave) {
        imagen = new Group();
        base1 = new Rectangle(100, 100, 200, 100);
        base1.setFill(Color.RED);
        base1.setStroke(Color.BLACK);
        base2 = new Rectangle(100 + 25, 100 + 40, 150, 60);
        base2.setFill(Color.WHITE);
        base2.setStroke(Color.BLACK);
        pico1 = new Polygon(0, 100, 50, 0, 100, 100);
        pico1.setFill(Color.WHITE);
        pico1.setStroke(Color.BLACK);
        pico1.setLayoutX(100 + 50);
        pico1.setLayoutY(100 - 100);
        pico2 = new Polygon(0, 50, 25, 0, 50, 50);
        pico2.setLayoutX(100 + 75);
        pico2.setLayoutY(100 + 50);
        pico2.setFill(Color.RED);
        pico2.setStroke(Color.BLACK);
        alaDer = new Polygon(0, 75, 0, 0, 100, 75);
        alaDer.setLayoutX(100 + 200);
        alaDer.setLayoutY(100 + 25);
        alaDer.setFill(Color.RED);
        alaDer.setStroke(Color.BLACK);
        alaIzq = new Polygon(0, 0, 100, 0, 100, -75);
        alaIzq.setLayoutX(100 - 100);
        alaIzq.setLayoutY(100 + 100);
        alaIzq.setFill(Color.RED);
        alaIzq.setStroke(Color.BLACK);
        linea1 = new Line(100 + 250, 100 + 50, 100 + 350, 100 + 50);
        linea1.setScaleY(20);
        linea1.setRotate(90);
        linea1.setStroke(Color.RED);
        linea2 = new Line(100 - 50, 100 + 50, 100 - 150, 100 + 50);
        linea2.setScaleY(20);
        linea2.setRotate(90);
        linea2.setStroke(Color.RED);
        imagen.getChildren().addAll(base1, base2, pico1, pico2, alaDer, alaIzq, linea1, linea2);
        imagen.setScaleX(0.25);
        imagen.setScaleY(0.25);
        paneNave.getChildren().add(imagen);
    }

    public Group getImagen() {
        return imagen;
    }

    /*
    public void setLocX(int x) {
        this.posX = x;
    }

    public void setLocY(int y) {
        this.posY = y;
    }

    public int getLocX() {
        return posX;
    }

    public int getLocY() {
        return posY;
    }
    */
    
}
