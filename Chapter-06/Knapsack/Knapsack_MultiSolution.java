/*
    Solved By: Ganesh varma (https://github.com/gane5hvarma)
    Modified By: Sandeep Ranjan (1641012352)
*/

class Knapsack_MultiSolution {
    public static int length;
    public static int[] weights;

    public static boolean knapsack(int startPoint,int capacity){
       if(weights[startPoint]==capacity){
           System.out.print(weights[startPoint] + " ");
           return true;
       }
        else{
            if(weights[startPoint]<capacity){

                for(int i=startPoint+1; i<length; i++){   
                    boolean value = knapsack(i,capacity-weights[startPoint]);

                    if(value){
                        System.out.print(weights[startPoint] + " ");
                        return true;
                        
                    }
                }
                
            }
        }
        
        return false;   
    } 

    public static void main(String args[]){

        weights = new int[]{5, 3, 2, 7};
        length = weights.length;

        int capacity = 10;

        System.out.println("Weights are ->");
        for(int i=0; i<length; i++){
            boolean line = knapsack(i,capacity);
            if(line) System.out.println();
        }
    }
}
