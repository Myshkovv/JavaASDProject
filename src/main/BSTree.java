//package main;
//
//public class BSTree extends BTree {
//
//
//    public BSTree(int key, String value) {
//        super(key, value);
//    }
//
//    public int height(){
//        return heightRec(root);
//    }
//
//    private int heightRec(BTNode node) {
//        if (node == null){
//            return -1;
//        }
//        int leftHeight = heightRec(node.leftNode);
//        int rightHeight = heightRec(node.rightNode);
//        return Math.max(leftHeight, rightHeight) +1;
//    }
//
//    public void smallLeftTurn(BTNode node){
//        BTNode parentA = node.parent;
//        BTNode pointerB = root.rightNode;
//        BTNode poiner;
//    }
//}
