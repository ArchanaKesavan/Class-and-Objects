package classAndObject2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter matches: ");
		byte matchesPlayed = sc.nextByte();
		
		System.out.print("Enter wins: ");
		byte  numOfWins = sc.nextByte();
		
		System.out.print("Enter losses: ");
		byte numOfLosses= sc.nextByte();
		
		System.out.print("Enter avg lap speed:");
		float avgLapSpeed = sc.nextFloat();
		
		System.out.print("Enter max lap speed: ");
		float maxLapSpeed= sc.nextFloat();
		
		System.out.print("Enter avg throw distance: ");
		float avgThrowDistance= sc.nextFloat();
		
		System.out.print("Enter max throw distance: ");
		float maxThrowDistance= sc.nextFloat();
		
		PlayerRecord pr = new PlayerRecord();
		pr.display(matchesPlayed,numOfWins,numOfLosses,avgLapSpeed,maxLapSpeed,avgThrowDistance,maxThrowDistance);
	}

}
