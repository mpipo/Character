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
        xValues[0] = ((width*28/100)*7/10);
        xValues[1] = ((width*75/100)*7/10);
        xValues[2] = ((width*97/100)*7/10);
        xValues[3] = ((width*75/100)*7/10);
        xValues[4] = ((width*28/100)*7/10);
        xValues[5] = ((width*5/100)*7/10);

        int[] yValues = new int[6];
        yValues[0] = ((height*10/100)*7/10);
        yValues[1] = ((height*10/100)*7/10);
        yValues[2] = ((height*50/100)*7/10);
        yValues[3] = ((height*90/100)*7/10);
        yValues[4] = ((height*90/100)*7/10);
        yValues[5] = ((height*50/100)*7/10);
        
        graphics.setColor(new Color(140, 83, 34));
//        graphics.translate(300, 200);
        graphics.fillPolygon(xValues, yValues, 6);
        
        // Circle lower left
        
//        graphics.setColor(new Color(255, 255, 255));
        graphics.fillOval((x - (width * 56 / 200)), (y + (height * 14 / 200)), (width * 32 / 100), (height * 32 / 100));
        
        // Circle lower right
        graphics.fillOval((x + (width * 34 / 200)), (y + (height * 14 / 200)), (width * 32 / 100), (height * 32 / 100));
        
        // Circle upper
        
        graphics.fillOval((x - (width * 21 / 200)), (y - (height * 25 / 100)), (width * 43 / 100), (height * 43 / 100));
        
        // left eye
        graphics.setColor(new Color(255, 255, 255));
        graphics.fillOval((x + (width * 2 / 200)), (y - (height * 5 / 100)), (width * 7 / 100), (height * 15 / 100));
        // left eyeball
        graphics.setColor(new Color(0, 0, 0));
        graphics.fillOval((x + (width * 5 / 200)), (y - (height * 10 / 200)), (width * 4 / 100), (height * 4 / 100));
//        right eye
        graphics.setColor(new Color(255, 255, 255));
        graphics.fillOval((x + (width * 35 / 200)), (y - (height * 5 / 100)), (width * 7 / 100), (height * 15 / 100));
        graphics.setColor(new Color(0, 0, 0));
        graphics.fillOval((x + (width * 38 / 200)), (y - (height * 10 / 200)), (width * 4 / 100), (height * 4 / 100));
        
//        graphics.
    }
}
