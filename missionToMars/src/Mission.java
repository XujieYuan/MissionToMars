package Feature1;
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

    // Employee 类的构造器;
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
    /* 获取MissionId的值*/
    public int getMissionId(){
        return missionId;
    }
    /* 获取MissionName的值*/
    public String getMissionName(){
        return missionName;
    }
    /* 获取MissionDescription的值*/
    public String getMissionDescription(){
        return missionDescription;
    }
    /* 获取CountryOfOrigin的值*/
    public String getCountryOfOrigin(){
        return countryOfOrigin;
    }
    /* 获取listOfCountriesAllow的值*/
    public ArrayList getListOfCountriesAllow(){
        return listOfCountriesAllow;
    }
    /* 获取listOfJobs的值*/
    public ArrayList getListOfJobs(){
        return listOfJobs;
    }
    /* 获取jobDescription的值*/
    public String getJobDescription(){
        return jobDescription;
    }
    /* 获取launchDate的值*/
    public Date getLaunchDate(){
        return launchDate;
    }
    /* 获取的locationOfDestination值*/
    public String getLocationOfDestination(){
        return locationOfDestination;
    }
    /* 获取的durationOfMission值*/
    public String getDurationOfMission(){
        return durationOfMission;
    }
    /* 获取的statusOfMission值*/
    public String getStatusOfMission(){
        return statusOfMission;
    }

    /* 设置missionId的值*/
    public void setMissionId(int inputMissionId){
        missionId = inputMissionId;
    }
    /* 设置missionName的值*/
    public void setMissionName(String inputMissionName){
        missionName = inputMissionName;
    }
    /* 设置的missionDescription值*/
    public void setMissionDescription(String inputMissionDescription){
        missionDescription = inputMissionDescription;
    }
    /* 设置的countryOfOrigin值*/
    public void setCountryOfOrigin(String inputCountryOfOrigin){
        countryOfOrigin = inputCountryOfOrigin;
    }
    /* 设置listOfCountriesAllow的值*/
    public void setListOfCountriesAllow(ArrayList <String> inputListOfCountries){
        listOfCountriesAllow = inputListOfCountries;
    }
    /* 设置listOfJobs的值*/
    public void setListOfJobs(ArrayList <String> inputListOfJobs){
        listOfJobs = inputListOfJobs;
    }
    /* 设置jobDescription的值*/
    public void setJobDescription(String inputJobDescription){
        jobDescription = inputJobDescription;
    }
    /* 设置launchDate的值*/
    public void setLaunchDate(Date inputLaunchDate){
        launchDate = inputLaunchDate;
    }
    /* 设置locationOfDestination的值*/
    public void setLocationOfDestination(String inputLocationOfDestination){
        locationOfDestination = inputLocationOfDestination;
    }
    /* 设置durationOfMission的值*/
    public void setDurationOfMission(String inputDurationOfMission){
        durationOfMission = inputDurationOfMission;
    }
    /* 设置statusOfMission的值*/
    public void setStatusOfMission(String inputStatusOfMission){
        statusOfMission = inputStatusOfMission;
    }
    /* 打印信息 */
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
