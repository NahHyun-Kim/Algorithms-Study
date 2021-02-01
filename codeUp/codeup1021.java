package codeUp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class codeup1021 {

	public static void main(String[] args) throws IOException {
		// codeup 1021 : 1개의 단어를 입력받아 그대로 출력하기
		/* Scanner in = new Scanner(System.in);
		
		String res = in.next();
		
		System.out.println(res); */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String res = br.readLine();
		br.close();
		
		bw.write(res);
		bw.flush();
		bw.close();
	}

}
