package main;

import java.util.ArrayList;

public class TNode {
    int info;
    ArrayList<TNode> nodeList;

    public TNode(int info){
        this.info = info;
        nodeList = new ArrayList<TNode>();
    }



//    public void addChild(TNode node){
//        nodeList.add(node);
//    }
//
//    public void addChild(int info){
//        TNode node = new TNode(info);
//        nodeList.add(node);
//    }

}
