import java.util.*;


public class binarysearch {
    public static void main (String args[]){
        int number_ofElements;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number of elements: ");
        number_ofElements=input.nextInt();

        int [] z = new int [number_ofElements]; // array to store the elements entered by the users
        System.out.println("Enter the elements of array: ");

        for (int i =0; i<number_ofElements;i++) 
        z[i]=input.nextInt(); //to store elements entered in the array

        System.out.println("Enter value to be searched: ");
        int value=input.nextInt();

        int low = 0;
        int high = number_ofElements-1;
        int middle= low+ (high-low)/2;

        while( low <= high )
      {
         if ( z[middle] < value )
           low = middle + 1;
         else if ( z[middle] == value )
         {
           System.out.println(value + " is present at location " + (middle + 1) + ".");
           break;
         }
         else
         {
             high = middle - 1;
         }
         middle = low+ (high-low)/2;
      }
      if ( low > high )
          System.out.println(value + " is not found.\n");
   }
}
    

    
    
