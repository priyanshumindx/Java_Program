import java.util.HashSet;
import java.util.Set;

public class DSA1 {
    public static void main(String[] args) {

        int[] ids = {101 , 102 , 103 , 102 , 104};

        Set<Integer> seen = new HashSet<>();

        for(int id : ids){
            if(!seen.add(id)){
                System.out.println("First Duplicate: " +id);
                return;
            }
        }
    }
}
