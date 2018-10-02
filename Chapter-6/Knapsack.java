import java.util.Scanner;

class Knapsack {
    public static int length;
    public static int Knapsack(int weights[],int startPoint,int capacity){
       if(weights[startPoint]==capacity){
           System.out.println(weights[startPoint]);
           return 1;

       }
        else{
            if(weights[startPoint]<capacity){
                for(int i=startPoint+1;i<length;i++){   
                    int value=Knapsack(weights,i,capacity-weights[startPoint]);
                    if(value==1){
                        System.out.println(weights[startPoint]);
                        return 1;
                        
                    }
                }
                
            }
        }
        return 0;
       
    } 
    public static void main(String args[]){
        System.out.println("enter Knapsack capacity");
        Scanner input=new Scanner(System.in);
        int capacity=input.nextInt();
        System.out.println("enter number of weights");
        length=input.nextInt();
        System.out.println("enter weights");
        int weights[]=new int[length];
        for(int i=0;i<length;i++){
            weights[i]=input.nextInt();
        }
        System.out.println("weights are");
        for(int i=0;i<length;i++){
            Knapsack(weights,i,capacity);
        }

        

    }
}
