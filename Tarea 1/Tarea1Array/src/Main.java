import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        ArrayList sums = new ArrayList<Integer>();
        int k = 10;
        boolean encontrado = false;
        for (int i = 0; i < n.length; i++) {
            if (sums.contains(k)){
                break;
            }
            for (int j = 0; j <= i; j++) {
                sums.add(n[i]+n[j]);
                if (sums.contains(k)){
                    encontrado = true;
                    break;
                }
            }
        }
        System.out.println(encontrado);
    }
}