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
        
        //Call initialize method on the array, this will initialize each element of the array to a user specified value (Double type).
        initializeArray(stockArray);
        
        //Check array elements were created
        /*
        for(Double e : stockArray)
        {
        	System.out.printf("%.2f\n", e);
        }
        */
        
        /*
         * Average cost (AC), also known as average total cost (ATC), is the average cost per unit of output. 
         * To find it, divide the total cost (TC) by the quantity the firm is producing (Q)
         */
        
        input.close();
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
}