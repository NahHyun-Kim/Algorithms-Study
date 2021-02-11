package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1085 {

	public static void main(String[] args) throws IOException {
		// codeup1085 : 소리 파일 저장용량 계산하기
		/**
		 * 1초 동안 마이크로 소리강약을 체크하는 수 h
		 * 한번 체크한 결과를 저장하는 비트 b
		 * 좌우 등 소리를 저장할 트랙 개수인 채널 c
		 * 녹음할 시간 s
		 * 필요한 저장 용량을 계산하는 프로그램 작성하기
		 * (ex 44100 * 16 * 2 * 1bit의 저장공간이 필요함)
		 * **/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		
		long h = Integer.parseInt(input[0]);
		long b = Integer.parseInt(input[1]);
		long c = Integer.parseInt(input[2]);
		long s = Integer.parseInt(input[3]);
		
		int tomega = 8388608;
		
		double res = (double)(h * b * c * s) / tomega;
		
		System.out.printf("%.1f MB", res);
		
	}

}
