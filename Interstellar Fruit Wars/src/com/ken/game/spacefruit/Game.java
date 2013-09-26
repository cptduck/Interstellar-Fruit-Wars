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
		
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		
		/* Init Startup state*/
		this.getState(Main_Menu).init(gc, this);
		
		/* Enter state */
		this.enterState(Main_Menu);
		
		
	}
	
	public static void main(String[] args) {
		
		AppGameContainer appgc;
		
		/* Starts game and sets container size and etc */
		
		try {
			
			appgc = new AppGameContainer(new Game(gTitle));
			appgc.setDisplayMode(800, 650, false);
			appgc.setShowFPS(false);
			appgc.start();
			
		} catch(SlickException se) {
			
			se.printStackTrace();
			
		}
		
	}
	
	

}
