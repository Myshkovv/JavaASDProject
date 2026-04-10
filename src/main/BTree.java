package main;

public class BTree {
    private BTNode root;

    public BTree(int key, String value){
        this.root = new BTNode(key, value);
    }

    public void add(int key, String value){
        BTNode node = new BTNode(key, value);
        if (root == null){
            root = node;
            return;
        }
        addR(node, root);

    }

    private void addR(BTNode newNode, BTNode currentNode){
        if (newNode.key == currentNode.key){
            currentNode = newNode;
            return;
        }
        if (newNode.key < currentNode.key){
            if (currentNode.leftNode == null){
                currentNode.leftNode = newNode;
            } else {
                addR(newNode, currentNode.leftNode);
            }
        }
        if(newNode.key > currentNode.key){
            if (currentNode.rightNode == null){
                currentNode.rightNode = newNode;
            } else {
                addR(newNode, currentNode.rightNode);
            }

        }
    }

    public String remove(int key){
        BTNode node = search(key);
        if (node == null){
            System.out.println("пустое дерево");
            return "";
        }
        String info = node.value;
        if (node.rightNode == null && node.leftNode == null){
            node = null;
            return info;
        }
        if ()

    }

    public BTNode search(int key){
        BTNode pointer = root;
        if (pointer == null){
            System.out.println("пустое дерево");
            return pointer;
        }
        while (pointer.rightNode != null || pointer.leftNode != null){
            if (pointer.key == key){
                return pointer;
            }
            if (pointer.key < key){
                pointer = pointer.rightNode;
            }
            if (pointer.key > key){
                pointer = pointer.leftNode;
            }
        }
        return root;
    }

}
