/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Graphics;

/**
 *
 * @author panpjp
 */
public class AwesomeFace {

    public AwesomeFace(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    private int x;
    private int y;
    
    public void draw(Graphics graphics) {
        graphics.drawRect(x, y, 200, 200);
        // start drawing here
    }
}
