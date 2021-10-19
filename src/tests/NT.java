package tests;

import frq.NumberTile;

public class NT extends NumberTile{
	
	private int left;
	private int up;
	private int right;
	private int down;
	
	public NT(int left, int up, int right, int down) {
		super();
		this.left = left;
		this.up = up;
		this.right = right;
		this.down = down;
	}
	
	@Override
	public void rotate() {
		int storage = left;
		left = down;
		down = right;
		right = up;
		up = storage;
	}
	
	@Override
	public int getLeft() {
		return left;
	}
	
	@Override
	public int getRight() {
		return right;
	}
	
	public int getUp() {
		return up;
	}
	
	public int getDown() {
		return down;
	}
	
	@Override
	public String toString() {
		String str = "  " + up + "\n";
		str += left + "   " + right + "\n";
		str += "  " + down; 
		return str;
	}
	
	
}
