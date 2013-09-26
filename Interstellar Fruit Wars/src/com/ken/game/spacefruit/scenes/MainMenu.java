package com.ken.game.spacefruit.scenes;

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
	
	@Override
	public void init(GameContainer gc, StateBasedGame sb)	throws SlickException {}

	@Override
	public void render(GameContainer gc, StateBasedGame sb, Graphics g)	throws SlickException {
		
		g.drawImage(new Image(Strings.GameTitle), 20, 60);
		g.drawString(Strings.Play, 300, 280);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sb, int alpha)	throws SlickException {
		
		Input inp = gc.getInput();
		
		if (inp.isKeyPressed(Input.KEY_SPACE)) {
			
			sb.enterState(Play);	
		}	
	}
	
	@Override
	public int getID() {
		
		return 0;
	}
}
