package tests;

import main.CustomList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListEqualsTest {

    private CustomList list1;
    private CustomList list2;

    @BeforeEach
    void setUp() {
        list1 = new CustomList();
        list2 = new CustomList();
    }

    @Test
    @DisplayName("Два пустых списка должны быть равны")
    void testEquals_EmptyLists() {
        assertEquals(list1, list2, "Пустые списки должны быть равны");
    }

    @Test
    @DisplayName("Списки с одинаковыми элементами должны быть равны")
    void testEquals_SameElements() {
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        list2.add(3);

        assertEquals(list1, list2, "Списки с одинаковыми элементами должны быть равны");
    }

    @Test
    @DisplayName("Списки с разной длиной должны быть не равны")
    void testEquals_DifferentLength() {
        list1.add(1);
        list1.add(2);

        list2.add(1);
        assertNotEquals(list1, list2, "Списки разной длины не должны быть равны");
    }

    @Test
    @DisplayName("Списки одинаковой длины, но с разными элементами должны быть не равны")
    void testEquals_DifferentElements() {
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(9);
        list2.add(3);

        assertNotEquals(list1, list2, "Списки с разными элементами не должны быть равны");
    }

}
