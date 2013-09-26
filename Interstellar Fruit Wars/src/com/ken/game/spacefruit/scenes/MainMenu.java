package com.ken.game.spacefruit.scenes;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import com.ken.game.spacefruit.vars.Strings;

public class MainMenu extends BasicGameState {

	/* Enter State IDs */
	public static int Play = 1;
	public static int Help = 2;
	public static int About = 3;
	
	/* Exit */
	public static int Exit = 0;
	
	/* Strings */
	public static String MouseDebug = "- No Input";
	public static String DebugSettings = "Debug Settings :";
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg)	throws SlickException {}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)	throws SlickException {
		
		int xPos = Mouse.getX();
		int yPos = Mouse.getY();
		
		/* Main Menu */
		g.drawImage(new Image(Strings.GameBackground), 0, 0);
		g.drawImage(new Image(Strings.GameTitle), 20, 60);
		g.drawString(Strings.Play, 300, 280);
		g.drawRect(285, 266, 205, 44);
		
		/* Help Menu */
		g.drawString(Strings.Help, 365, 370);
		g.drawRect(285, 356, 205, 44);
		
		/* Quit */
		g.drawString(Strings.Quit, 365, 460);
		g.drawRect(285, 446, 205, 44);
		
		/* About */
		g.drawString("About", 66, 560);
		g.drawRect(25, 548, 128, 44);
		
		/** Debug Settings */
		g.drawString(DebugSettings, 640, 10);
		
		/* Mouse Debug */
		g.drawString(MouseDebug, 520, 40);
		
		MouseDebug = "Mouse Position X : " + xPos + " Y : " + yPos;
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int alpha)	throws SlickException {
		
		int xPos = Mouse.getX();
		int yPos = Mouse.getY();
		
		int LeftClick = Input.MOUSE_LEFT_BUTTON;
		
		Input inp = gc.getInput();
		
		/* Start Game */
		if ((xPos > 285 && xPos < 490) && (yPos > 341 && yPos < 383)) {
			
			if (inp.isMousePressed(LeftClick)) {
				
				sbg.enterState(Play);
			}
		}
		
		/* Help Menu */
		if ((xPos > 285 && xPos < 490) && (yPos > 250 && yPos < 294)) {
			
			if (inp.isMousePressed(LeftClick)) {
				
				sbg.enterState(Help);
			}
		}
		
		/* Quit */
		if ((xPos > 285 && xPos < 490) && (yPos > 159 && yPos < 203)) {
			
			if (inp.isMousePressed(LeftClick)) {
				
				System.exit(Exit);
			}
		}
		
		/* About */
		if ((xPos > 25 && xPos < 102) && (yPos > 57 && yPos < 101)) {
			
			if (inp.isMousePressed(LeftClick)) {
				
				sbg.enterState(About);
			}
		}
	}
	
	@Override
	public int getID() {
		
		return 0;
	}
}
