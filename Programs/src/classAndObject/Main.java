package classAndObject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter team name: ");
		String teamName = sc.next();
		System.out.print("Enter city represented: ");
		String cityRepresented = sc.next();
		Team t = new Team();
        t.display(teamName,cityRepresented);
	}

}
