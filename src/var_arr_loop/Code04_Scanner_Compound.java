package var_arr_loop;

import java.util.Scanner;

public class Code04_Scanner_Compound {

    public static void main(String[] args) {
        String name = null;
        int age;
        String gender;
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Plz type your name, age, gender: ");
        
        name = kb.next(); //문자열 입력(next)
        age = kb.nextInt(); //숫자 입력(nextInt)
        gender = kb.next();
        
        if (gender.equals("male"))  //String literal(""로 둘러싸인 문자열 자체 비교)
            System.out.println(name + ", you're " + age + "years old man.");
        else if (gender.equals("female"))
            System.out.println(name + ", you're " + age + "years old woman.");
        else
            System.out.println("Plz type again.");
    
        kb.close(); //Scanner 사용 후 종료
    }
        
}
