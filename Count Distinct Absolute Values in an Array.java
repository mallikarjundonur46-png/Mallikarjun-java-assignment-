import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                set.add(Math.abs(x));
            }

            System.out.println(set.size());
        }

        sc.close();
    }
}