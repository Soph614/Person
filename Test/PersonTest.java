import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person James;

    @BeforeEach
    void setUp() {
        James = new Person("000001", "James", "Falcon", "Mr.", 1940);
    }

    @Test
    void setIDTest() {
        James.setID("000002");
        assertEquals("000002", James.getID());
    }

    @Test
    void setFirstNameTest() {
        James.setFirstName("Jim");
        assertEquals("Jim", James.getFirstName());
    }

    @Test
    void setLastNameTest() {
        James.setLastName("Raab");
        assertEquals("Raab", James.getLastName());
    }

    @Test
    void setTitleTest() {
        James.setTitle("Esq.");
        assertEquals("Esq.", James.getTitle());
    }

    @Test
    void setYOBTest() {
        James.setYOB(1942);
        assertEquals(1942, James.getYOB());
    }

    @Test
    void fullNameTest() {
        assertEquals("James Falcon", James.fullName());
    }

    @Test
    void formalNameTest() {
        assertEquals("Mr. James Falcon", James.formalName());
    }

    @Test
    void getAgeTest() {
        assertEquals(86, James.getAge());
    }

    @Test
    void getAgeInSpecifiedYearTest() {
        assertEquals(60, James.getAge(2000));
    }

    @Test
    void toCSVTest() {
        assertEquals("000001, James, Falcon, Mr., 1940", James.toCSV());
    }

    @Test
    void toJSONTest() {
        char DQ = '\u0022';
        assertEquals("{" + DQ + "ID" + DQ + ":" + DQ + "000001" + DQ + ", "
                + DQ + "firstName" + DQ + ":" + DQ + "James" + DQ + ", "
                + DQ + "lastName" + DQ + ":" + DQ + "Falcon" + DQ + ", "
                + DQ + "title" + DQ + ":" + DQ + "Mr." + DQ + ", "
                + DQ + "YOB" + DQ + ":" + DQ + "1940" + DQ + "}", James.toJSON());
    }

    @Test
    void toXMLTest() {
        assertEquals("<Person>" +
                                "<ID>000001</ID>" +
                                "<firstName>James</firstName>" +
                                "<lastName>Falcon</lastName>" +
                                "<title>Mr.</title>" +
                                "<YOB>1940</YOB>" +
                              "</Person>", James.toXML());
    }
}