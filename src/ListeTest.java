import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest
{

    Liste liste = new Liste();

    @Test
    void isEmpty()
    {
        assertEquals(true, liste);
        liste.insertFromHead("Viktor");
        assertEquals(false, liste);

    }

    @org.testng.annotations.Test
    void insertFromHead()
    {

    }
}