package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        int n = 1;
        for (int i = 0; i < cathetusLength; i++) {
            int j = 0;
            while (j != n) {
                System.out.print("8");
                j++;
            }
            n++;
            System.out.println();
        }
    }
}
