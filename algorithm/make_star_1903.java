public class make_star_1903 {

    public static void main(String[] args) {
        int a[][] = new int[5][5];
        initArray(a);
        assignVal(a);
        prntArray(a);

    }

    private static void initArray(int[][] a) {
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++)
                a[i][j] = 0;
        }
    }

    private static void assignVal(int[][] a) {
        int n = 1;
        for (int i=0; i<a.length; i++) {
            for (int j=i; j<a[i].length; j++)
                a[i][j] = n++;
        }
    }

    private static void prntArray(int[][] a) {
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++)
                if (a[i][j] == 0)
                    System.out.print("   ");
                else
                    System.out.printf("%3d", a[i][j]);
                System.out.println();
        }
    }


}
