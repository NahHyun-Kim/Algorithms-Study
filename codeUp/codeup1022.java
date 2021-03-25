package codeUp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class codeup1022 {

	public static void main(String[] args) throws IOException {
		// 문장 1개를 입력받아 공백까지 그대로 출력하기(Scanner 사용 시 nextLine(); 사용)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String res = br.readLine();
		br.close();
		
		bw.write(res);
		bw.flush();
		bw.close();
	}

}
