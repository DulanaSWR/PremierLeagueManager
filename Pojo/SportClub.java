public class SportClub{
    private String clubName;
    private String location;

    public SportClub(String c_ClubName, String c_location){
        this.clubName = c_ClubName;
        this.location = c_location;
    }

    public String getClubName(){
        return clubName;}
    public void setClubName(String s_ClubName){
        this.clubName = s_ClubName;}

    public String getLocation(){
        return location;}
    public void setLocation(String s_Location){
        this.location = s_Location;}

    public String toString(){
        return "Club name : " + clubName + "\t" + "Location : " + location;
    }
}
