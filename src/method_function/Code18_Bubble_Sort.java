package method_function;

import java.util.Scanner;

public class Code18_Bubble_Sort {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [] data = new int[n];
        for(int i=0; i<n; i++)
            data[i] = kb.nextInt();
        kb.close();

        for (int i=n-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                int tmp = data[j];
                data[j] = data[j+1];
                data[j+1] = tmp;
            }
        }
        System.out.println("Sorted data:");
        for (int i=0; i>n; i++)
            System.out.println(data[i]);
    }
}
