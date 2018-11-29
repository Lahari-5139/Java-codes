import java.util.ArrayList;

public class SimpledotcomTestDrive
{
	public static void main (String[] args)
	{
		Simpledotcom dot = new Simpledotcom();

		int[] locations = {2,3,4};
		dot.setlocationcells(locations);

		String userguess = "2";

		String result = dot.checkyourself(userguess);

		String testresult = "failed";
	    
		if (result.equals("hit"))
		{
			testresult = "passed";
		}	

		System.out.println(testresult);
	
	}
}

/*class Simpledotcom
{
	int[] locationcells;
	int numofhits = 0;

	public void setlocationcells(int[] locs)
	{
		locationcells = locs;
	}

	public String checkyourself(String stringguess)
	{
		int guess = Integer.parseInt(stringguess);
		String result = "miss";
		for (int cell : locationcells)
		{
			if (guess == cell)
			{
				result = "hit";
				numofhits++;   // but there is a problem here...if the same is repeated 
				break;
			}
		}

		if (numofhits == locationcells.length)
		{
			result = "kill";
		}

		System.out.println(result);
		return result;
	}
}*/


public class Simpledotcom
{
	private ArrayList<String> locationcells;
	// now we dont need this "private int numofhits;"
	
	public void setlocationcells(ArrayList<String> loc)
	{
		locationcells = loc;
	}

	public String checkyourself(String userinput)
	{
		String result = "miss";
		int index = locationcells.indexOf(userinput);
		if (index >= 0)
		{
			locationcells.remove(index);
			if (locationcells.isEmpty())
			{
				result = "kill";
			}
			else
			{
				result = "hit";
			}
		}
		return result;
	}
}
