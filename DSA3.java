import java.util.Map;
import java.util.HashMap;

public class DSA3 {
    public static void main(String[] args) {
        int ids[] = {101 , 102 , 103 , 102 , 104 , 106};

        Map<Integer , Integer> frequency = new HashMap<>();

        for(int id : ids){
            if(frequency.containsKey(id)){
                int count = frequency.get(id);
                frequency.put(id , count + 1);
            }

            else{
                frequency.put(id , 1);
            }
        }
        System.out.println(frequency);
    }
}
