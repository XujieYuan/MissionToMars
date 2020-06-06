import java.util.ArrayList;
import java.util.Date;

public class Mission
{
    int missionId;
    String missionName;
    String missionDescription;
    String countryOfOrigin;
    ArrayList<String> listOfCountriesAllow = new ArrayList<String>();
    ArrayList<String> listOfJobs = new ArrayList<String>();
    String jobDescription;
    Date launchDate;
    String locationOfDestination;
    String durationOfMission;
    String statusOfMission;

    public Mission(int missionId,String missionName,String missionDescription,String countryOfOrigin,ArrayList<String> listOfCountriesAllow,ArrayList<String> listOfJobs,String jobDescription,Date launchDate,String locationOfDestination,String durationOfMission,String statusOfMission)
    {
        this.missionId = missionId;
        this.missionName = missionName;
        this.missionDescription = missionDescription;
        this.countryOfOrigin = countryOfOrigin;
        this.listOfCountriesAllow = listOfCountriesAllow;
        this.listOfJobs = listOfJobs;
        this.jobDescription = jobDescription;
        this.launchDate = launchDate;
        this.locationOfDestination = locationOfDestination;
        this.durationOfMission = durationOfMission;
        this.statusOfMission = statusOfMission;
    }

    public int getMissionId(){
        return missionId;
    }

    public String getMissionName(){
        return missionName;
    }

    public String getMissionDescription(){
        return missionDescription;
    }

    public String getCountryOfOrigin(){
        return countryOfOrigin;
    }

    public ArrayList getListOfCountriesAllow(){
        return listOfCountriesAllow;
    }

    public ArrayList getListOfJobs(){
        return listOfJobs;
    }

    public String getJobDescription(){
        return jobDescription;
    }

    public Date getLaunchDate(){
        return launchDate;
    }

    public String getLocationOfDestination(){
        return locationOfDestination;
    }

    public String getDurationOfMission(){
        return durationOfMission;
    }

    public String getStatusOfMission(){
        return statusOfMission;
    }


    public void setMissionId(int inputMissionId){
        missionId = inputMissionId;
    }

    public void setMissionName(String inputMissionName){
        missionName = inputMissionName;
    }

    public void setMissionDescription(String inputMissionDescription){
        missionDescription = inputMissionDescription;
    }

    public void setCountryOfOrigin(String inputCountryOfOrigin){
        countryOfOrigin = inputCountryOfOrigin;
    }

    public void setListOfCountriesAllow(ArrayList <String> inputListOfCountries){
        listOfCountriesAllow = inputListOfCountries;
    }

    public void setListOfJobs(ArrayList <String> inputListOfJobs){
        listOfJobs = inputListOfJobs;
    }

    public void setJobDescription(String inputJobDescription){
        jobDescription = inputJobDescription;
    }

    public void setLaunchDate(Date inputLaunchDate){
        launchDate = inputLaunchDate;
    }

    public void setLocationOfDestination(String inputLocationOfDestination){
        locationOfDestination = inputLocationOfDestination;
    }

    public void setDurationOfMission(String inputDurationOfMission){
        durationOfMission = inputDurationOfMission;
    }

    public void setStatusOfMission(String inputStatusOfMission){
        statusOfMission = inputStatusOfMission;
    }

    public void printEmployee(){
        System.out.println("missionId:"+ missionId );
        System.out.println("missionName:"+ missionName );
        System.out.println("missionDescription:" + missionDescription );
        System.out.println("countryOfOrigin:" + countryOfOrigin );
        System.out.println("listOfCountriesAllow:" + listOfCountriesAllow);
        System.out.println("listOfJobs:" + listOfJobs);
        System.out.println("jobDescription:" + jobDescription);
        System.out.println("launchDate:" + launchDate);
        System.out.println("locationOfDestination:" + locationOfDestination);
        System.out.println("durationOfMission:" + durationOfMission);
        System.out.println("statusOfMission:" + statusOfMission);
    }
}
