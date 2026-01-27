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


    public String fullName() {
        String firstName = this.getFirstName();
        String lastName = this.getLastName();

        return firstName + " " + lastName;
    }

    public String formalName() {
        String firstName = this.getFirstName();
        String lastName = this.getLastName();
        String fullName = firstName + " " + lastName;
        return title + " " + fullName;
    }

    public int getAge() {
        int YOB = getYOB();
        int currentYear = 2026;
        int age = currentYear - YOB;

        return age;
    }

    public int getAge2(int year) {
        int YOB = this.getYOB();
        int age = year - YOB;

        return age;
    }

    public String toCSV() {
        String ID = this.getID();
        String firstName = this.getFirstName();
        String lastName = this.getLastName();
        String title = this.getTitle();
        int YOB = this.getYOB();

        String csvRecord;
        csvRecord = ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;

        return csvRecord;
    }
}
