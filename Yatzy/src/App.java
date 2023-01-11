public class App {
    
        public static void main(String[] args) {
            System.out.println("**");
            System.out.println("* Obs! detta är bara en testkörning av dina egna tester. ");
            System.out.println(" För att få poäng på frågan måste du köra utvärderingen.");
            System.out.println(" (Ikonen med en kryssruta och en siffra.)               *");
            System.out.println("**");
            System.out.println();
    
            Team teamA = new Team("Lag A");
            Team teamB = new Team("Lag B");
    
            Standings standings = new Standings(new Team[] { teamA, teamB });
    
            boolean success = standings.reportResult("Lag B", 5, "Lag B", 5);
    
            System.out.println(success);
            System.out.println(teamA);
            System.out.println(teamB);
        }     
}
