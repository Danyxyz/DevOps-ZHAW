package RockPaper;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RockPaperTest {
	
	private static RockPaperScissors r;
	
	@BeforeEach
		public void setUp() throws Exception {
		r = new RockPaperScissors();
	}

	@Test
	public void testGetMoveName() {
		String test = r.getMoveName(1);
		assertEquals("Schere", test);	
	}
	
	@Test
	//Same method as before but making a mistake on purpose
	public void wrongTestGetMoveName() {
		String test = r.getMoveName(1);
		assertEquals("Stein", test);	
	}

	@Test
	public void testWinEval() {	
		String test3and2 = r.winEvaluation(3, 2);
		assertEquals("Computer 1 (Papier) gewinnt", test3and2);
	}
	
	
	@Test
	public void testDraw() {	
		String draw = r.winEvaluation(2, 2);
		assertEquals("Unentschieden", draw);
		
	}
}
