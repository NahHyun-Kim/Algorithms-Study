package JavaBasic;

import javax.swing.JButton;
import javax.swing.JFrame;

public class prac_97_jFrameEx {

	JFrame frame = new JFrame("제이프레임");
	JButton button = new JButton("나는 버튼");
	
	public void createFrame() {
		//프레임에 컴포넌트 추가
		frame.add(button);
		
		//프레임 크기 지정
		frame.setSize(300,300);
		
		//프레임 보이기
		frame.setVisible(true);
		
		//swing에만 있는 x버튼 클릭 시 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		//프레임 열기
		prac_97_jFrameEx frameExam = new prac_97_jFrameEx();
		frameExam.createFrame();
	}

}
