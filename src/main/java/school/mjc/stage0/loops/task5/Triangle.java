package school.mjc.stage0.loops.task5;

public class Triangle {

    public static void printTriangle(int cathetusLength) {
        String[][] triangle = new String[cathetusLength][cathetusLength];
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle.length; j++) {
                if (i == j || i > j) {
                    triangle[i][j] = "8";
                    continue;
                }
                triangle[i][j] = " ";
            }
        }
        for (String[] strings : triangle) {
            for (int j = 0; j < triangle.length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }
    }
}
