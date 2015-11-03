/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author panpjp
 */
public class Goomba {

    public Goomba(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    
    public void draw(Graphics graphics) {

        // El Polygon
        
        int[] xValues = new int[6];
        xValues[0] = ((width*17/100)*7/10);
        xValues[1] = ((width*45/100)*7/10);
        xValues[2] = ((width*79/100)*7/10);
        xValues[3] = ((width*87/100)*7/10);
        xValues[4] = ((width*60/100)*7/10);
        xValues[5] = ((width*26/100)*7/10);

        int[] yValues = new int[6];
        yValues[0] = ((height*44/100)*7/10);
        yValues[1] = ((height*19/100)*7/10);
        yValues[2] = ((height*29/100)*7/10);
        yValues[3] = ((height*64/100)*7/10);
        yValues[4] = ((height*88/100)*7/10);
        yValues[5] = ((height*79/100)*7/10);
        
        graphics.setColor(new Color(140, 83, 34));
//        graphics.translate(300, 200);
        graphics.fillPolygon(xValues, yValues, 6);
        
        // Circle lower left
        
//        graphics.setColor(new Color(255, 255, 255));
        graphics.fillOval((x - (width * 44 / 200)), (y + (height * 5 / 100)), (width * 27 / 100), (height * 27 / 100));
        
        // Circle lower right
//        graphics.fillOval((x - (width * 13 / 200)), (y + (height * 3 / 100)), (width * 27 / 100), (height * 27 / 100));
    }
}
