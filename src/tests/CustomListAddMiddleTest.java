package tests;

import main.CustomList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListAddMiddleTest {

    private CustomList list;

    @BeforeEach
    void setUp(){
        list = new CustomList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }

    @Test
    @DisplayName("добавление в середину")
    void testAddMiddle_toMiddleIndex(){
        list.addMiddle(2, 42);

        CustomList expected = new CustomList();

        expected.add(1);
        expected.add(2);
        expected.add(42);
        expected.add(3);
        expected.add(4);

        assertEquals(expected, list, "Список должен содержать [1, 2, 42, 3, 4]");

    }

    @Test
    @DisplayName("добавление в начало")
    void testAddMiddle_toStart(){

        list.addMiddle(0, 42);

        CustomList list2 = new CustomList(new int[] {42, 1, 2, 3, 4});

        assertEquals(list2, list, "Список должен содержать [42, 1, 2, 3, 4]");

    }
}
