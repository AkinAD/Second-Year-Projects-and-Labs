package ltUtility;

import java.util.Scanner;

public class MainPracticeA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello human, what is your name?");
		String  name = sc.next();
		System.out.println(PracticeA.hello(name));
		sc.close();
	}

}
