import java.util.*;

class duplicateCheck
{
	static void duplicate(int arr[])
	{
		// Creates an empty HashSet
		HashSet<Integer> hset = new HashSet<Integer>();

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++)
		{
		    //check if the HashSet contains the given Number
			boolean c = hset.contains(arr[i]);

			// If the number does not exist, add it in the HashSet
			if (c == false)
			hset.add(arr[i]);

			// If elements already exists in HashSet, print the duplicate number
			else
			{
			    System.out.println(arr[i]);
			    break;
			}
		}

	}

	// Driver method to test above method
	public static void main (String[] args)
	{
		int arr[] = {3, 1, 3, 2, 4};
		duplicate(arr);
	}
}