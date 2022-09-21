package Week1;

public class Vowels {

	public static void main(String[] args) {
		char harf = 'i';

		switch (harf) {
		case 'A', 'I', 'O', 'U':
			System.out.println("Kalın - Buyuk sesli harf");
			break;
		case 'a', 'ı', 'o', 'u':
			System.out.println("Kalın - Kucuk sesli harf");
			break;
		case 'E', 'İ', 'Ö', 'Ü':
			System.out.println("Ince - Buyuk sesli harf");
			break;
		case 'e', 'i', 'ö', 'ü':
			System.out.println("Ince - Kucuk asesli harf");
			break;
		default:
			System.out.println("Girilen harf sessiz harftir");
		}

	}

}