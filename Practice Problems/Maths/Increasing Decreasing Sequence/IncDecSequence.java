import java.util.Scanner;

class IncDecSequence {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();

        System.out.println(increasingDecreasing(n));
    }

    public static boolean increasingDecreasing(int n){

        int prev = sc.nextInt();
        int count = 1;
        boolean goingUp = false;
        boolean isValid = true;

        while(count < n){

            int curr = sc.nextInt();

            int diff = curr - prev;

            if(diff == 0){  
                isValid = false;
            }else if(diff > 0){  
                goingUp = true;
            }else if(goingUp && diff < 0){
                isValid = false;
            }

            prev = curr;
            count++;

        }

        return isValid;
    }
}
