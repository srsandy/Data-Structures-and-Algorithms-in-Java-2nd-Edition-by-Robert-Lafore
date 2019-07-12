import java.util.*;

class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int a[] = {4,3,2,7,8,2,3,1};
        int n = a.length;

        Arrays.sort(a);

        int sum = ((n+1)*n)/2;

        int p = 1;

        List<Integer> list = new ArrayList<Integer>();

        int prev = 0;
        for(int i = 0; i<n; i++) {
            if(prev == a[i]) continue;

            if(a[i] == p) {
                System.out.println("p: " + p);
                sum-=p;
            } else {
                list.add(p);
                i--;
            }
            p++;
            prev = a[i];

        }

        while(p != n) {
            list.add(p);
            p++;
        }


        for(Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
