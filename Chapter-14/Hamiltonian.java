import java.util.Scanner;

class Hamiltonian {
    static int[][] graph;
    static int[] soln;
    static int n, count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of Vertices");
        n = scanner.nextInt();

        graph = new int[n + 1][n + 1];
        System.out.println("Enter Adjacency Matrix");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        soln = new int[n + 1];

        System.out.println("Hamiltonian Cycle are");

        soln[1] = 1;
        hamiltonian(2);

        if (count == 0) {
            System.out.println("No Hamiltonian Cycle");
        }
    }

    static void hamiltonian(int k) {
        while (true) {
            nextValue(k);

            if (soln[k] == 0) {
                return;
            }
            if (k == n) {
                printArray();
            } else {
                hamiltonian(k + 1);
            }
        }
    }

    static void nextValue(int k) {
        while (true) {

            soln[k] = (soln[k] + 1) % (n + 1);

            if (soln[k] == 0) {
                return;
            }

            if (graph[soln[k - 1]][soln[k]] != 0) {
                int j;
                for (j = 1; j < k; j++) {
                    if (soln[j] == soln[k]) {
                        break;
                    }
                }

                if (j == k) {
 
                    if (k < n || (k == n && graph[soln[n]][soln[1]] != 0)) {
                        return;
                    }
                }
            }
        }
    }

    static void printArray() {
        count += 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(soln[i] + " ");
        }
        System.out.println(soln[1]);
    }
}
