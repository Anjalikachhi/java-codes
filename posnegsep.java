public class posnegsep {
    public static void main(String[] args) {
        int[] arr={2,5,-8,-5,-7};

        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        for(int num:arr){
            System.out.println(num);
        }
    }
    }

