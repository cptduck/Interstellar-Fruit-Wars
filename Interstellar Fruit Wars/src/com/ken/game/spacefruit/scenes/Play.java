package com.ken.game.spacefruit.scenes;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import com.ken.game.spacefruit.entities.Player;
import com.ken.game.spacefruit.vars.Strings;

public class Play extends BasicGameState {

	/* State IDs */
	public static int GameOver = 2;
	
	/* Player Object */
	private Player player;
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg)	throws SlickException {
		
		player = new Player(8, 20);
		
		player.setcurrentHealth(100);
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)	throws SlickException {
		
		/* Render Background */
		g.drawImage(new Image(Strings.GameBackground), 0, 0);
		
		/* Render Player */
		player.render(gc, sbg, g);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int alpha)	throws SlickException {
		
		/* Update Player */
		player.update(gc, sbg, alpha);
		
		Input inp = gc.getInput();
		
	}

	@Override
	public int getID() {
		
		return 1;
	}
}
