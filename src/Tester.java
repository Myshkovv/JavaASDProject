public class Tester {

    public boolean testAddMiddle(){
        int[] massiv = new int[] {1, 2, 3, 4};
        int[] massiv = new int[] {1, 2, 42 3, 4};
        CustomList testList = new CustomList(massiv);
        CustomList testList2 = new CustomList(massiv);
        System.out.println("Проверяем добавление в начало списка");
        testList.addMiddle(0, 42);


    }

}
