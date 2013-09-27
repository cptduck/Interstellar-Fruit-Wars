package com.ken.game.spacefruit.scenes;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

import com.ken.game.spacefruit.vars.Strings;

public class HelpMenu extends BasicGameState {
	
	/* Mouse Clicks */
	public static int LeftClick = Input.MOUSE_LEFT_BUTTON;
	
	/* State IDS */
	public static int MainMenu = 0;
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		
		int xPos = Mouse.getX();
		int yPos = Mouse.getY();
		
		g.drawString("Help Menu", 365, 8);
		
		/* Movement Keys*/
		g.drawString("Movement Keys : ", 20, 120);
		g.drawString(". Move Left 'D' ", 20, 150);
		g.drawString(". Move Right 'A' ", 20, 180);
		g.drawString(". Move Down 'S' ", 20, 210); 
		g.drawString(". Move Up 'W' ", 20, 240);
		
		/* Action Keys */
		g.drawString("Action Keys : ", 20, 330);
		g.drawString(". Fire 'Space Bar' ", 20, 360);
		
		/* Back Button */
		g.drawString("Back", 693, 548);
		g.drawRect(645, 535, 135, 44);
		
		/** Debug Settings */
		g.drawString(Strings.DebugSettings, 640, 10);
		
		/* Mouse Debug */
		g.drawString(Strings.MouseDebug, 520, 40);
		
		Strings.MouseDebug = "Mouse Position X : " + xPos + " Y : " + yPos;
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int arg2) throws SlickException {
		
		int xPos = Mouse.getX();
		int yPos = Mouse.getY();
		
		Input input = gc.getInput();
		
		if ((xPos > 645 && xPos < 779) && (yPos > 20 && yPos < 197)) {
			
			if(input.isMousePressed(LeftClick)) {
				
				sbg.enterState(MainMenu, new FadeOutTransition(), new FadeInTransition());
			}
		}
	}

	@Override
	public int getID() {
		
		return 2;
	}
}

