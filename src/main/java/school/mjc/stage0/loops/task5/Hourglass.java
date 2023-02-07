package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height%2 == 0){
            for (int i = 0; i < height/2; i++) {
                for (int k = 0; k < i; k++)  {
                    System.out.print(" ");
                }
                for (int j = i; j < height/2; j++) {
                    System.out.print("8");
                }
                for (int j = i; j < height/2; j++) {
                    System.out.print("8");
                }
                for (int k = 0; k < i; k++)  {
                    System.out.print(" ");
                }
                System.out.println();
            }
            for (int i = height/2; i > 0; i--) {
                for (int k = 1; k < i; k++) {
                    System.out.print(" ");
                }
                for (int j = i; j <= height/2; j++) {
                    System.out.print("8");
                }
                for (int j = i; j <= height/2; j++) {
                    System.out.print("8");
                }
                for (int k = 1; k < i; k++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }else {
            int h = height/2;
            for (int i = 0; i <= h; i++) {
                for (int k = 0; k < i; k++)  {
                    System.out.print(" ");
                }
                for (int j = i; j <= h; j++) {
                    System.out.print("8");
                }
                for (int j = i; j < h; j++) {
                    System.out.print("8");
                }
                for (int k = 0; k < i; k++)  {
                    System.out.print(" ");
                }
                System.out.println();
            }
            for (int i = h-1; i >= 0; i--) {
                for (int k = 0; k < i; k++) {
                    System.out.print(" ");
                }
                for (int j = i; j <= h; j++) {
                    System.out.print("8");
                }
                for (int j = i; j < h; j++) {
                    System.out.print("8");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
