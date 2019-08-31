class ReachANumber {
    public static void main(String[] args) {

        int num = 6;

        int res = reachNumber(num);

        System.out.println(res);
    }

    public static int reachNumber(int num) {
     // steps = 1 becasue from 0 -> 1 one step
     int steps = 1;

     while( num > 1 ) {

         if(num%2 == 1) {
             num = num - 1;
             steps++;
         }

         num /= 2;
         steps++;
     }

        return steps;
    }
}
