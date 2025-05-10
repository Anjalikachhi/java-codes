import java.util.Scanner;

public class Check {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array: ");

int n=sc.nextInt();
System.out.println("Enter the elements of array");
int[] arr=new int[n];
for(int i=0;i<n;i++){arr[i]=sc.nextInt();
}
for(int i=0;i<n-1;i++ ){



        if(arr[i]>arr[i+1]){
            System.out.println("array isnot  sorted"); 
            return;
          // System.out.println("aaray is sorted"); 
        }
 
        }System.out.println("aaray is sorted"); 
    }
   }

