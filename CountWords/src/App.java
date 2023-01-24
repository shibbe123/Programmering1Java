public class App {
   	public static void main(String[] args) {
		System.out.println("**********************************************************");
		System.out.println("* Obs! detta är bara en testkörning av dina egna tester. *");
		System.out.println("* För att få poäng på frågan måste du köra utvärderingen.*");
		System.out.println("* (Ikonen med en kryssruta och en siffra.)               *");
		System.out.println("**********************************************************");
		System.out.println();

        EnglishWordCounter englishWordCounter = new EnglishWordCounter();
		
		// RAKNAS eftersom du bara behöver hantera bokstäver i det engelska alfabetet
		int count = englishWordCounter.countWords("AsSASD");
		
		// Borde bli 4
	}
}