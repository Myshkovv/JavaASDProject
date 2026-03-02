package tests;

import main.CustomList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListDeletePositionTest {

    private CustomList list;

    @BeforeEach
    void setUp(){
        list = new CustomList(new int[] {1, 2, 3, 4, 5});
    }

    @Test
    @DisplayName("Удаляем один элемент")
    void testDeletePosition_1Element(){
        CustomList list2 = new CustomList(new int[] {1, 2, 4, 5});

        list.deletePosition(2);

        assertEquals(list2, list, "При удалении должно получится [1, 2, 4, 5]");
    }

    @Test
    @DisplayName("Удаляем первый элемент")
    void testDeletePosition_FirstElement(){
        CustomList list2 = new CustomList(new int[] {2, 3, 4, 5});

        list.deletePosition(0);

        assertEquals(list2, list, "При удалении должно получится [2, 3, 4, 5]");
    }

    @Test
    @DisplayName("Удаляем последний элемент")
    void testDeletePosition_LastElement(){
        CustomList list2 = new CustomList(new int[] {1, 2, 3, 4});

        list.deletePosition(4);

        assertEquals(list2, list, "При удалении должно получится [1, 2, 3, 4]");
    }


}
