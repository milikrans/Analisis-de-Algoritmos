import java.util.List;

public class Main {
    public static void main(String[] args) {
        List num = List.of(-9,3,5,-2,9,-7,4,8,6);
        int factor1 = 0;
        int factor2 = 0;
        int mayorResultado = 0;
        for (int i = 0; i < num.size(); i++) {
            for (int j = 0; j < num.size(); j++) {
                if ((int)num.get(i)*(int)num.get(j) > mayorResultado && (int)num.get(i)!=(int)num.get(j)){
                    mayorResultado = (int)num.get(i)*(int)num.get(j);
                    factor1 = (int)num.get(i);
                    factor2 = (int)num.get(j);
                }
            }
        }
        System.out.println("el mayor resultado es "+mayorResultado+" sus factores son "+ factor1 +" y "+ factor2);
    }
}