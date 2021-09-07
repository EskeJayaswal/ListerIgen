import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest {

    Liste liste = new Liste();

    @Test
    void isEmpty()
    {
        Node n = new Node("Viktor");
        assertEquals(true, liste);
        liste.insertFromHead(n);
        assertEquals(false, liste);
    }

    @Test
    void insertFromHead()
    {

    }

    @Test
    void printListFromHead()
    {
        liste.insertFromHead(new Node("1"));
        liste.insertFromHead(new Node("2"));
        liste.insertFromHead(new Node("3"));

        assertEquals("321",liste.printFromHead());
    }

    @Test
    void printListFromTail()
    {
        liste.insertFromHead(new Node("1"));
        liste.insertFromHead(new Node("2"));
        liste.insertFromHead(new Node("3"));
        assertEquals("123",liste.printFromTail());
    }

    @Test
    void removeFromHead()
    {

        assertEquals(null,liste.removeFromHead());

        Node n = new Node("1");
        liste.insertFromHead(n);

        assertEquals(null,liste.removeFromHead());

        Node node = new Node("1");
        Node node1 = new Node("2");
        Node node2 = new Node("3");
        Node node3 = new Node("4");

        liste.insertFromHead(node);
        liste.insertFromHead(node1);
        liste.insertFromHead(node2);
        liste.insertFromHead(node3);

        System.out.println(liste.printFromTail());

        assertEquals(node3,liste.removeFromHead());

        System.out.println(liste.printFromTail());
    }


}