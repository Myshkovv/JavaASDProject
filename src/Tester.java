public class Tester {

    public static boolean testAddMiddle(){
        int[] massiv1 = new int[] {1, 2, 3, 4};
        int[] massiv2 = new int[] {1, 2, 42, 3, 4};
        CustomList testList1 = new CustomList(massiv1);
        CustomList testList2 = new CustomList(massiv2);
        System.out.println("Проверяем добавление в начало списка");
        testList1.addMiddle(0, 42);
        if (testList1.equals(testList2)){
            return true;
        }
        return false;


    }

}
