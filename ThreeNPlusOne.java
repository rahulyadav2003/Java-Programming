import java.util.*;
public class ThreeNPlusOne{
    public static void main(String ar[]){
        int n;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter starting point of sequence");
        n=sc.nextInt();
        while(n<=0){
         System.out.println("enter positive integer ");
         n=sc.nextInt(); 
        }
        count=0;
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }
            else{
                n=3*n+1;

            }
            System.out.print(n+"\t");
            count=count+1;
        }
          System.out.println();
          System.out.println("there are "+count+" terms");
   
    }
}
