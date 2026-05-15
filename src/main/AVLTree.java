package main;

public class AVLTree extends BTree{


    public AVLTree(int key, String value) {
        super(key, value);
    }

    public int getHeight(BTNode node){
        return node == null ? -1 : node.height;
    }
    // нужно обновлять при изменении дерева
    public  void updateHeight(BTNode node){
        node.height = Math.max(getHeight(node.leftNode), getHeight(node.rightNode)) + 1;
    }

    public int getBalance(BTNode node){
        return (node == null) ? 0 : getHeight(node.rightNode) - getHeight(node.leftNode);
    }

    private void swap(BTNode a, BTNode b){
        int a_key = a.key;
        a.key = b.key;
        b.key = a_key;
        String a_value = a.value;
        a.value = b.value;
        b.value = a_value;
    }
    //малый правый
    public void rightRotate(BTNode node){
        swap(node, node.leftNode);
        BTNode buffer = node.rightNode;
        node.rightNode = node.leftNode;
        node.leftNode = node.rightNode.leftNode;
        node.rightNode.leftNode = node.rightNode.rightNode;
        node.rightNode.rightNode = buffer;
        updateHeight(node.rightNode);
        updateHeight(node);
    }
    public void leftRotate(BTNode node){
        swap(node, node.rightNode);
        BTNode buffer = node.leftNode;
        node.leftNode = node.rightNode;
        node.rightNode = node.leftNode.rightNode;
        node.leftNode.rightNode = node.leftNode.leftNode;
        node.leftNode.leftNode = buffer;
        updateHeight(node.leftNode);
        updateHeight(node);
    }
}
