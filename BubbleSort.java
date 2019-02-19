/**
 * BubbleSort.java
 * James Jutt
 * 2/12/19
 */
import java.util.*;
public class BubbleSort
{
    public static void main(String[] args) 
    {
        // Variables and Constants
        int[] someNums = new int[5];
        int comparisonsToMake = someNums.length - 1;
        int a;
        int b;
        int temp;
        Scanner input = new Scanner(System.in);

        // For loop that will ask the user to enter in up to 5 numbers, we store those numbers in our someNums array
        for (a = 0; a < someNums.length; a++) 
        {
            System.out.print("Enter number " + (a + 1) +  " >> ");
            someNums[a] = input.nextInt();
        }
        // Calls the display method which accepts the array and the number of iterations the sort loop has done so far
        display(someNums, 0);

        // Bubble sort algorithm
        for (a = 0; a < someNums.length - 1; a++) 
        {
            for (b = 0; b < comparisonsToMake; b++) 
            {
                if (someNums[b] > someNums[b + 1])
                {                
                    temp = someNums[b];
                    someNums[b] = someNums[b + 1];
                    someNums[b + 1] = temp; 
                } 
            } // b for loop is finished   
            display(someNums, (a + 1));
            --comparisonsToMake;
        } // a for loop is finished
    }
    public static void display(int[] someNums, int a) 
    {
        System.out.print("Iteration " + a + ": ");
        for (int x = 0; x < someNums.length; x++) 
        {
            System.out.print(someNums[x] + " ");    
        }
        System.out.println();
    }
}