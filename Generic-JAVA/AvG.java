public class AvG<T extends Number> {

    public AvG(T[] t){
        double sum = 0.0; // Initialize sum as a double
        for (T t2 : t) {
            sum += t2.doubleValue(); // Convert each element to double and add to sum
        }
        double average = sum / t.length; // Calculate average
        System.out.println("The Average: " + average);
    }

    public static void main(String[] args) {
        Integer[] integer = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
        new AvG<>(integer);

        Double[] double1 = {2.2, 3.3, 4.4, 5.5, 6.6};
        new AvG<>(double1);
    }
}
