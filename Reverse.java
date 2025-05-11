import java.util.Scanner;
public class Reverse {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array: ");

int n=sc.nextInt();
System.out.println("Enter the elements : ");
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();

}

   for(int j=n-1;j>=0;j--){
    System.out.print(arr[j]+" ");
   }
}}
