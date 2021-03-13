import java.util.*;

class ArrangeStudents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while(t-- > 0) {
			int n = sc.nextInt();

			List<Integer> a = new ArrayList<>();

        	for (int i = 0; i < n; i++) {
            	a.add(sc.nextInt());
        	}

			List<Integer> b = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				b.add(sc.nextInt());
			}

			String result = arrangeStudents(a, b);
     		System.out.println(result);
		}
	}

	public static String arrangeStudents(List<Integer> a, List<Integer> b) {
			int size = a.size();

			if(size == 1) return "YES";

            Collections.sort(a); 
            Collections.sort(b); 
        
            List<Integer> merged = new ArrayList<>();
            List<Integer> merged_sorted = new ArrayList<>();
        
            for(int i=0; i<size; i++) {
                merged.add(a.get(i));
                merged.add(b.get(i));
            }
        
            merged_sorted = new ArrayList<Integer>(merged);
            Collections.sort(merged_sorted);
        
            if(merged.equals(merged_sorted)) return "YES";
    
            merged = new ArrayList<>();
        
            for(int i=0; i<size; i++) {
                merged.add(b.get(i));
                merged.add(a.get(i));
            }
        
            if(merged.equals(merged_sorted)) return "YES";
        
            return "NO";
        }
	
}