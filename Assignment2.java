
import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++){
             arr[i] = sc.nextInt();
        }

        System.out.println("Enter an array index to print the element: ");
        int ind = sc.nextInt();

        try{
            for(int i = 0 ; i < n ; i++){
                if(arr[i] == arr[ind]){
                    System.out.println("Element: " +arr[ind]);
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index number.");
        }
    }
}
