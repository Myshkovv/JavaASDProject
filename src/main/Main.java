package main;

import java.util.ArrayList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        TNode node1 = new TNode(5);
        TNode node2 = new TNode(3);
        TNode node3 = new TNode(9);
        TNode node4 = new TNode(91);
        TNode node5 = new TNode(85);
        TNode node6 = new TNode(8);
        TNode node7 = new TNode(7);
        TNode node8 = new TNode(1);
        TNode node9 = new TNode(2);
        TNode node10 = new TNode(44);
        TNode node11 = new TNode(19);

        node1.nodeList.add(node2);
        node1.nodeList.add(node3);
        node1.nodeList.add(node4);

        node2.nodeList.add(node5);
        node2.nodeList.add(node6);
        node2.nodeList.add(node7);
        node4.nodeList.add(node8);

        node8.nodeList.add(node9);
        node9.nodeList.add(node10);
        node9.nodeList.add(node11);

        ArrayList<TNode> nodes = new ArrayList<>() ;
        nodes.add(node1);

        width(nodes);
        depth(node1);

    }


    public static void width(ArrayList<TNode> Tnodes){
        if (Tnodes == null){
            return;
        }
        ArrayList<TNode> childrenNodes = new ArrayList<>() ;

        for (TNode node : Tnodes){
                System.out.print(node.info + " ");
                for (TNode childrenNode : node.nodeList){
                    childrenNodes.add(childrenNode);
                }

        }
        System.out.println();
        if (!childrenNodes.isEmpty()){
            width(childrenNodes);
        }
    }

    public static void depth(TNode node){
        if (node == null){
            return;
        }
        System.out.print(node.info + " ");
        for (TNode childNode : node.nodeList){

            depth(childNode);
        }
    }






}
