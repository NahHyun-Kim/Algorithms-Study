package var_arr_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bufferedReader {

    public static void main(String[] args) throws IOException {

        //Buffer를 사용하여 데이터를 읽어오기 위한 BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //BufferedReader는 문자열 형태로 읽어오기 때문에, 강제 숫자로 형 변환을 해준다.
        int n = Integer.parseInt(br.readLine());

        //문자열을 나누어 저장하기 위한 StringTokenizer와 출력을 위한 문자열을 만듬
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        //숫자로 형변환되어 입력받을 횟수를 파악하여, 그 횟수만큼 더한 결과값을 내보냄
        for (int i=0; i<n; i++) {

            //StringTokenizer기능 객체 생성과 동시에 입력받아 가공
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }

        //입력이 끝나면 BufferedReader를 닫아주고, 저장된 내용을 출력(sb)
        br.close();
        System.out.println(sb);

    }

}
