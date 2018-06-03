import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t;i++)

        {

            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int[] input = new int[n];
                int[] out = new int[n];
                for (int k = 0; k < input.length; k++) {
                    input[k] = sc.nextInt();
                    int count = 1;
                    int current_element = k - 1;
                    while (current_element >= 0) {
                        if (input[current_element] <= input[k]) {
                             count++;
                        }
                        else break;
                        current_element--;
                    }
                    out[k] = count;
                }
                for( int z = 0 ; z < out.length ; z++){
                    System.out.print(out[z]+ " " );

                }
                System.out.println();

            }


        }
    }
}
