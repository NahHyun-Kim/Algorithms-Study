package var_arr_loop;

public class Code07_Arr_While {
    public static void main(String[] args) {

        int [] grades = new int[5];

        grades[0] = 100;
        grades[1] = 76;
        grades[2] = 92;
        grades[3] = 94;
        grades[4] = 14;

        int i=0;
        while (i < grades.length) {
            System.out.println(grades[i]);
        }
    }
}
