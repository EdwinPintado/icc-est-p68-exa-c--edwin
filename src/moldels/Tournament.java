package moldels;

import java.util.Arrays;

public class Tournament {
  private String name;
  private Club[] clubs;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Club[] getClubs() {
    return clubs;
  }
  public void setClubs(Club[] clubs) {
    this.clubs = clubs;
  }
  public Tournament(String name, Club[] clubs) {
    this.name = name;
    this.clubs = clubs;
  }
/** 
  public int getTotalStarterPoints(){
    int totalStarterPoints = 0;
      for(Club clubs : clubs){
        for(Athlete athletes : athletes){
          if(athlete.getStarted == true){
            totalStarterPoints = athlete.getStarted++;
          }
        }
      }
    }
    return totalStarterPoints; 
  }
*/
  @Override
  public String toString() {
    return "Tournament [name=" + name + ", clubs=" + Arrays.toString(clubs) + "]";
  }
  
}
