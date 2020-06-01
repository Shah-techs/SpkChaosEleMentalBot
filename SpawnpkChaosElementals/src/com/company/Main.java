package com.company;

import java.awt.*;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.MouseInfo;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;

public class Main {

	public static Robot robot = null;
    public static void main(String[] args) throws IOException, AWTException {
	    /*
	    * X and Y cordinates of the spawnpk client screen
	    * Find x and y cordinates of spawner,
	    * click spawner
	    * click spawn
	    * Wait until all dead
	    * Every 2 min click on hp
	    * check for guard*/

        //Cordinates
	    int HealthX = 726;
	    int HealthY = 40;

	    int SpawnerX = 182;
	    int SpawnerY = 212;
	   // Color color = Color.decode("41371E");




        try{
        	robot = new Robot();
		} catch (AWTException e){
        	e.printStackTrace();
		}

		while(true){
			robot.delay(15000);
			klick(253, 264);   //Hover OverSpawner
			robot.delay(5000);
			klick(121, 350);  // Klick spawn clouse by
			robot.delay(60000);
			klick(731, 273);  // Health
			robot.delay(60000);
			robot.delay(10000);

			/*
			robot.mouseMove(253, 328);
			if(MouseInfo.getPointerInfo().getLocation().x != 253 &&
					MouseInfo.getPointerInfo().getLocation().y != 328){
				robot.mouseMove(robot.getPixelColor(65, 55, 30));
			}
			else {
				continue;
			}

			 */


		}

    }
    public static void klick(int x, int y){
		robot.mouseMove(x, y);
		robot.delay(1000);
		robot.mousePress(MouseEvent.BUTTON1_MASK);
		robot.mouseRelease(MouseEvent.BUTTON1_MASK);
	}
}
