import java.util.Scanner;

public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    /**  getYOB()
     * Get's a person's YOB from a data record
     * @return Returns the YOB of the person
     */
    public int getYOB() {
        return YOB;
    }


    /**  setYOB(int YOB)
     * Changes a person's year of birth to an inputted integer.
     * @param YOB is what the person's YOB changed to
     */
    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    /**  getTitle()
     * Get's a person's title from a data record
     * @return Returns the person's title
     */
    public String getTitle() {
        return title;
    }


    /**  setTitle
     * Changes a person's title to an inputted title.
     * @param title is what the person's title changed to
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**  getLastName
     * Get's a person's last name from a data record
     * @return Returns the person's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**  setLastName
     * Changes a person's last name to an inputted name
     * @param lastName is what the person's last name changed to
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**  getFirstName
     * Get's a person's first name from a data record
     * @return Returns the person's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**  setFirstName
     * Changes a person's first name to an inputted name
     * @param firstName is what the person's first name changed to
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**  getID
     * Get's a person's ID number from a data record
     * @return Returns the person's ID number
     */
    public String getID() {
        return ID;
    }

    /**  setID
     * Changes a person's ID number to an inputted ID number
     * @param ID Returns the person's ID number
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**  toString
     * Collects data and formats it into a human-readable string
     * @return Returns the human-readable string
     */
    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    /**  Person
     * Makes a person data record based on an inputted
     * ID number, first name, last name, title, and YOB.
     * @param ID is the person's ID number
     * @param firstName is the person's first name
     * @param lastName is the person's last name
     * @param title is the person's title
     * @param YOB is the person's YOB
     */
    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }


    /**  fullName
     * Finds a person's full name based on
     * what their first and last names are.
     * @return returns the given person's full name.
     */
    public String fullName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    /**  formalName
     * Finds a person's formal name based on their
     * title and what their first and last names are.
     * @return returns the person's formal name.
     */
    public String formalName() {
        return this.getTitle() + " " + this.getFirstName() + " " + this.getLastName();
    }

    /**  getAge
     * Finds a person's current age by
     * subtracting their year of birth from 2026.
     * @return returns the person's age in 2026
     */
    public int getAge() {
        return 2026 - this.getYOB();
    }


    /**  getAge(int year)
     * Finds a persons age in a given year by
     * subtracting their year of birth from the given year.
     * @param year a year that the user inputs. Must be between 1940 and 2010
     *             since none of the people are alive outside of that time period.
     * @return Returns the person's age in a given year.
     */
    public int getAge(int year) {
        return year - this.getYOB();
    }

    /**  toCSV
     * Takes data from a Person arraylist and
     * inputs it into a comma-separated value.
     * @return Returns a csv record with the person's
     * ID, first name, last name, title, and YOB.
     */
    public String toCSV() {
        return getID() + ", " + getFirstName() + ", " + getLastName() + ", " + getTitle() + ", " + getYOB();
    }

    /**  toJSON
     * Converts an arraylist of person data into a JSON data string
     * @return Returns a JSON data String with person data
     */
    public String toJSON() {
        String returnString = "";
        char DQ = '\u0022';
        returnString = "{" + DQ + "ID" + DQ + ":" + DQ + this.ID + DQ + ",";
        returnString += " " + DQ + "firstName" + DQ + ":" + DQ + this.firstName + DQ + ",";
        returnString += " " + DQ + "lastName" + DQ + ":" + DQ + this.lastName + DQ + ",";
        returnString += " " + DQ + "title" + DQ + ":" + DQ + this.title + DQ + ",";
        returnString += " " + DQ + "YOB" + DQ + ":"  + DQ + this.YOB + DQ + "}";
        return returnString;
    }

    /**  toXML
     * Converts an arraylist of person data into an XML data string
     * @return Returns an XML data String with person data
     */
    public String toXML() {
        String returnString = "";
        returnString = "<Person>";
        returnString += "<ID>" + this.ID + "</ID>";
        returnString += "<firstName>" + this.firstName + "</firstName>";
        returnString += "<lastName>" + this.lastName + "</lastName>";
        returnString += "<title>" + this.title + "</title>";
        returnString += "<YOB>" + this.YOB + "</YOB></Person>";
        return returnString;
    }
}