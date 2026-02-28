public class CustomList {
    // указатель на начало списка
    private Node start;

    public CustomList(int info){
        start = new Node(info);
    }

    public void addStart(int info){
        Node node = new Node(info);
        node.nextNode = start;
        start.previousNode = node;
        start = node;
    }

    public void addFinish(int info){
        if (start == null){
            start = new Node(info);
            return;
        }
        if (start.nextNode == null){
            Node node = new Node(info);
            start.nextNode = node;
            node.previousNode = start;
            return;
        }

        Node pointer = start;

        while (pointer.nextNode != null){
            pointer = pointer.nextNode;
        }
        Node node = new Node(info);
        pointer.nextNode = node;
        node.previousNode = pointer;
    }

    public void deleteStart(){
        if (start == null){
            System.out.println("Удаление невозможно");
            return;
        }
        if (start.nextNode == null){
            start = null;
            return;
        }
        start = start.nextNode;
        start.previousNode = null;
    }

    public void deleteFinish(){
        if (start == null){
            System.out.println("Удаление невозможно");
            return;
        }
        if (start.nextNode == null){
            start = null;
            return;
        }
        Node pointer = start;
        while (pointer.nextNode.nextNode != null){
            pointer = pointer.nextNode;
        }
        pointer.nextNode = null;
    }

    public int length(){
        Node pointer = start;
        int count = 0;
        while (pointer!=null){
            pointer = pointer.nextNode;
            count++;
        }
        return count;
    }

    public void addPosition(int index, int info){
        if (index < 0 || index >= length()){
            System.out.println("Невозможный индекс");
            return;
        }
        if (index == 0){
            addStart(info);
            return;
        }
        if (index == length()){
            addFinish(info);
            return;
        }
        int counter = 0;
        Node pointer = start;
        while (counter<index-1){
            pointer = pointer.nextNode;
            counter++;
        }
        Node node = new Node(info);
        pointer.nextNode.previousNode = node;
        pointer.nextNode = node;
    }

    public void deletePosition(int index){
        if (index < 0 || index >= length()){
            System.out.println("Невозможный индекс");
            return;
        }
        if (index == 0){
            deleteStart();
            return;
        }
        if (index == length()-1){
            deleteFinish();
            return;
        }
        int counter = 0;
        Node pointer = start;
        while (counter<index-1){
            pointer = pointer.nextNode;
            counter++;
        }
        Node node = pointer.nextNode.nextNode;
        node.previousNode = pointer;
        pointer.nextNode = node;

    }


}
