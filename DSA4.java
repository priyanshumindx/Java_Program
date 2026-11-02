import java.util.HashMap;
import java.util.Map;

public class DSA4 {
    public static void main(String[] args) {

        int[] ids = {101, 102 , 103 , 104 , 102 , 105 , 104};

        Map<Integer , Integer>  frequency = new HashMap<>();

        for(int id: ids){
            frequency.put(id , frequency.getOrDefault(id , 0) + 1);
        }

        int maxCount = 0;

        int mostFrequentId = -1;

        for(Map.Entry<Integer , Integer> entry : frequency.entrySet()){

            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                mostFrequentId = entry.getKey();
            }
        }

        System.out.println("Most frequent ID: "+mostFrequentId);
        System.out.println("Frequency: "+maxCount);
    }
}
