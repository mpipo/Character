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
//        graphics.drawRect(x, y, 200, 200);
        // start drawing here
        // face
//        graphics.fillRect(200, 200, 100, 100);
        graphics.setColor(new Color(138, 71, 29));
//        graphics.fillOval(x, y, 400, 400);
//        graphics.fillOval(x, y, 250, 250);
        graphics.fillOval((x + (width * 56 / 100)), (y + (height * 6 / 100)), 100, 100);
        graphics.fillOval((x + (width * 35 / 100)), (y + (height * 50 /100)), 100, 100);
        graphics.fillOval((x + (width * 87 / 100)), (y + (height * 56 /100)), 100, 100);
        
        
//        int[] xValues = new int[6];
//        xValues[0] = 100;
//        xValues[1] = 100;
//        xValues[2] = 150;
//        xValues[3] = 200;
//        xValues[4] = 200;
//        xValues[5] = 150;
//
//        int[] yValues = new int[6];
//        yValues[0] = 100;
//        yValues[1] = 150;
//        yValues[2] = 200;
//        yValues[3] = 200;
//        yValues[4] = 150;
//        yValues[5] = 100;
        
        int[] xValues = new int[6];
        xValues[0] = width;
        xValues[1] = width;
        xValues[2] = ((width * 3 / 2));
        xValues[3] = ((width * 2));
        xValues[4] = ((width * 2));
        xValues[5] = ((width * 3 / 2));

        int[] yValues = new int[6];
        yValues[0] = 100;
        yValues[1] = 150;
        yValues[2] = 185;
        yValues[3] = 150;
        yValues[4] = 100;
        yValues[5] = 65;
        
        
//        graphics.setColor(Color.);
        graphics.setColor(new Color(138, 71, 29));
        
        Graphics2D g2d = (Graphics2D)graphics;
        g2d.rotate(50);
        g2d.fillPolygon(xValues, yValues, xValues.length);
        
        
        
//        graphics.fillPolygon();
//        System.out.println((x + (width * 8/7)));
        
    }
}
