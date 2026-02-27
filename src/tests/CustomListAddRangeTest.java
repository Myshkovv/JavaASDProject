package tests;

import main.CustomList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListAddRangeTest {

    private CustomList list;

    @BeforeEach
    void setUp(){
        list = new CustomList(new int[] {1, 2, 3});

    }

    @Test
    @DisplayName("Добавление диапозон 3 числа")
    void testAddRange_Range3Index(){
        list.addRange(4, 7);

        CustomList list2 = new CustomList(new int[] {1, 2, 3, 4, 5, 6});

        assertEquals(list2, list, "Список должен содержать [1, 2, 3, 4, 5, 6]");
    }

    @Test
    @DisplayName("Добавление диапозон 1 число")
    void testAddRange_Range1Index(){
        list.addRange(4, 5);

        CustomList list2 = new CustomList(new int[] {1, 2, 3, 4});

        assertEquals(list2, list, "Список должен содержать [1, 2, 3, 4]");
    }

    @Test
    @DisplayName("Добавление диапозон ничего")
    void testAddRange_Range0Index(){
        list.addRange(4, 4);

        CustomList list2 = new CustomList(new int[] {1, 2, 3});

        assertEquals(list2, list, "Список должен содержать [1, 2, 3]");
    }





}
