package com.ken.game.spacefruit.scenes;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Play extends BasicGameState {

	/* State IDs */
	public static int GameOver = 2;
	
	@Override
	public void init(GameContainer gc, StateBasedGame sb)	throws SlickException {}

	@Override
	public void render(GameContainer gc, StateBasedGame sb, Graphics g)	throws SlickException {
		
		/* Game Background Images */
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
