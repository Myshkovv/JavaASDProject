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
            System.out.println("Список пуст. Удаление невозможно.");
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
        while (pointer.nextNode.nextNode != null){
            pointer = pointer.nextNode;
        }
        pointer.nextNode = null;
    }
    // переворот
    public void reverse(){
        Node pointer = start;
        // предудущий
        Node previous = null;
        // следущий
        Node next;
        while (pointer != null){
            next = pointer.nextNode;
            pointer.nextNode = previous;
            previous = pointer;
            pointer = next;
        }
        start = previous;
    }
    // длина списка
    public int length(){
        Node pointer = start;
        int count = 0;
        while (pointer!=null){
            count+=1;
            pointer = pointer.nextNode;
        }
        return count;
    }
    // проверка на пустоту
    public boolean itsNull(){
        return start == null;
    }
    // наличие элемента
    public boolean itHere(int i){
        Node pointer = start;
        while (pointer.nextNode != null){
            if (pointer.info == i){
                return true;
            }
            pointer = pointer.nextNode;
        }
        return false;
    }
    // выдать индексы вхождения
    public void indexesOf(int i){
        Node pointer = start;
        int counter = 0;

        while (pointer.nextNode != null){
            if (pointer.info == i){
                System.out.print(counter + " ");;
            }
            pointer = pointer.nextNode;
            counter+=1;
        }
        System.out.println();
    }
}
