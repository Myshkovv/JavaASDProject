package tests;

import main.AdditionalTasksLinkedList;
import main.CustomList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class AdditionalTasksLinkedListTest {

    private CustomList list;

    @BeforeEach
    void setUp(){
        list = new CustomList(new int[] {1, 2, 3, 4, 5, 6});
    }

    @Test
    @DisplayName("Удаление повторяющихся элементов")
    void testDelDuplicates(){
        list.addMiddle(0, 1);
        list.addMiddle(0, 1);
        list.addMiddle(3, 2);
        list.addMiddle(6, 4);

        CustomList list1 = AdditionalTasksLinkedList.delDuplicates(list);

        CustomList list2 = new CustomList(new int[] {1, 2, 3, 4, 5, 6});

        assertEquals(list2, list1, "при удалении должно получится [1, 2, 3, 4, 5, 6]");

    }

    @Test
    @DisplayName("Удаление повторяющихся элементов другой способ")
    void testDelDuplicatesVers2(){
        list.addMiddle(0, 1);
        list.addMiddle(0, 1);
        list.addMiddle(3, 2);
        list.addMiddle(6, 4);

        AdditionalTasksLinkedList.delDuplicatesVers2(list);

        CustomList list2 = new CustomList(new int[] {1, 2, 3, 4, 5, 6});

        assertEquals(list2, list, "при удалении должно получится [1, 2, 3, 4, 5, 6]");

    }




}
