package com.ken.game.spacefruit;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import com.ken.game.spacefruit.scenes.*;

public class Game extends StateBasedGame {

	/* Title */
	public static String gTitle = "Interstellar Fruit Wars";
	
	/* State IDS */
	public int Main_Menu = 0;
	public int Play = 1;
	
	public Game(String title) {
		
		super(title);
		
		this.addState(new MainMenu());
		this.addState(new Play());
		this.addState(new HelpMenu());
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		
		/* Initialise Start State */
		this.getState(Main_Menu).init(gc, this);
		
		/* Enter state */
		this.enterState(Main_Menu);
	}
	
	public static void main(String[] args) {
		
		AppGameContainer appgc;
		
		try {
			
			appgc = new AppGameContainer(new Game(gTitle));
			
			/* Settings */
			appgc.setDisplayMode(800, 650, false);
			appgc.setShowFPS(false);
			
			appgc.start();
			
		} catch(SlickException se) {
			
			se.printStackTrace();
		}	
	}
}
