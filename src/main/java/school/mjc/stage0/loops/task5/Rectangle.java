package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        String[][] rectangle = new String[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == length - 1) {
                    rectangle[i][j] = "8";
                    continue;
                }
                rectangle[i][j] = " ";
            }
        }
        for (String[] strings : rectangle) {
            for (int j = 0; j < length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }
    }
}
