package 测试1;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		System.out.println("起床CS了");
		Scanner in = new Scanner(System.in);
//		System.out.println("我是一个冷酷无情的复读机:" + in.nextLine());
		int num1;
		int num2;
		num1 = in.nextInt();
		num2 = in.nextInt();	
//		if(num2 ！= 0 ); System.out.println("你他妈不知道除数不能为0么？")；
//		else 早知道伤心总是难免的 你又为何不能循序渐进
  		System.out.println(num1+"+"+num2+"="+(num1+num2));
		
	}

}
