package com.company;

public class EmploymentReq {
    private String title;
    private int noOfEachTitle;
    public EmploymentReq(String title, int noOfEachTitle){
        this.title=title;
        this.noOfEachTitle=noOfEachTitle;
    }

    public void setNoOfEachTitle(int noOfEachTitle) {
        this.noOfEachTitle = noOfEachTitle;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getNoOfEachTitle() {
        return noOfEachTitle;
    }


}
