package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height == 0) return;
        int n = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j > n - 1 && j < height - n) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            n++;
            System.out.println();
            if (n == height/2) break;
        }
        if (height%2 == 0) n--;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j > n -1 && j < height - n) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            n--;
            System.out.println();
            if (n < 0) break;
        }
    }
}
