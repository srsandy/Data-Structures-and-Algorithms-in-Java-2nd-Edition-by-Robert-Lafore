import java.util.Scanner;

public class JewelEatingMonsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(2>1) {
            
            long x = sc.nextLong();
            long a = sc.nextLong();
            long n = sc.nextLong();
            long c = sc.nextLong();

            if (n == 0 && a == 0 && x == 0 &&  c == 0) return;

            long gold = x;

            for (int i = 0; i < n; i++) {
                gold = (gold - 1) * a;
                gold %= c;
            }

            gold = (gold + c) % c;
            System.out.println(gold);
        }
    }
}
