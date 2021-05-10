public class FootballClub extends SportClub implements Comparable<FootballClub>{
    private int numberOfMatches;
    private int numberOfWins;
    private int numberOfDraws;
    private int numberOfDefeats;
    private int numberOfGoalsScored;
    private int numberOfGoalsReceived;
    private int numberOfPoints;

    public FootballClub(String c_ClubName, String c_Location,
                        int c_NumberOfMatches, int c_NumberOfWins, int c_NumberOfDraws, int c_NumberOfDefeats,
                        int c_NumberOfGoalsScored, int c_NumberOfGoalsReceived, int c_NumberOfPoints)
    {super(c_ClubName,c_Location);
        this.numberOfMatches = c_NumberOfMatches;
        this.numberOfWins = c_NumberOfWins;
        this.numberOfDraws = c_NumberOfDraws;
        this.numberOfDefeats = c_NumberOfDefeats;
        this.numberOfGoalsScored = c_NumberOfGoalsScored;
        this.numberOfGoalsReceived = c_NumberOfGoalsReceived;
        this.numberOfPoints = c_NumberOfPoints;}

    public int getNumberOfMatches() {
        return numberOfMatches;}
    public void setNumberOfMatches(int s_NumberOfMatches) {
        this.numberOfMatches = s_NumberOfMatches;}

    public int getNumberOfWins() {
        return numberOfWins;}
    public void setNumberOfWins(int s_NumberOfWins) {
        this.numberOfWins = s_NumberOfWins;}

    public int getNumberOfDraws() {
        return numberOfDraws;}
    public void setNumberOfDraws(int s_NumberOfDraws) {
        this.numberOfDraws = s_NumberOfDraws;}

    public int getNumberOfDefeats() {
        return numberOfDefeats;}
    public void setNumberOfDefeats(int s_NumberOfDefeats) {
        this.numberOfDefeats = s_NumberOfDefeats;}

    public int getNumberOfGoalsScored() {
        return numberOfGoalsScored;}
    public void setNumberOfGoalsScored(int s_NumberOfGoalsScored) {
        this.numberOfGoalsScored = s_NumberOfGoalsScored;}

    public int getNumberOfGoalsReceived() {
        return numberOfGoalsReceived;}
    public void setNumberOfGoalsReceived(int s_NumberOfGoalsReceived) {
        this.numberOfGoalsReceived = s_NumberOfGoalsReceived;}

    public int getNumberOfPoints() {
        return numberOfPoints;}
    public void setNumberOfPoints(int s_NumberOfPoints) {
        this.numberOfPoints = s_NumberOfPoints;}

    @Override
    public String toString()
        {return super.toString() +
                "\nNumber of matches : " + numberOfMatches +
                "\tNumber of Wins : " + numberOfWins +
                "\tNumber of Draws : " + numberOfDraws +
                "\tNumber of Defeats : " + numberOfDefeats +
                "\nNumber of goals scored : " + numberOfGoalsScored +
                "\tNumber of goals received : " + numberOfGoalsReceived +
                "\tNumber of points : " + numberOfPoints;}
    @Override
    public int compareTo(FootballClub footballClub)
        {if (this.getNumberOfPoints() == footballClub.getNumberOfPoints())
            {return (this.getNumberOfGoalsScored() - this.getNumberOfGoalsReceived()) - (footballClub.getNumberOfGoalsScored() - footballClub.getNumberOfGoalsReceived());}
        else
            {return this.getNumberOfPoints() - footballClub.getNumberOfPoints();}}
}
