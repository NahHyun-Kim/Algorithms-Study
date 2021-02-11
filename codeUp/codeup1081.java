package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup1081 {

	public static void main(String[] args) throws IOException {
		// 1부터 n까지, 1부터 m까지 주사위를 던질때 나올 수 있는 모든 경우의 수 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		br.close();
		for(int i=1; i<=n; i++) {
			//j의값이 1부터 입력한 수까지 모두 나오고 나면 출력한 후, j를 1 올림(반복)
			for(int j=1; j<=m; j++) {
				System.out.println(i + " " + j);
			}
		}
	}

}
