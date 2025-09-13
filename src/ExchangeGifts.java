import java.util.*;
public class ExchangeGifts {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt(); // number of family members
            int m = sc.nextInt(); // number of gifts exchanged

            int[] gives = new int[n + 1];
            int[] receives = new int[n + 1];

            // Reading the gift exchanges
            for (int i = 0; i < m; i++) {
                int giver = sc.nextInt();
                int receiver = sc.nextInt();

                gives[giver]++;
                receives[receiver]++;
            }

            int youngest = -1;

            // Find the member who satisfies both conditions
            for (int i = 1; i <= n; i++) {
                if (gives[i] == 0 && receives[i] == n - 1) {
                    youngest = i;
                    break; // only one youngest member exists
                }
            }

            System.out.println(youngest);
        }
    }

