package tests;

import main.CustomList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListDeleteStartingFromTest {

    private CustomList list;

    @BeforeEach
    void setUp(){
        list = new CustomList(new int[] {1, 2, 3, 4, 5});
    }

    @Test
    @DisplayName("Удаляем один элемент")
    void testDeleteStartingFrom_OneElement(){
        list.deleteStartingFrom(2);

        CustomList list2 = new CustomList(new int[] {1, 2});

        assertEquals(list2, list, "При удалении должно получится [1, 2]");
    }

    @Test
    @DisplayName("Удаляем первый элемент")
    void testDeleteStartingFrom_FirstElement(){
        list.deleteStartingFrom(0);

        CustomList list2 = new CustomList();

        assertEquals(list2, list, "При удалении должно получится []");
    }

    @Test
    @DisplayName("Удаляем последний элемент")
    void testDeleteStartingFrom_LastElement(){
        list.deleteStartingFrom(4);

        CustomList list2 = new CustomList(new int[] {1, 2, 3, 4});

        assertEquals(list2, list, "При удалении должно получится [1, 2, 3, 4]");
    }

}
