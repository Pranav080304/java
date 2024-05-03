import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        int x = 0;
        int y = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        int direction = 0;

        while (x != M / 2 || y != N / 2) {
            System.out.println(x + " " + y);
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            if (nx < 0 || nx >= M || ny < 0 || ny >= N || isObstacle(nx, ny)) {
                direction = (direction + 1) % 4;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }

        System.out.println(M / 2 + " " + N / 2);
    }

    public static boolean isObstacle(int x, int y) {
        // Implement your own logic to check if (x, y) is an obstacle
        return false;
    }
}