package school.mjc.stage0.loops.task5;

public class Square {

    public void printSquareFrom8s(int sideLength) {
        String[][] square = new String[sideLength][sideLength];

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                if (j == 0 || j == sideLength - 1 || i == 0 || i == sideLength - 1) {
                    square[i][j] = "8";
                    continue;
                }
                square[i][j] = " ";
            }
        }
        for (String[] strings : square) {
            for (int j = 0; j < square.length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }
    }
}
