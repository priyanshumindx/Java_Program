public class DSA0 {
    public static void main(String[] args) {

        int ids[] = {101 , 102 , 103 , 104 , 102};

        for(int i = 0 ; i < ids.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(ids[i] == ids[j]){
                    System.out.println("First duplicate: " +ids[i]);
                    return;
                }
            }
        }
        System.out.println("No Duplicates");

    }
}
