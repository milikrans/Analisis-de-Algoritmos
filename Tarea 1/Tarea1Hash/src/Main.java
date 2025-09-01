import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        int k = 10;
        HashMap<Integer,Integer> sums = new HashMap<>();
        boolean encontrado = false;
        for (int i = 0; i < n.length; i++) {
            if (!sums.containsValue(k - n[i])){
                sums.put(k - n[i],k - n[i]);
            }else{
                encontrado = true;
            }
        }
        for (int i = 0; i < n.length; i++) {
            if (!sums.containsValue(k - n[i])){
                sums.put(k - n[i],k - n[i]);
            }else{
                encontrado = true;
            }
        }
        System.out.println(encontrado);
    }
}