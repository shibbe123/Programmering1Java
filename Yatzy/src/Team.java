/**
 * Team
 */
public class Team {
    private String name;
    private int points;

    public Team(String name){

        this.name = name;
        this.points = 0;
        
    }

    public String getName(){
        return name;
    }

    public int getPoints(){
        return points;
    }

    public void increasePoint(int increasePoints){
        points += increasePoints;

    }
    public String toString(){
        return name + "" + points;
    }


}