//package main;
//
//public class CustomArrayList <T> implements CustomCollection {
//    private T[] data;
//    private int startIndex;
//    private int endIndex;
//
//
//    public CustomArrayList(T info){
//        data = new T[] {info};
//    }
//
//    public CustomArrayList(T[] array){
//        data = array;
//        endIndex = array.length-1;
//    }
//
//    public void addStart(T info){
//        if (data == null){
//            T[] newData = new T[1];
//            newData[0] = info;
//            return;
//        }
//
//        if (startIndex != 0){
//            startIndex--;
//            data[startIndex] = info;
//            return;
//        } else if (startIndex ==0) {
//            T[] newData = new T[endIndex+1];
//            newData[0] = info;
//            int index = 1;
//            for (T info1:data){
//                newData[index] = info1;
//            }
//            this.data = newData;
//        }
//    }
//
//    public void deleteFromStart(){
//        if (data == null){
//            return;
//        }
//        if (startIndex == endIndex){
//            data = null;
//            return;
//        }
//        startIndex++;
//    }
//
//
//
//}
