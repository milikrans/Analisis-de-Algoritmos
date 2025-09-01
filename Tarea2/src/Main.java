import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> n = List.of(0,1,2,3,4,5,6,7,8,9);

        System.out.println("Comparaciones realizadas = " + busqueda(n,9));
    }

    private static int busqueda(List a, int b){
        boolean found = false;
        int count = 0;
        while (found == false && count < a.size()){
            if(b == (int)a.get(count)){
                found = true;
            }
            count++;
        }
        return count;
    }

}