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
	    int HealthX = 731;
	    int HealthY = 187;

			//health coordinates for my screen
			//731x
			//187 y

	    int SpawnerX = 213;
	    int SpawnerY = 165;

			//spawner coordinates for my screen
			//213 x
			//165 y


		int spawnChaosEleX = 127;
		int spawnChaosEleY = 265;

	   // Color color = Color.decode("41371E");




        try{
        	robot = new Robot();
		} catch (AWTException e){
        	e.printStackTrace();
		}

		while(true){
			robot.delay(15000);
			click(SpawnerX, SpawnerY);   //Hover OverSpawner
			robot.delay(5000);
			click(spawnChaosEleX, spawnChaosEleY);  // Click spawn close by
			robot.delay(60000);
			click(HealthX, HealthY);  // Health
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

		// stop();

    }
    public static void click(int x, int y){
		robot.mouseMove(x, y);
		robot.delay(1000);
		robot.mousePress(MouseEvent.BUTTON1_MASK);
		robot.mouseRelease(MouseEvent.BUTTON1_MASK);
	}

//	public static void stop(){
//		exit();
//	}
}
