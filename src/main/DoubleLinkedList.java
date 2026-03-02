package main;

public class DoubleLinkedList {
    // указатель на начало списка
    private DoubleNode start;

    public DoubleLinkedList() {
        start = null;
    }

    public DoubleLinkedList(int info){
        start = new DoubleNode(info);
    }

    public DoubleLinkedList(int[] massiv){
        for (int i = massiv.length-1; i>=0;i--){
            addFinish(massiv[i]);
        }
    }

    public void addStart(int info){
        DoubleNode node = new DoubleNode(info);
        node.nextNode = start;
        start.previousNode = node;
        start = node;
    }

    public void addFinish(int info){
        if (start == null){
            start = new DoubleNode(info);
            return;
        }

        DoubleNode pointer = start;

        while (pointer.nextNode != null){
            pointer = pointer.nextNode;
        }
        DoubleNode node = new DoubleNode(info);
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
        DoubleNode pointer = start;
        while (pointer.nextNode.nextNode != null){
            pointer = pointer.nextNode;
        }
        pointer.nextNode = null;
    }

    public int length(){
        DoubleNode pointer = start;
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
        DoubleNode pointer = start;
        while (counter<index-1){
            pointer = pointer.nextNode;
            counter++;
        }
        DoubleNode node = new DoubleNode(info);
        node.nextNode = pointer.nextNode;
        node.previousNode = pointer;
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
        DoubleNode pointer = start;
        while (counter<index-1){
            pointer = pointer.nextNode;
            counter++;
        }
        DoubleNode node = pointer.nextNode.nextNode;
        node.previousNode = pointer;
        pointer.nextNode = node;

    }


}
