package com.ken.game.spacefruit.scenes;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Play extends BasicGameState {

	/* Enter State IDs */
	public static int GameOver = 2;
	
	
	@Override
	public void init(GameContainer gc, StateBasedGame sb)	throws SlickException {
		
		/* Prints to console which state was entered */
		System.out.println("State Entered: Play");
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sb, Graphics g)	throws SlickException {
		
		/* Game Background images */
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sb, int alpha)	throws SlickException {
		
		Input inp = gc.getInput();
		
	}

	@Override
	public int getID() {
		
		return 1;
	
	}


}
