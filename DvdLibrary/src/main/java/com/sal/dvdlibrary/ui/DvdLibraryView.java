/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sal.dvdlibrary.ui;

import com.sal.dvdlibrary.dto.DvD;

import java.nio.file.Paths; //debugging
import java.util.List;

/**
 *
 * @author salajrawi
 */
public class DvdLibraryView {

    private UserIO io;

    public DvdLibraryView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection()
    {
        io.print("Main Menu");
        io.print("1- List DVDs");
        io.print("2- Create DVD");
        io.print("3- View a DVD");
        io.print("4- Remove DVD");
        io.print("5- Edit DVD");
        io.print("6- Exit");

        // System.out.println(Paths.get("").toAbsolutePath());

        return io.readInt("Please select from the menu", 1, 6);
    }

    public int printEditMenuAndGetSelection() {
        io.print("Edit which field?");
        io.print("1- Title");
        io.print("2- MPAA Rating");
        io.print("3- Release Date");
        io.print("4- Director Name");
        io.print("5- Studio Name");
        io.print("6- User Rating");
        io.print("7- Exit");

        return io.readInt("Please select from the menu", 1, 7);
    }
    /*
     This method prompts the user for dvd ID, First Name, Last Name, and Cohort, 
    gathers this information, creates a new dvd object, and returns it to the caller.
     */
    public DvD getNewDvDInfo() {
        String dvdTitle = io.readString("Please enter DVD title");
        String mpaa = io.readString("Please enter MPAA rating");
        String releaseDate = io.readString("Please enter release date");
        String director = io.readString("Please enter director");
        String studio = io.readString("Please enter studio");
        String userRating = io.readString("Please enter a user rating");

        DvD currentDvD = new DvD(dvdTitle);
        currentDvD.setMPAA(mpaa);
        currentDvD.setReleaseDate(releaseDate);
        currentDvD.setDirectorsName(director);
        currentDvD.setStudio(studio);
        currentDvD.setUserRating(userRating);

        return currentDvD;
    }

    /*
    This method simply displays a banner or heading to the UI indicating that 
    the next interactions on the screen will be for creating a new dvd
     */
    public void displayCreateDvDBanner() {
        io.print("=== Create DvD ===");
    }

    /*
    The second method displays a message that the new dvd was successfully created
    and waits for the user to hit Enter to continue
     */
    public void displayCreateSuccessBanner() {
        io.readString(
                "DvD successfully created.  Please hit enter to continue");
    }

    /*
    A method that takes a list of DVD objects as a parameter and displays the information for each Dvd to the screen.
     */
    public void displayDvdList(List<DvD> dvdList) {
        for (DvD dvd : dvdList)
        {
            String dvdInfo = String.format("          Title: %s\n"
                    + "    MPAA Rating: %s\n"
                    + "   Release Date: %s\n"
                    + "Director's Name: %s\n"
                    + "         Studio: %s\n"
                    + "    User Rating: %s\n",
                    dvd.getTitle(),
                    dvd.getMPAA(),
                    dvd.getReleaseDate(),
                    dvd.getDirectorsName(),
                    dvd.getStudio(),
                    dvd.getUserRating());

            io.print(dvdInfo);
        }
    }

    public void displayDisplayAllBanner() {
        io.print("=== Display All Dvds ===");
    }

    /*
    Shows the dtudent banner
     */
    public void displayDisplayDvdBanner() {
        io.print("=== Display Dvd ===");
    }

    /*
    Get the dvd title to display information
     */
    public String getDvdTitleChoice() {
        return io.readString("Please enter the dvd title.");
    }

    /*
    Displays the dvd information
     */
    public void displayDvd(DvD dvd) {
        if (dvd != null)
        {
            // io.print(dvd.getTitle()); //removed because user has already entered the title
            io.print(dvd.getMPAA());
            io.print(dvd.getReleaseDate());
            io.print(dvd.getDirectorsName());
            io.print(dvd.getStudio());
            io.print(dvd.getUserRating());
        }
        else
        {
            io.print("No such DVD exists");
        }

        io.readString("Press enter to continue.");
    }

    public void displayRemoveDvdBanner() {
        io.print("=== Remove Dvd ===");
    }

    public void displayRemoveResult(DvD dvdRecord) {
        if (dvdRecord != null)
        {
            io.print("DVD removed successfully.");
        }
        else
        {
            io.print("No such DVD exists.");
        }

        io.readString("Press enter to continue.");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
    public void displayEditDvdBanner() {
        io.print("=== Edit DVD ===");
    }

    public void displayEditDvdSuccess() {
        io.readString(
                "DVD successfully Edited.  Please hit enter to continue");
    }

    public void displayEditReleaseDateBanner() {
        io.print("=== Edit DVD Release Date ===");
    }

    public void displayEditMpaaBanner() {
        io.print("=== Edit DVD MPAA rating ===");
    }

    public void displayEditDirectorNameBanner() {
        io.print("=== Edit DVD Director's Name ===");
    }

    public void displayEditStudio() {
        io.print("=== Edit DVD Studio ===");
    }

    public void displayEditUserRating() {
        io.print("=== Edit DVD User Rating ===");
    }

    public String getNewReleaseDate() {
        return io.readString("Please enter new release date.");
    }

    public String getNewMpaaRating() {
        return io.readString("Please enter new MPAA rating.");
    }

    public String getNewDirectorName() {
        return io.readString("Please enter new director's name.");
    }

    public String getNewUserRating() {
        return io.readString("Please enter new user rating.");
    }

    public String getNewStudio() {
        return io.readString("Please enter new studio.");
    }

    public void displayNullDVD() {
        io.print("No such DVD.");
        io.readString("Please hit enter to continue.");
    }
}
