package var_arr_loop;

public class Code01_Basic_Scope {
    //전역변수, 클래스 전체에서 사용 가능
    //변수의 scope(적용 범위-지역, 전역)
    static int num;

    public static void main(String[] args) {

        int anotherNum = 5;

        num = 2;

        System.out.println(num + anotherNum);
        System.out.println("Num : " + num);
        System.out.println("AnotherNum: " + anotherNum); //java에서는 하나가 문자열이면 다른쪽도 문자열로 해석하여 두 문자열을 +함
        System.out.println("Sum: " + num + anotherNum); //left associativity (왼쪽부터 순서-String 형태로 25 출력)
        System.out.println("Sum: " + (num+anotherNum));


    }
}
