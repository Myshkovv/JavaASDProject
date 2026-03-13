package main;

public class AdditionalTasksLinkedList {

    public static CustomList delDuplicates(CustomList list){
        CustomList goodList = new CustomList();

        int lastInfo;

        for (int i = 0; i< list.length(); i++){
            if (!goodList.itHere(list.get(i))){
                goodList.add(list.get(i));
            }
        }
        return goodList;
    }

    public static void delDuplicatesVers2(CustomList list){
        int lastInfo = list.get(list.length()-1);

        for (int i = list.length()-2; i>=0; i--){
            if (lastInfo == list.get(i)){
                list.deletePosition(i);
            }
            lastInfo = list.get(i);
        }

    }

    public static String afterSwapPairs(CustomList list){
        list.swapPairs();
        String string = "";

        for (int i = 0; i<4; i++){
            string += (list.get(i) + " ");

        }
        return string;
    }

    public static int startCycle(CustomList list){
        return list.startCycle().info;
    }



}
