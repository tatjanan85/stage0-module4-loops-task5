package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (i == j || i + j == height + 1 || i == 1 || i == height) {
                    System.out.print(8);
                } else {
                    if (i <= height / 2 && j > i && j < height - i + 1) {
                        System.out.print(8);
                    } else if (i > height / 2 + 1 && j < i && j > height - i + 1) {
                        System.out.print(8);
                    } else {
                        System.out.print(" ");
                    }
                }

            } System.out.println();
        }
    }
}
