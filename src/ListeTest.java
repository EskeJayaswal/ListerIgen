import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest {

    Liste liste = new Liste();

    @Test
    void isEmpty()
    {
        assertEquals(true, liste);
        liste.insertFromHead("Viktor");
        assertEquals(false, liste);
    }

    @Test
    void insertFromHead()
    {

    }

    @Test
    void printListFromHead()
    {
        liste.insertFromHead("1");
        liste.insertFromHead("2");
        liste.insertFromHead("3");

        assertEquals("321",liste.printFromHead());
    }

    @Test
    void printListFromTail()
    {
        liste.insertFromHead("1");
        liste.insertFromHead("2");
        liste.insertFromHead("3");
        assertEquals("123",liste.printFromTail());
    }

}