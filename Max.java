import java.util.Arrays;

public class Max<T extends Comparable<T>> {
    public Max(T[] t){
        Arrays.sort(t);
        System.out.println("The largest of type is: " + t[t.length-1]);
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 45, 65, 97};
        new Max<>(integers);
        Double[] doubles = {999.0, 9862.0, 667.2, 97.85};
        new Max<>(doubles); 
    }
    
}
