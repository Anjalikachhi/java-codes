public class Dutch {
    public static void main(String[] args) {
        int[] arr ={2,0,1,0,1,2,1};
        int low=0,mid=0,high=arr.length-1;
        while (mid<=high) {
            switch(arr[mid]){
                case 0:
                int  temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
break;
                case 1:
                mid++;
                break;
case 2:
int tempo=arr[mid];
arr[mid]=arr[high];
arr[high]=tempo;
high--;
break;
default: 
System.out.println("input array wrong");

            
            }
            
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
