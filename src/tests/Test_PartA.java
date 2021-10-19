package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*	;

class Test_PartA {

	@Test
	@DisplayName("Test #1 (board is empty)")
	void test1() {
		
		TG game = new TG();
		
		NT tile = new NT(1, 2, 3, 4);
		
		int answer = -2;
		
		try {
			
			answer = game.getIndexForFit(tile);
			
			Assertions.assertEquals(answer, 0);
			
			System.out.println("Test #1: Passed\n\n\n\n");
			
		}
		catch (Error e) {
			System.out.println("Test #1 did not return correct position"
					         + "  Expected Return = 0"
							 + "  Your Return =     " + answer + "\n\n\n\n");
			Assertions.fail();
		}
		

	}

	
	@Test
	@DisplayName("Test #2 (add to beginning)")
	void test2() {
		
		TG game = new TG();
		
		NT[][] gameTiles = {{new NT(4, 2, 3, 9),
							 new NT(6, 2, 4, 4),
							 new NT(3, 4, 0, 9)},
							{new NT(6, 2, 5, 1),
							 new NT(0, 6, 2, 6),
							 new NT(6, 2, 9, 5),
							 new NT(3, 5, 6, 3)}
							 };
		
		NT[] testTiles = {new NT(5, 3, 4, 2),
						  new NT(5, 3, 6, 9)
						  };
		int[] pos = {0, 0};
		int answer = -2;
		int i = 0;
		
		try {
			
			for (i = 0; i < testTiles.length; i++) {
				
				game = new TG();
				
				for (NT tile : gameTiles[i]) {
					game.addTile(tile);
				}
				
				answer = game.getIndexForFit(testTiles[i]);
				
				Assertions.assertEquals(answer, pos[i]);
				
				
			}
			System.out.println("Test #2: Passed\n\n\n\n");
			
		}
		catch (Error e) {
			System.out.println("Test #2 did not return correct position\n"
					         + "  Expected Return = " + pos[i] + "\n"
							 + "  Your Return     = " + answer);
			System.out.println("\nTile to add:");
			System.out.println(testTiles[i]);
			System.out.println("\nGame board:");
			System.out.println(game + "\n\n\n\n");
			Assertions.fail();
		}
		

	}
	
	
	@Test
	@DisplayName("Test #3 (add to end)")
	void test3() {
		TG game = new TG();
		
		NT[][] gameTiles = {{new NT(4, 2, 3, 9),
							 new NT(6, 2, 9, 4),
							 new NT(3, 4, 9, 0)},
							{new NT(2, 2, 5, 1),
							 new NT(0, 6, 2, 6),
							 new NT(6, 2, 9, 5),
							 new NT(3, 5, 6, 3)}
							 };
		
		NT[] testTiles = {new NT(9, 3, 7, 2),
						  new NT(6, 3, 6, 9)
						  };
		int[] pos = {gameTiles[0].length, gameTiles[1].length};
		int answer = -2;
		int i = 0;
		
		try {
			
			for (i = 0; i < testTiles.length; i++) {
				
				game = new TG();
				
				for (NT tile : gameTiles[i]) {
					game.addTile(tile);
				}
				
				answer = game.getIndexForFit(testTiles[i]);
				
				Assertions.assertEquals(answer, pos[i]);
				
			}
			System.out.println("Test #3: Passed\n\n\n\n");
			
		}
		catch (Error e) {
			System.out.println("Test #3 did not return correct position\n"
					         + "  Expected Return = " + pos[i] + "\n"
							 + "  Your Return     = " + answer);
			System.out.println("\nTile to add:");
			System.out.println(testTiles[i]);
			System.out.println("\nGame board:");
			System.out.println(game + "\n\n\n\n");
			Assertions.fail();
		}
	}
	
	
	
	@Test
	@DisplayName("Test #4 (add to middle)")
	void test4() {
		
		TG game = new TG();
		
		NT[][] gameTiles = {{new NT(4, 2, 3, 9),
							 new NT(6, 2, 9, 4),
							 new NT(3, 4, 9, 0)},
							{new NT(4, 2, 3, 9),
							 new NT(6, 2, 7, 4),
							 new NT(3, 4, 9, 0)},
							{new NT(2, 2, 5, 1),
							 new NT(0, 6, 2, 6),
							 new NT(6, 2, 9, 5),
							 new NT(3, 5, 6, 3)},
							{new NT(2, 2, 5, 1),
							 new NT(0, 6, 2, 6),
							 new NT(6, 2, 9, 5),
							 new NT(3, 5, 6, 3)},
							{new NT(2, 2, 5, 1),
							 new NT(0, 6, 2, 6),
							 new NT(6, 2, 9, 5),
							 new NT(3, 5, 6, 3)}
							 };

		NT[] testTiles = {new NT(3, 2, 6, 4),
						  new NT(7, 6, 3, 3),
						  new NT(5, 1, 0, 7),
						  new NT(2, 5, 6, 0),
						  new NT(9, 6, 3, 2)
						  };
		
		int[] pos = {1, 2, 1, 2, 3};
		int answer = -2;
		int i = 0;
		
		try {
			
			for (i = 0; i < testTiles.length; i++) {
				
				game = new TG();
				
				for (NT tile : gameTiles[i]) {
					game.addTile(tile);
				}
				
				answer = game.getIndexForFit(testTiles[i]);
				
				Assertions.assertEquals(answer, pos[i]);
				
			}
			System.out.println("Test #4: Passed\n\n\n\n");
			
		}
		catch (Error e) {
			
			System.out.println("Test #4 did not return correct position\n"
					         + "  Expected Return = " + pos[i] + "\n"
							 + "  Your Return     = " + answer);
			System.out.println("\nTile to add:");
			System.out.println(testTiles[i]);
			System.out.println("\nGame board:");
			System.out.println(game + "\n\n\n\n");
			Assertions.fail();
		}
		
		
	}
	
}
