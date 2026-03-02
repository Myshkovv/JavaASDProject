package tests;

import main.CustomList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListDeleteValueTest {

    private CustomList list;

    @BeforeEach
    void setUp(){
        list = new CustomList(new int[] {1, 2, 3, 4, 5});
    }

    @Test
    @DisplayName("Удаляем одно вхождение")
    void testDeleteValue_OneElement(){
        list.deleteValue(1);

        CustomList list2 = new CustomList(new int[] {2, 3, 4, 5});

        assertEquals(list2, list, "При удалении должно получится [2, 3, 4, 5]");
    }

    @Test
    @DisplayName("Удаляем несколько вхождение")
    void testDeleteValue_ManyElement(){
        list.addMiddle(2, 1);
        list.addMiddle(4, 1);
        list.addMiddle(6, 1);
        list.deleteValue(1);

        CustomList list2 = new CustomList(new int[] {2, 3, 4, 5});

        assertEquals(list2, list, "При удалении должно получится [2, 3, 4, 5]");
    }

}
