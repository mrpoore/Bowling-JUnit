import org.junit.Test;
import static org.junit.Assert.*;

public class TestBowling
{
	

	@Test
	public void testStartGame()
	{
		BowlingGame g = new BowlingGame();
		assertEquals(1, g.getCurrentFrame());
		assertEquals(1, g.getCurrentBall());
		for (int i = 0; i < 18; i++)
		{
		    int score = (int)(Math.random()*6);
		    g.scoreBall(score);
		}
		g.scoreBall(10);
		System.out.println(g.getBallScore(10,1)+ " " + g.getCurrentFrame());
		g.scoreBall(3);
		//g.scoreBall(4);
		g.displayGame();
	}
}
