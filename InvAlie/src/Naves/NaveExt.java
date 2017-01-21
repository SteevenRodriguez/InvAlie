package Naves;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ODEMO
 */
public abstract class NaveExt {
    private Ellipse base1;
    private Circle base2;
    private Line antena;
    private int posX=200;
    private int posY=200;
    
    public NaveExt(Pane paneNaveExt){
        base1 = new Ellipse(posX, posY, 100,15);
        base1.setFill(Color.GREY);
        base1.setStroke(Color.BLACK);
        base2 = new Circle(posX, posY, 50);
        base2.setFill(Color.WHITE);
        base2.setStroke(Color.BLACK);
        antena = new Line(posX-25, posY-75, posX+25, posY-75);
        antena.setScaleY(5);
        antena.setStroke(Color.BLACK);
        antena.setRotate(90);
        paneNaveExt.getChildren().addAll(base2, base1, antena);                        
    }
    
    public abstract void chooseType();
    
}
