import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T > 0) {

            int N = sc.nextInt();
            int M = sc.nextInt();

            HashSet<String> groups = new HashSet<>();

            for (int i = 0; i < N; i++) {

                String s = sc.next();

                char[] ch = s.toCharArray();
                Arrays.sort(ch);

                groups.add(new String(ch));
            }

            System.out.println(groups.size());

            T--;
        }

        sc.close();
    }
}