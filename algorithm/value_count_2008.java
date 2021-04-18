public class value_count_2008 {

    public static void main(String[] args) {
        int exint[] = {2,4,2,67,6,4,7,2,5,4,6};
        int value = 0;
        for (int i=0; i<exint.length; i++)
            if (exint[i] == 2)
                value++;
            System.out.println(value);

            //배열의 i번째 값이 2라면, value를 count 해라
            //배열값이 2인 개수를 출력하는 문제(2는 3개 = 3 출력)
    }
}
