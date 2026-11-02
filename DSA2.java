import java.util.HashSet;
import java.util.Set;

public class DSA2 {
    public static void main(String[] args) {

        int[] ids = {101 , 102 , 103 , 102 , 104 , 103 , 102 , 103 , 103  , 104 , 105 , 106 ,107, 108 , 109 , 110 , 110};

        System.out.print("Input: ");
        for(int id : ids){
            System.out.print( " "+id);
        }
        System.out.println();
        Set<Integer> seen = new HashSet<>();

        for(int id : ids){
            seen.add(id);
        }
        System.out.print("Removed Dulicates: ");
        for(int id : seen){
            System.out.print( " "+id);
        }

    }
}
