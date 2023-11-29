package homework.task_2;

public class Matrix {
    public static void main(String[] args) {
        int [][] arrays1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int [][] arrays2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int [][] arrays3 = new int[arrays1.length][arrays2[0].length];

        Utils.printArray(arrays1);
        Utils.printArray(arrays2);

        for (int o = 0; o < arrays3.length; o++) {
            for (int i = 0; i < arrays3.length; i++) {
                for (int j = 0; j < arrays1[0].length; j++) {
                    arrays3[o][i] += arrays1[o][j] * arrays2[j][i];
                }
            }
        }
        Utils.printArray(arrays3);
    }
}
