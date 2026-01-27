import java.util.Scanner;

public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }



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

    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }


    /**  fullName()
     * Finds a person's full name based on
     * what their first and last names are.
     * @return returns the given person's full name.
     */

    public String fullName() {
        return this.getFirstName() + " " + this.getLastName();
    }


    /**  formalName()
     * Finds a person's formal name based on their
     * title and what their first and last names are.
     * @return returns the person's formal name.
     */

    public String formalName() {
        return this.getTitle() + " " + this.getFirstName() + " " + this.getLastName();
    }


    /**  getAge()
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


    /**  toCSV()
     * Takes data from a Person arraylist and
     * inputs it into a comma-separated value.
     * @return Returns a csv record with the person's
     * ID, first name, last name, title, and YOB.
     */

    public String toCSV() {
        return getID() + ", " + getFirstName() + ", " + getLastName() + ", " + getTitle() + ", " + getYOB();
    }

    /**  toJSON()
     * Converts an arraylist of person data into a JSON data string
     * @return Returns a JSON data String with the person data
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