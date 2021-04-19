public class bubble_sort_1801 {

    public static int[] arr(int[] a) {
        int i, j, sw, temp, n=4;
        if(a[0] == 0 || a[0] < 1)
            return a;
        for (i=0; i<n-1; i++) {
            sw = i;
            for (j=i+1; j<n; j++) {
                if(a[j] < a[sw])
                    sw = j;
            }
        temp = a[i]; //swap
        a[i] = a[sw];
        a[sw] = temp;
        }
        return a;
    }
    public static void main(String[] args) {

        int i;
        int n[] = {4,2,7,1};
        arr(n);
        for(i=0; i<4; i++) {
            System.out.printf(n[i] + " ");
        }
    }
}
