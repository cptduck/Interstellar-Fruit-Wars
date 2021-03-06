package com.ken.game.spacefruit.entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import com.ken.game.spacefruit.vars.Strings;

public class Player extends Entity {
	
	/** Key Settings */
	
	/* Movement */
	private static final int Forward = Input.KEY_D;
	private static final int Backwards = Input.KEY_A;
	private static final int Upwards = Input.KEY_W;
	private static final int Downwards = Input.KEY_S;
	private static final int Fire = Input.KEY_SPACE;
	
	/* Debug Exit */
	private static final int Exit = Input.KEY_ESCAPE;
	
	/** Player Settings */
	private int MOVE_SPEED = 1;
	private int currentHealth;
	private int bulletX;
	private int bulletY;
	private boolean isFiring;
	
	public Player(int x, int y) {
		
		super(x, y, 8, 20);
		
		this.currentHealth = 100;
		this.x = x;
		this.y = y;

	}
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {}
	
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		
		g.scale(2, 2);
		g.drawImage(new Image(Strings.Player), x, y);
		
		if (isFiring) {

			g.drawImage(new Image(Strings.Bullet), bulletX + 8, bulletY);
			bulletY--;
		
		}
		
	}
	
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
		Input input = gc.getInput();
		
		/** Movement */
		if(input.isKeyDown(Forward)) {
			
			x += MOVE_SPEED;
			
			if(x > 368) {
				
				x -= 1;
			}
		}
		
		if(input.isKeyDown(Backwards)) {
			
			x -= MOVE_SPEED;
			
			if(x < 1) {
				
				x += 1;
			}
		}
		
		if (input.isKeyDown(Upwards)) {
			
			y -= MOVE_SPEED;
		
			if(y < 1) {
				
				y += 1;
			}
		}
		
		if (input.isKeyDown(Downwards)) {
			
			y += MOVE_SPEED;
		
			if(y > 295) {
				
				y -= 1;
			}
		}
		
		if (input.isKeyPressed(Fire)) {

			isFiring = true;
			bulletX = x;
			bulletY = y;

	
		}
		
		/** Debug Exit */
		if(input.isKeyDown(Exit)) {
			
			sbg.enterState(0);
			
		}
		
		playerPos();
	}
	
	
	public void playerPos() {
		
		System.out.println("Player X : " + x + "," + " Player Y : " + y);
	}
	
	public int currentHealth() {
		
		return currentHealth;
	}
	
	public void setcurrentHealth(int currentHealth) {
		
		this.currentHealth = currentHealth;
	}
}


