import java.util.*;

public class SolvingForQueriesWithCups {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int q = sc.nextInt();

		List<Integer> balls = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			balls.add(sc.nextInt());
        }

		List<List<Integer>> swaps = new ArrayList<>();

		for (int i = 0; i < s; i++) {
            List<Integer> swapsRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                swapsRowItems.add(sc.nextInt());
            }
            swaps.add(swapsRowItems);
        }

		List<List<Integer>> query = new ArrayList<>();

		for (int i = 0; i < q; i++) {
            List<Integer> queryRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                queryRowItems.add(sc.nextInt());
            }

            query.add(queryRowItems);
        }

		List<Integer> result = countCups(n, balls, swaps, query);

		for (int i = 0; i < result.size(); i++) {
           System.out.print(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
               System.out.print(" ");
            }
        }

		 System.out.println();
	}

	public static List<Integer> countCups(int n, List<Integer> balls, List<List<Integer>> swaps, List<List<Integer>> queries) {
        
        List<Integer> ansList = new ArrayList<>();
        Set<Integer> set = new HashSet<>(balls);
        TreeMap<Integer, Integer> map = new TreeMap<>();
                
        for(int i=0; i<swaps.size(); i++) {
            int x = swaps.get(i).get(0);
            int y = swaps.get(i).get(1);
            
            boolean xC = set.contains(x);
            boolean yC = set.contains(y);
            
            if(xC && yC || !xC && !yC) {
                continue;
            }
            
            if(xC) {
                set.remove(x);
                set.add(y);
            } else {
                set.remove(y);
                set.add(x);
            }
        }
               
        for(int x : set) {
            map.put(x, 0);
        }
               
        map.put(0,0);
        int count = 0;

        for(int x : map.keySet()) {
            count += 1;
            map.put(x, count);
        }
               
        for(int i=0; i<queries.size(); i++) {
            int x = queries.get(i).get(0)-1;
            int y = queries.get(i).get(1);
            
            Integer cLeft = 0;
            Integer cRight = 0;
            
            cLeft = map.get(x);
            cRight = map.get(y);
            
            if(cLeft == null) {
                cLeft = map.get(map.floorKey(x));
            }
            
            if(cRight == null) {
                cRight = map.get(map.floorKey(y));
            }
            
            ansList.add(cRight-cLeft);    
        }
        
        return ansList;
    }

}

