//Stevie Berryman
package my_package;
//I chose not to import java.lang.System.out because i am trying to get in the habit of using the correct syntax
import java.util.*;
public class Main {

	public static void main(String[] args) {
        //Declare array variables
        Double[] stockArray;
        int stockCount;        
        
        //Create a Scanner to gather user integer to store as array length
        Scanner input = new Scanner(System.in);
        System.out.print("How many stocks to enter price for: ");
        stockCount = input.nextInt();
        stockArray = new Double[stockCount];
        //Check array.length
        //System.out.println("You chose " + stockArray.length + " stocks"); 
        input.close();         
        
        //Call initialize method on the array, this will initialize each element of the array to a user specified value (Double type).
        initializeArray(stockArray);
        
        //Check array elements were created
        /*
        for(Double e : stockArray)
        {
        	System.out.printf("%.2f\n", e);
        }
        */
        
        //Calculate values
        avgMinBetweenElement(stockArray);        
    }    
	//Create a loop method to initialize array elements
	public static void initializeArray(Double[] arr)
	{
		//Create scanner before the for loop, I was getting errors when i put this inside the loop
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++)
		{
			/*
			 * I Used format to output each input prompt because of the # change in each prompt.
			 * I Used i + 1 just for user visibility as it was starting from 0
			 * this did now effect the prompt message(as in number of prompts presented were still user selected amount)			
			 */	 
			System.out.printf("Enter price for stock #%d: ", i + 1);
			arr[i] = input.nextDouble();
		}
		input.close();
	}
	//Create a method for calculating and iterating the array
	public static void avgMinBetweenElement(Double[] arr) 
	{
		Double averageElement = 0.00;
	    Double minimumElement = arr[0];
        int betweenCount = 0;
        
        //Create the loop to calculate values
        //i used 3 for loops because i was getting errors trying to cram all 3 calculations into 1.
        //Find sum of each element for the average value
        for(Double i : arr)
        {
        	averageElement = averageElement + i;
        }
        
        //Find minimum and between values
        for(int e = 0; e < arr.length; e++)
        {
        	if(arr[e] < minimumElement)
        	{
        		minimumElement = arr[e];
        	}
        }
        //Find number of values between 1.5 and 30
        for(int j = 0; j < arr.length; j++)
        {
        	if(arr[j] >= 1.5 && arr[j] <= 35)
        	{
        		betweenCount++;
        	}
        }
        //Print results to screen
        System.out.printf("Average price: %.2f out of %d stocks\n", (averageElement / arr.length), arr.length);
        System.out.printf("Minimum price: %.2f\n", minimumElement);
        System.out.printf("Number of stocks priced between 1.5-35: %d\n", betweenCount);
    }
}