
    import java.util.Arrays;
public class Duplicate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 3, 2, 7, 8, 2};

        Arrays.sort(arr); 
        
        System.out.print("Duplicate numbers: ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

