package main;

public class BTree {
    public BTNode root;

    public BTree(int key, String value){
        this.root = new BTNode(key, value);
    }

    public void insert(BTNode node, int key, String value){
        if (key < node.key){
            if (node.leftNode == null) node.leftNode = new BTNode(key, value);
            else insert(node.leftNode, key, value);
        }
        else if (key > node.key) {
            if (node.rightNode == null) node.rightNode = new BTNode(key, value);
            else insert(node.rightNode, key, value);
        }
        else {
            node = new BTNode(key, value);
        }
    }

    public BTNode search(BTNode node, int key){
        if (node == null) return null;
        if (node.key == key) return node;
        return (key < node.key) ? search(node.leftNode, key) : search(node.rightNode, key);
    }

    public BTNode getMin(BTNode node){
        if (node == null) return null;
        if (node.leftNode == null) return node;
        return getMin(node.leftNode);
    }

    public BTNode getMax(BTNode node){
        if (node == null) return null;
        if (node.rightNode == null) return node;
        return getMax(node.rightNode);
    }

    public BTNode delete(BTNode node, int key){
        if (node == null) return null;
        else if (key < node.key) node.leftNode = delete(node.leftNode, key);
        else if (key > node.key) node.rightNode = delete(node.rightNode, key);
        else {
            if (node.leftNode == null || node.rightNode == null){
                node = (node.leftNode == null) ? node.rightNode : node.leftNode;
            }
            else {
                BTNode minRight = getMin(node.rightNode);
                node.key = minRight.key;
                node.value = minRight.value;
                node.rightNode = delete(node.rightNode, minRight.key);
            }
        }
        return node;
    }
    //симетричный обход
    public void printTree(BTNode node){
        if (node == null) return;
        printTree(node.leftNode);
        System.out.print(node.value);
        printTree(node.rightNode);
    }
    //обратный обход
    public void deleteTree(BTNode node){
        if (node == null) return;
        deleteTree(node.leftNode);
        deleteTree(node.rightNode);
        System.out.print(node.value);
    }
    // прямой обход
    public void copyTree(BTNode node){
        if (node == null) return;
        System.out.println(node.value);
        copyTree(node.leftNode);
        copyTree(node.rightNode);
    }

    public int heightTree() {
        return heightRecursive(root);
    }

    private int heightRecursive(BTNode node) {
        if (node == null) {
            return -1; // Высота пустого дерева = -1 (количество рёбер)
        }
        int leftHeight = heightRecursive(node.leftNode);
        int rightHeight = heightRecursive(node.rightNode);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int depth(int key) {
        return depthRecursive(root, key, 0);
    }

    private int depthRecursive(BTNode node, int key, int currentDepth) {
        if (node == null) {
            return -1; // Узел не найден
        }
        if (node.key == key) {
            return currentDepth;
        }
        if (key < node.key) {
            return depthRecursive(node.leftNode, key, currentDepth + 1);
        } else {
            return depthRecursive(node.rightNode, key, currentDepth + 1);
        }
    }



//    public String remove(int key){
//        BTNode node = search(key);
//        if (node == null){
//            System.out.println("пустое дерево");
//            return "";
//        }
//        String info = node.value;
//        if (node.rightNode == null && node.leftNode == null){
//            node = null;
//            return info;
//        }
//
//    }

//    public BTNode search(int key){
//        BTNode pointer = root;
//        if (pointer == null){
//            System.out.println("пустое дерево");
//            return pointer;
//        }
//        while (pointer.rightNode != null || pointer.leftNode != null){
//            if (pointer.key == key){
//                return pointer;
//            }
//            if (pointer.key < key){
//                pointer = pointer.rightNode;
//            }
//            if (pointer.key > key){
//                pointer = pointer.leftNode;
//            }
//        }
//        return root;
//    }

}
