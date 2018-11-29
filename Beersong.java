class Beersong
{
	public static void main(String[] args)
	{
		int beernum = 5;
		String word = "bottles";

		while (beernum >= 0)
		{
			if (beernum==1)
			{
				word = "bottle";
			}
			if (beernum > 0)
			{
				System.out.println(beernum + " " + word + " " +"of beer on the wall");
				System.out.println("take one down.");
				System.out.println("Pass it around.");
			}
			else
			{
				System.out.println("No more bottles of beer on the wall.");
			}
			beernum--;
		}
	}
}
