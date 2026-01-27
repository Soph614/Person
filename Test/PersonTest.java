import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void fullNameTest() {
        Person bilbo = new Person("000001", "Bilbo", "Baggins", "Esq.", 1940);
        assertEquals("Bilbo Baggins", bilbo.fullName());
    }

    @Test
    void formalNameTest() {
        Person bilbo = new Person("000001", "Bilbo", "Baggins", "Esq.", 1940);
        assertEquals("Esq. Bilbo Baggins", bilbo.formalName());
    }

    @Test
    void getAgeTest() {
        Person bilbo = new Person("000001", "Bilbo", "Baggins", "Esq.", 1940);
        assertEquals(86, bilbo.getAge());
    }

    @Test
    void getAgeInSpecifiedYearTest() {
        Person bilbo = new Person("000001", "Bilbo", "Baggins", "Esq.", 1940);
        assertEquals(60, bilbo.getAge(2000));
    }

    @Test
    void toCSV() {
        Person bilbo = new Person("000001", "Bilbo", "Baggins", "Esq.", 1940);
        assertEquals("000001, Bilbo, Baggins, Esq., 1940", bilbo.toCSV());
    }

    @Test
    void toJSON() {
        Person bilbo = new Person("000001", "Bilbo", "Baggins", "Esq.", 1940);
        char DQ = '\u0022';
        assertEquals("{" + DQ + "ID" + DQ + ":" + DQ + "000001" + DQ + ", "
                + DQ + "firstName" + DQ + ":" + DQ + "Bilbo" + DQ + ", "
                + DQ + "lastName" + DQ + ":" + DQ + "Baggins" + DQ + ", "
                + DQ + "title" + DQ + ":" + DQ + "Esq." + DQ + ", "
                + DQ + "YOB" + DQ + ":" + DQ + "1940" + DQ + "}", bilbo.toJSON());
    }
}