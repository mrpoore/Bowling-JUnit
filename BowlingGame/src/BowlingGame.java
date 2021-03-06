public class BowlingGame
{
	//Create private variables for ball and frame
	
	//Create array of Frames
    	int currentFrame, currentBall;
	Frame frames[] = new Frame[10];
	
	/**
	 * The constructor - Runs when a new BowlingGame object is created
	 * Initializes ball and frame
	 */
	public BowlingGame()
	{
		//initialize ball, frame 
		currentFrame = currentBall = 1;
	    
		//initialize the array of frames
		for (int i = 0; i < 9; i++) //for the first 8
		{
			frames[i] = new Frame(2); // create frames with 2 balls
		}
		//create the 10th frame with 3 balls
		frames[9] = new Frame(3);
	}

	/**
	 * A method called getCurrentFrame, 
	 * which returns the frame that the player is in. 
	 * This starts out at 1 and increases to 10. 
	 * When the game is over, this method should return 11.
	 * 
	 * @return the current frame <frame> as an int
	 */
	public int getCurrentFrame()
	{
		
		return currentFrame;
	}

	/**
	 * A method called getCurrentBall, 
	 * which returns the current ball the player is on within the current frame. 
	 * This should normally return either 1 or 2, but it might return 3 during frame 10 
	 * 
	 * @return the current ball <ball> as an int
	 */
	public int getCurrentBall()
	{
		return currentBall;
	}

	/**A method called scoreBall, which tells the BowlingGame that the bowler rolled a ball, 
	 * and takes in the number of pins knocked down by that ball as a parameter. 
	 * This method does not return a value, but it stores the number of pins scored with that ball, 
	 * and it updates the current frame and/or ball appropriately.
	 * 
	 * @param pins - accepts the number of pins knocked down as an int <pins>
	 */
	public void scoreBall(int pins)
	{
		//put the score in the current frame/ball array position
		frames[currentFrame-1].balls[currentBall-1]= pins;
		
		
		// if we're on ball 1 and (it's not a strike or we're on frame 10
		if (currentBall ==1 && (!isStrike(currentFrame-1) || currentFrame ==10))
		{
		    currentBall++;
		}
		else if (currentFrame ==10 && currentBall == 2 && (isStrike(10) || isSpare(10)))
		{
		    currentBall++;
		}
		else
		    currentFrame++;
		
		
		
		//if ball is 1 
			//if this frame isn't a strike
				//add 1 to ball
			//else
				//add 1 to frame
		//else if ball is 3
			//add 1 to frame
			//ball is 1
		//else (ball is 2
			//if frame is less than 10
				//ball is 1 
				//add one to frame
			//else (ball is at least 10) 
		
	}

	/**A method called getBallScore. This method takes two parameters (a frame number and a ball number)
	 * and returns the number of pins scored in the given frame and ball.
	 * 
	 * Requires parameters specifying the frame and ball for which we want the score
	 * @param frame 
	 * @param ball
	 * @return - returns the number of pins knocked down for that frame/ball
	 */
	public int getBallScore(int frame, int ball)
	{
		return frames[frame-1].balls[ball-1];
	}

	/**A method called isStrike, which takes a frame number as a parameter 
	 * and returns true if a strike was scored in that frame or false otherwise.
	 * 
	 * @param frame
	 * @return - returns true if the frame was a strike, false if it wasn't
	 */
	public boolean isStrike(int frame)
	{
		return frames[frame].balls[0]==10;
	}

	/**�	A method called isSpare, which works like isStrike, 
	 * but instead returns true if a spare was scored in the given frame.
	 * 
	 * @param frame
	 * @return - returns true if the frame was a spare, false if it wasn't
	 */
	public boolean isSpare(int frame)
	{
		return frames[frame].balls[0]+frames[frame].balls[1]==10 ;
	}
}

/**
 * This class provides the framework for individual frames
 * @author Mr. Richard Poore
 *
 */
class Frame
{
	public int[] balls;
	
	public Frame(int size)
	{
		balls = new int[size];
	}
}