public class Standings {
    private Team[] teams;

    public Standings(Team[] teams) {
        this.teams = teams;
    }
    public boolean reportResult(String teamA, int teamAPoints, String teamB, int teamBPoints){
        if (teams.length  <= 2) {
            return false;
        }
        
        for (int i = 0; i < teams.length; i++) {
            if (teams[i] == null) {
                return false;
            }
        }

        teams[0].increasePoint(teamAPoints);
        teams[1].increasePoint(teamBPoints);

        if (teams[0].getPoints() > teams[1].getPoints()) {
            teams[0].increasePoint(3);
            return true;
        } 
        
        else if (teams[0].getPoints() < teams[1].getPoints()){
            teams[1].increasePoint(3);
            return true;
        }
        else {
            teams[0].increasePoint(1);
            teams[1].increasePoint(1);
            return true;
        }
    }

}
