class guessgame
{
	player p1;    //guessgame has three instance variables for the three player objects
	player p2;
	player p3;

	public void startgame()
	{
		p1 = new player();  //create three player objects and assign them to the three player instance variables
		p2 = new player();
		p3 = new player();

		int guessp1 = 0;    //declare three variables to hold the three guesses the players make
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false;   //declare three variables to hold a true or false based on the players answer
		boolean p2isRight = false; 
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 10); //make a target number that the players have to guess
		System.out.println("Iam thinking of a number between 0 and 9...");

		while(true)
		{
			System.out.println("Number to guess is " + targetNumber);

			p1.guess();  // call each player's guess() method
			p2.guess();
			p3.guess();

			guessp1 = p1.number;
			System.out.println("player one guessed " + guessp1);

			guessp2 = p2.number;
			System.out.println("player two guessed " + guessp2);

			guessp3 = p3.number;
			System.out.println("player three guessed " + guessp3);
			
			if (guessp1 == targetNumber)
			{
				p1isRight = true;
			}
			if (guessp2 == targetNumber)
			{
				p2isRight = true;
			}
			if (guessp3 == targetNumber)
			{
				p3isRight = true;
			}

			if (p1isRight || p2isRight || p3isRight)
			{
				System.out.println ("we have a winner");
				System.out.println("player1 is " + p1isRight);
				System.out.println("player2 is " + p2isRight);
				System.out.println("player3 is " + p3isRight);
				System.out.println("game is over!");
				break;
			}
			else
			{
				System.out.println("players will have to try again");
			}
		}
	}
}

class player
{
	int number = 0;
	public void guess()
	{
		number = (int) (Math.random() * 10);
		System.out.println("Iam guessing " + number);
	}
}

public class gamelauncher
{
	public static void main (String[] args)
	{
		guessgame game = new guessgame();
		game.startgame();
	}
}
