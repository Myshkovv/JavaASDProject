
public class Main {
    public static void main(String[] args) {


        CustomList customList = new CustomList(1);
        customList.print();
        int[] massiv = new int[] {1, 2, 3, 4};
        CustomList customList1 = new CustomList(massiv);
//        customList1.add(5);
        customList1.print();

//        customList.deleteLast();
//        customList.print();
//        customList.deleteLast();
        customList1.deleteLast();
        customList1.print();
        customList1.reverse();
        customList.reverse();
        customList.print();
        customList1.print();
        System.out.println("Длина списка: " + customList1.length());
        System.out.println("Есть ли элемент 2: " + customList1.itHere(2));
        customList1.indexesOf(2);
        customList1.add(2);
        customList1.print();
        customList1.indexesOf(2);
        System.out.println("список пуст? " + customList.itsNull());


    }
}
