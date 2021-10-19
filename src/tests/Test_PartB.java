package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class Test_PartB {

	@Test
	@DisplayName("Test #1 add a few tiles")
	void test1() {
		TG game = new TG();
		
		NT[] gameTiles = {new NT(4, 2, 3, 9),
						  new NT(6, 2, 4, 4),
						  new NT(3, 4, 0, 9),
						  new NT(6, 2, 5, 1),
						  new NT(0, 6, 2, 6),
						  new NT(6, 2, 9, 5),
						  new NT(3, 5, 6, 3)};
		
		for (NT tile : gameTiles) {
			game.addTile(tile);
		}
		
		NT[] tiles = {new NT(2, 5, 6, 3),
					  new NT(7, 3, 2, 4),
					  new NT(5, 2, 0, 7),
					  new NT(2, 7, 4, 3),
					  new NT(3, 6, 4, 8)};
		int[] pos = {5, 2, 5, 0, 11};
		int left = 0, right = 0, up = 0, down = 0;
		NT originalTile = new NT(left, up, right, down);
		String[] responses = {"Should have fit wihout rotating",
							 "Should have fit after 1 rotation",
							 "Should have fit after 2 rotations",
							 "Should have fit after 3 rotations",
							 "Should have fit at the end after 2 rotations"};
		
		int i = -2;
		
		try {
			
			
			
			for (i = 0; i < tiles.length; i++) {
				left = tiles[i].getLeft();
				right = tiles[i].getRight();
				up = tiles[i].getUp();
				down = tiles[i].getDown();
				originalTile = new NT(left, up, right, down);
				
				game.insertTile(tiles[i]);
				
				Assertions.assertTrue(game.board.get(pos[i]) == tiles[i]);
				
			}
			
			System.out.println("Test #1: Passed\n\n\n\n");
			
		}
		catch (Error e) {
			
			System.out.println("Test #1: " + responses[i]);
			System.out.println("\nTile to add:");
			System.out.println(originalTile);
			System.out.println("\nGame board:");
			System.out.println(game + "\n\n\n\n");
			Assertions.fail();
			
		}
		
		
	}
	
	
	
	
//	@Test
//	@DisplayName("Test #2 add 400 random tiles")
//	void test2() {
//		
//		TG game = new TG();
//		
//		NT[] gameTiles = {new NT(4, 2, 3, 9),
//						  new NT(6, 2, 4, 4),
//						  new NT(3, 4, 0, 9),
//						  new NT(6, 2, 5, 1),
//						  new NT(0, 6, 2, 6),
//						  new NT(6, 2, 9, 5),
//						  new NT(3, 5, 6, 3)};
//		
//		for (NT tile : gameTiles) {
//			game.addTile(tile);
//		}
//		
//		int left = 0, up = 0, right = 0, down = 0;
//		
//		for (int i = 0; i < 400; i++) {
//			left = (int) (Math.random() * 9 + 1);
//			up = (int) (Math.random() * 9 + 1);
//			right = (int) (Math.random() * 9 + 1);
//			down = (int) (Math.random() * 9 + 1);
//			game.insertTile(new NT(left, up, right, down));
//		}
//		
//		
//		
//		
//	}

}
