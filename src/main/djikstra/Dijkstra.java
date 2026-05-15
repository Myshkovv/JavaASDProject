package main.djikstra;

public class Dijkstra {
    public static int[] findShortPaths(int[][] graph, int start){

        int size = graph.length;
        boolean[] isVisited = new boolean[size];
        int[] line = new int[size];

        for (int i = 0; i < size; i++){


            if (i != start){
                line[i] = Integer.MAX_VALUE;
            } else {
                line[i] = 0;
            }
        }
        for (int i = 0; i < size; i++){
            int lineInGraph = -1;
            int minInLine = Integer.MAX_VALUE;
            for (int j = 0; j< size; j++){
                if (!isVisited[j] && line[j] < minInLine) {
                    minInLine = line[j];
                    lineInGraph = j;
                }
            }
            if (lineInGraph == -1) break;
            isVisited[lineInGraph] = true;

            for (int j = 0; j < size; j++){
                if (!isVisited[j] && graph[lineInGraph][j] != 0){
                    line[j] = Math.min(line[j], line[lineInGraph] + graph[lineInGraph][j]);
                }
            }
        }
        return line;

    }
}
