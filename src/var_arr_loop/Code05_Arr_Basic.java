package var_arr_loop;

public class Code05_Arr_Basic {

    public static void main(String[] args) {
        int [] grades; // 배열 선언
        grades = new int[5]; //배열 생성 //C : #define MAX 5...

        //한 줄로 합쳐서 표현
        double [] array = new double[100];

        //assign some values to the array
        grades[0] = 100;
        grades[1] = 76;
        grades[2] = 92;
        grades[3] = 94;
        grades[4] = 14;

        //print out eaceh value
        for (int i=0; i<grades.length; i++) {
            System.out.println("grades[" + (i+1) + "] : " + grades[i]);
        }

        //random access가 가능한 콜렉션에 한해 적용되는 for-loop
        for (int score : grades) {
            System.out.println(score);
        }
    }
}
