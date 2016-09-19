package prob4;

import java.util.Scanner;

public class CalcApp {
	
	public static void main(String[] args) {
		// Scanner 와  String 클래스의 split 함수를 사용합니다.
		
		Scanner scanner = new Scanner(System.in);

		
		while(true){
		System.out.print(">>" );
		String expression = scanner.nextLine();
		
		if("quit".equals(expression) == true){
			break;
		}
		
		String[] tokens = expression.split( " " );//스페이스로 분리
		int iValue = Integer.parseInt(tokens[0]);
		
		String operator  = tokens[1];
		int rValue = Integer.parseInt(tokens[2]);
		
		switch(operator){
		case "+" : 
			Add a = new Add();
			a.setValue(iValue,rValue);
			System.out.println(">>" + a.calculate());
			break;
			
		case "-" :
			Sub b = new Sub();
			b.setValue(iValue, rValue);
			System.out.println(">>" + b.calculate());
			break;
		case "*" :
			Mul c = new Mul();
			c.setValue(iValue, rValue);
			System.out.println(">>" + c.calculate());
			break;
		case "/" :
			Div d = new Div();
			d.setValue(iValue, rValue);
			System.out.println(">>" + d.calculate());
		
			
		}
	}
		//들어온 expression을 분리해줘야함.
		// 분리는 split

		//class add{
//		int i
//		int r
//		setValue(int i, int r)
		
//		switch(operator){
//		case 1 : "+";
		
//		add a = new Add();
//		a.Setvalue(i,r);
		
		
		
		scanner.close();
	}
}
