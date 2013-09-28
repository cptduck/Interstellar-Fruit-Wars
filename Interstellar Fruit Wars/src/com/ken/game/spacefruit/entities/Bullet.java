package com.ken.game.spacefruit.entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import com.ken.game.spacefruit.vars.Strings;

public class Bullet extends Entity {

	public static int bulletY;
	private static int bulletX;
	
	
	public Bullet(int x, int y) {
		
		super(x, y);
		this.bulletX = Player.playerX;
		this.bulletY = Player.playerY;
		
	}
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {}
	
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
			
			g.drawImage(new Image(Strings.Bullet), bulletX, bulletY);
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException { }
	
	
}
