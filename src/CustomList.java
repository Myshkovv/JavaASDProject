public class CustomList {
    // указатель на начало списка
    private Node start;

    public CustomList(int info){
        start = new Node(info);
    }

    public CustomList(int[] massiv){
        for (int i = massiv.length-1; i>=0; i--){
            add(massiv[i]);
        }
    }

    public void add(int info){
        Node node = new Node(info);
        node.nextNode = start;
        start = node;
    }

    public void print(){
        if (start == null){
            System.out.println("Список пуст.");
            return;
        }
        // указатель
        Node pointer = start;


        while (pointer != null){
            if (pointer.nextNode == null){
                System.out.print(pointer.info);
            }
            else{
                System.out.print(pointer.info + ", ");
            }
            pointer = pointer.nextNode;
        }
        System.out.println();
    }

    public void deleteLast(){

        if (start == null){
            System.out.print("Список пуст. Удаление невозможно.");
            return;
        }
        // отдельно обрабатываем случай с одним элементом в списке
        if (start.nextNode == null){
            start = null;
            return;
        }
        // случай более одного элемента
        Node pointer = start;
        // идем к предпоследнему элементу
        while (pointer.nextNode.nextNode == null){
            pointer = pointer.nextNode;
        }
        pointer.nextNode = null;

    }
}
