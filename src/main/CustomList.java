package main;

public class CustomList {
    // указатель на начало списка
    private Node start;

    public CustomList(){
        start = null;
    }

    public CustomList(int info){
        start = new Node(info);
    }

    public CustomList(int[] massiv){
        for (int i = massiv.length-1; i>=0; i--){
            addToFirst(massiv[i]);
        }
    }
    // добавление в начало
    public void addToFirst(int info){
        Node node = new Node(info);
        node.nextNode = start;
        start = node;
    }
    // в конец
    public void add(int info){
        if (start == null){
            start = new Node(info);
            return;
        }
        Node pointer = start;
        // идем к последнему элементу
        while (pointer.nextNode != null){
            pointer = pointer.nextNode;
        }
        pointer.nextNode = new Node(info);
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
    // вложить в середину
    public void addMiddle(int index, int information){
        if (index < 0 || index > length()) {
            System.out.println("Индекс не подходит");
        }

        if (index == 0){
            addToFirst(information);
            return;
        }

        Node pointer = start;
        Node newNode = new Node(information);
        int counter = 0;

        while (counter != index-1){
            counter++;
            pointer = pointer.nextNode;
        }
        newNode.nextNode = pointer.nextNode;
        pointer.nextNode = newNode;

    }


    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CustomList customList2 = (CustomList) obj;

        if (length() == customList2.length()){
            Node pointer = start;
            Node pointer2 = customList2.start;

            while (pointer != null) {
                if (pointer.info != pointer2.info){
                    return false;
                }
                pointer = pointer.nextNode;
                pointer2 = pointer2.nextNode;
            }
            return true;

        }
        else {
            return false;
        }
    }

    //Добавить диапозон значений
    public void addRange(int infoStart, int infoFinish){
        if (infoStart < infoFinish){
            for (int i = infoStart; i < infoFinish; i++){
                add(i);
            }
        }
        else {
            System.out.println("Неправильный диапозон значений");
        }
    }

    public void deleteFirst(){
        start = start.nextNode;
    }

    public void deletePosition(int index){
        if (index < 0 || index>= length()){
            System.out.println("Недопустимый индекс");
            return;
        }

        if (index == 0){
            deleteFirst();
            return;
        }
        if (index == length()-1){
            deleteLast();
            return;
        }
        int counter = 0;
        Node pointer = start;

        while ((counter < index-1)){
            pointer = pointer.nextNode;
            counter++;
        }
        pointer.nextNode = pointer.nextNode.nextNode;
    }

    public void deleteStartingFrom(int index){
        if (index < 0 || index>= length()){
            System.out.println("Недопустимый индекс");
            return;
        }
        if (index == 0){
            start = null;
            return;
        }
        int counter = 0;
        Node pointer = start;

        while (counter < index-1){
            pointer = pointer.nextNode;
            counter++;
        }
        pointer.nextNode = null;
    }

    public void deleteValue(int info){
        if (start == null) {
            return;
        }
        while (start != null && start.info == info) {
            start = start.nextNode;
        }
        Node pointer = start;
        while (pointer.nextNode != null){
            if (pointer.nextNode.info == info){
                pointer.nextNode = pointer.nextNode.nextNode;
            } else {
                pointer = pointer.nextNode;
            }

        }

    }

}
