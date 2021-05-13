public class UniversityFootballClub {
    private String clubName;
    private String location;
    private int numberOfMatches;
    private int numberOfWins;
    private int numberOfDraws;
    private int numberOfDefeats;
    private int numberOfGoalsScored;
    private int numberOfGoalsReceived;
    private int numberOfPoints;
    private String universityName;

    public UniversityFootballClub(String c_ClubName, String c_Location, int c_NumberOfMatches, 
	int c_NumberOfWins, int c_NumberOfDraws, int c_NumberOfDefeats,
        int c_NumberOfGoalsScored, int c_NumberOfGoalsReceived, int c_NumberOfPoints,
        String c_UniversityName)
	{
        this.clubName = c_ClubName;
        this.location = c_Location;
        this.numberOfMatches = c_NumberOfMatches;
        this.numberOfWins = c_NumberOfWins;
        this.numberOfDraws = c_NumberOfDraws;
        this.numberOfDefeats = c_NumberOfDefeats;
        this.numberOfGoalsScored = c_NumberOfGoalsScored;
        this.numberOfGoalsReceived = c_NumberOfGoalsReceived;
        this.numberOfPoints = c_NumberOfPoints;
        this.universityName = c_UniversityName;
    }

    public String getClubName(){
        return clubName;}
    public void setClubName(String s_ClubName){
        this.clubName = s_ClubName;}

    public String getLocation(){
        return location;}
    public void setLocation(String s_Location){
        this.location = s_Location;}

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

    public String getUniversityName(){
        return universityName;}
    public void setUniversityName(String s_UniversityName){
        this.universityName = s_UniversityName;}

    public String toString(){
        return "Club Name : " + clubName + "\t" + "Location : " + location + "\n" +
                "Number of matches : " + numberOfMatches + "\t" +
                "Number of Wins : " + numberOfWins + "\t" +
                "Number of Draws : " + numberOfDraws + "\t" +
                "Number of Defeats : " + numberOfDefeats + "\n" +
                "Number of goals scored : " + numberOfGoalsScored + "\t" +
                "Number of goals received : " + numberOfGoalsReceived + "\t" +
                "Number of points : " + numberOfPoints + "\t" +
                "University Name : " + universityName;
    }
}
