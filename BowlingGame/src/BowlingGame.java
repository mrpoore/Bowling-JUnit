public class BowlingGame
{
	public BowlingGame()
	{
	}

	/*returns the frame that the player is in. 
	This starts out at 1 and increases to 10. 
	When the game is over, this method should return 11.*/
	public int getCurrentFrame()
	{
		return 0;
	}

	/*returns the current ball the player is on 
	 * within the current frame. 
	 * This should normally return either 1 or 2, 
	 * but it might return 3 during frame 10 
	 * (as noted above)..*/
	public int getCurrentBall()
	{
		return 0;
	}

	/*tells the BowlingGame that the bowler rolled a ball, 
	 * and takes in the number of pins knocked down 
	 * by that ball as a parameter. 
	 * This method does not return a value, 
	 * but it stores the number of pins scored with that ball, 
	 * and it updates the current frame and/or ball appropriately.*/
	public void scoreBall(int pins)
	{
	}

	/*This method takes two parameters 
	 * (a frame number and a ball number) 
	 * and returns the number of pins scored 
	 * in the given frame and ball.*/
	public int getBallScore(int frame, int ball)
	{
		return 0;
	}

	public boolean isStrike(int frame)
	{
		return false;
	}
	
/*works like isStrike, but instead 
 * returns true if a spare was scored 
 * in the given frame.*/
	public boolean isSpare(int frame)
	{
		return false;
	}
}
