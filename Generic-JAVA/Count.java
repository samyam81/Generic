public class Count<T> {
    Count(T[] t){
        int prime = CountPrime(t);
        int even = CountEven(t);
        System.out.println("The number of primes is: " + prime);
        System.out.println("The number of even numbers is: " + even);
    }

    public int CountPrime(T[] t){
        int count = 0;
        for (T t2 : t) {
            if (isPrime(Integer.parseInt(t2.toString()))) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int CountEven(T[] t){
        int count = 0;
        for (T t2 : t) {
            if (Integer.parseInt(t2.toString()) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 23, 4, 56, 78, 4, 3};
        new Count<>(integers);
    }
}
