public class max {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{3,4,6},{4,6,8}};
        int max=0;
        for(int i=0;i<arr.length;i++){
            for ( int j=0;j<arr[i].length;j++){
                while(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }System.out.println(max);

int min=max;
        for(int i=0;i<arr.length;i++){
            for ( int j=0;j<arr[i].length;j++){
                while(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }System.out.println(min);
    }
}
