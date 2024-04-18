import java.util.*;

public class L1642 {
    final static Scanner sc = new Scanner(System.in);

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        int ans = 0;
        int delta[] = new int[heights.length];
        for (int i = 1; i < delta.length; i++) {
            delta[i] = heights[i] - heights[i - 1];
        }
        int sum = 0;
        for (int i : delta) {
            if (i > 0) {
                sum += i;
            }
        }

        for (int i = 1; i < heights.length; i++) {
            int diff = heights[i] - heights[i - 1];
            if (heights[i - 1] >= heights[i]) {
                ans++;
            } else {
                if (bricks > 0 || ladders > 0) {
                    if (diff <= bricks) {
                        bricks -= (diff);
                        ans++;
                    } else {
                        if (ladders > 0) {
                            ladders--;
                            ans++;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();
        System.out.println(furthestBuilding(new int[]{4, 2, 7, 6, 9, 14, 12}, 5, 1));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}