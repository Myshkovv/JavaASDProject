package main;

public class BTNode {

    int key;
    String value;
    BTNode leftNode;
    BTNode rightNode;
    BTNode parent;

    int height = 0;


    BTNode(int key, String value){
        this.key = key;
        this.value = value;
    }



}

