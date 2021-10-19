package tests;

import java.util.ArrayList;
import frq.NumberTile;
import frq.TileGame;

public class TG extends TileGame{
	
	public TG() {
		super();
	}
	
	public void addTile(NT tile) {
		board.add(tile);
		
	}
	
	@Override
	public String toString() {
		String str = "";
		
		//print Tile Number
		for (int i = 0; i < board.size(); i++) {
			str += String.format("#%-7d", i);
		}
		str += "\n";
		//print top
		for (int i = 0; i < board.size(); i++) {
			str += "  " + ((NT) board.get(i)).getUp() + "     ";
		}
		str += "\n";
		//print middle
		for (int i = 0; i < board.size(); i++) {
			str += ((NT) board.get(i)).getLeft() + "   " + ((NT) board.get(i)).getRight() + "   ";
		}
		
		str += "\n";
		//print bottom
		for (int i = 0; i < board.size(); i++) {
			str += "  " + ((NT) board.get(i)).getDown() + "     ";
		}
		
		
		return str;
	}
	
	
	
}
