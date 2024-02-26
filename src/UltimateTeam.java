import java.util.ArrayList;

public class UltimateTeam {
    public static void main(String[] args){
        //variables
        ArrayList<UltimatePlayer> players = new ArrayList<UltimatePlayer>();
        ArrayList <Coach> coaches = new ArrayList<Coach>();

        Coach c1 = new Coach("Mr", "Boolean", "Head Coach");
        coaches.add(c1);

        UltimatePlayer p1 = new UltimatePlayer("ss", "Dumb A", "Cutter", 0);
        Captain p2 = new Captain("Nick", "Beres", "Handler", 9, true);
        players.add(p1);
        players.add(p2);

        public String getCutters(){
            for (UltimatePlayer p: players) {
                if (p.getPosition().equals("Cutter")) {

                }
            }
        }

        public String getHandlers(){
            for (UltimatePlayer p: players) {
                if (p.getPosition().equals("Handler")) {

                }
            }
        }

        public String toString(){

        }
    }
}
