package ohtomo;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {
	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;
		int num;

		// 名前
		System.out.println("Who are you ?");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Hello " + name + "!");

		//コイントス
		System.out.println("Tossing a coin...");
		for (int i = 1; i <= 3; i++) {
			Random rand = new Random();
			num = rand.nextInt();

			if (num % 2 == 0) {
				System.out.println("Round " + i + ": Heads");
				heads++;
			} else {
				System.out.println("Round " + i + ": Tails");
				tails++;
			}
		}
		System.out.println("Heads: " + heads + ", Tails: " + tails);

		// 勝敗判定
		if (heads > tails) {
			System.out.println(name + " won!");
		} else {
			System.out.println(name + " lost");
		}
	}
}
