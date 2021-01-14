package JavaBasic;

import java.awt.Button;
import java.awt.Frame;

public class prac_98_frameEx {

	
	//java.awt.* Button, Frame, TextFiled...
	//java.swing.* 자바 영역에서 사용하는 look&feel을 적용 받아 모든 운영체제에서 동일한 느낌을 제공.
	//JButton, JFrame, JTextField....
	
	/*
	 * Container (창의 역할) - 하나 이상의 Container 위에 Component들이 올려질 영역
	 * Frame, Window, Panel, Dialog, Applet... (컴포넌트보다 작은 개념)
	 * 
	 * Component (Container 위에 올려져서 화면 구성을 담당하는 요소들)
	 * Button, TextFiled, TextArea, List.. 
	 * 
	 * LayoutManager (Container 위에 Component들을 올릴 때 자리 배치 방법)
	 * FlowLayout, BorderLayout, GridLayout, CardLayout, GridBackLayout...
	 * 
	 * 화면 생성은 프로그램 초기에 이루어져야 하므로, 생성자에서 작업이 이루어짐.
	 * */
	Frame frame = new Frame("프레임");
	Button button = new Button("버튼");
	
	public void createFrame() {
		//프레임에 컴포넌트 추가(Container 위에 Component 추가)
		frame.add(button);
		
		//프레임 크기 지정(int 형식으로 프레임의 사이즈 지정)
		frame.setSize(300, 600);
		
		//프레임 보이기(boolean 형식으로 지정)
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		//프레임 열기 prac_98_frameEx 클래스명 + 객체명으로 생성 후 createFrame() 으로 프레임을 열어준다.
		prac_98_frameEx frameExam = new prac_98_frameEx();
		frameExam.createFrame();
	}

}
