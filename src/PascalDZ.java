import java.util.Arrays;

public class PascalDZ {
    public static void main(String args[]) {
        int n = 10;
        int[] numbers = new int[n];
        int[] previews = new int[n];


        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(j==0 | j==(i-1)) numbers[j] = 1;
                else numbers[j] = previews[j-1] + previews[j];
                System.out.print(numbers[j] + " ");




                            }
            System.out.println();
            previews = numbers.clone();


        }

    }



}