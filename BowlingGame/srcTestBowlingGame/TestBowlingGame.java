import static org.junit.Assert.*;

import org.junit.*;

public class TestBowlingGame {

	
	@Test
	public void testConstruction() {
		BowlingGame g1 = new BowlingGame();
		assertTrue("The ball and frame are not 1", g1.getCurrentFrame()==1&&g1.getCurrentBall()==1);
	}
	
	@Test
	public void testAdvanceBall() {
		BowlingGame g1 = new BowlingGame();
		g1.scoreBall(4);
		assertTrue("The ball didn't advance to ball 2", g1.getCurrentFrame()==1&&g1.getCurrentBall()==2);
	}
	

}
