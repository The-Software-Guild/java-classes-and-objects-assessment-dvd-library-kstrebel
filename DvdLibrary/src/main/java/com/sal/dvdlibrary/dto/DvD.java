/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sal.dvdlibrary.dto;

/**
 *
 * @author salajrawi
 */
import java.util.Date;

public class DvD {
    private String title;
    private String releaseDate;
    private String mpaa;
    private String directorsName;
    private String studio;
    private String userRating;

    public DvD(String title) {
        this.title = title;
    }
    
    //use when dvdTest.txt is empty
    public DvD(String title, String releaseDate, String mpaa, String directorsName, String studio, String userRating){
        this.title=title;
        this.releaseDate=releaseDate;
        this.mpaa=mpaa;
        this.directorsName=directorsName;
        this.studio=studio;
        this.userRating=userRating;
    }
    
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String newTitle)
    {
        this.title = newTitle;
    }

    public String getReleaseDate()
    {
        return releaseDate;
    }

    public void setReleaseDate(String newReleaseDate)
    {
        this.releaseDate = newReleaseDate;
    }

    public String getMPAA()
    {
        return mpaa;
    }

    public void setMPAA(String newMpaa)
    {
        this.mpaa = newMpaa;
    }

    public String getDirectorsName()
    {
        return directorsName;
    }

    public void setDirectorsName(String newDirectorsName)
    {
        this.directorsName = newDirectorsName;
    }

    public String getStudio()
    {
        return studio;
    }

    public void setStudio(String newStudio)
    {
        this.studio = newStudio;
    }

    public String getUserRating()
    {
        return userRating;
    }

    public void setUserRating(String newUserRating)
    {
        this.userRating = newUserRating;
    }
}
