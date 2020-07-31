import java.util.Random;

public class CoinToss {

	public static void main(String[] args) {

		int heads = 0;
		int tails = 0;
		int num;

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
	}
}