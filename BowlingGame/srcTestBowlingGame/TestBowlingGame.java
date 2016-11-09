import static org.junit.Assert.*;

import org.junit.*;

public class TestBowlingGame {

	
	@Test
	public void testStart()
	{
		BowlingGame g1 = new BowlingGame();
		assertTrue("Frame and Ball are not 1",g1.getCurrentBall()==1&&g1.getCurrentFrame()==1);
	}
	
	@Test
	public void testAdvBall()
	{
		BowlingGame g1 = new BowlingGame();
		g1.scoreBall(4);
		assertTrue("The ball didn't advance after the first score",g1.getCurrentBall()==2&&g1.getCurrentFrame()==1);
	}
	

}
