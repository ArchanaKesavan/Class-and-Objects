package classAndObject1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter player name: ");
		String  playerName = sc.next();
		System.out.print("Enter player position: ");
		String  playerPosition = sc.next();
		Player p = new Player();
		p.display(playerName,playerPosition);
	}

}
