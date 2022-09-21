package Week1;

public class PrimeNumbers {

	public static void main(String[] args) {
		int number = 27;
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Asal sayi degildir");
			return;
		}

		if (number < 1) {
			System.out.println("Gecersiz sayi girdiniz");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime == true) {
			System.out.println("Sayi asaldir");
		} else {
			System.out.println("Sayi asal degildir");
		}

	}

}