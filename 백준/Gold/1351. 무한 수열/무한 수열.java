import java.util.*;

public class Main {
    static Map<Long, Long> memo = new HashMap<>();
    static long P, Q;
    
    public static long getA(long n) {
        if (n == 0) return 1;
        if (memo.containsKey(n)) return memo.get(n);
        
        long value = getA(n / P) + getA(n / Q);
        memo.put(n, value);
        return value;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        P = sc.nextLong();
        Q = sc.nextLong();
        
        System.out.println(getA(N));
    }
}
