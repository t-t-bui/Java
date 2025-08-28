import java.util.ArrayList;

public class Round{
    private ArrayList<Competitor> competitorList;

    public Round(String[] names) {
        competitorList = new ArrayList<Competitor>(); // ?? not to sure on the Abstract Data Type
        for (String name : names) {
            competitorList.add(new Competitor(name));
        }
    }
    public ArrayList<Match> buildMatches() {
        ArrayList<Match> matches = new ArrayList<Match>();
        
        if(competitorList.size() % 2 == 0) {
            int start = 0;
            int end = competitorList.size() - 1;

            while (start < end) {
                Match match = new Match(competitorList.get(start), competitorList.get(end));
                matches.add(match);
                start++;
                end--;
            }
        } else {
            int start = 1;
            int end = competitorList.size() - 1;

            while (start < end) {
                Match match = new Match(competitorList.get(start), competitorList.get(end));
                matches.add(match);
                start++;
                end--;
            }
        }
    }


}