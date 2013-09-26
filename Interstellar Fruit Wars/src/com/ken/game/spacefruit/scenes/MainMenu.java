package com.ken.game.spacefruit.scenes;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MainMenu extends BasicGameState {

	/* Enter State IDs */
	public static int Play = 1;
	
	@Override
	public void init(GameContainer gc, StateBasedGame sb)	throws SlickException {
		
		/* Prints to console which state was entered */
		System.out.println("State Entered: Main Menu");
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sb, Graphics g)	throws SlickException {
		
		g.drawImage(new Image("res\\title.png"), 20, 60);
		g.drawString("Press 'SPACE' to play", 300, 280);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sb, int alpha)	throws SlickException {
		
		Input inp = gc.getInput();
		
		if (inp.isKeyPressed(inp.KEY_SPACE)) {
			
			sb.enterState(Play);
			
		}
		
	}

	@Override
	public int getID() {
		
		return 0;
	
	}

}
