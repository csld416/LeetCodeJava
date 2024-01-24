import java.util.*;

public class L0054 {
    final static Scanner sc = new Scanner(System.in);

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 1) {
            for (int i = 0; i < matrix[0].length; i++) {
                list.add(matrix[0][i]);
            }
            return list;
        }
        int up = 0, left = 0;
        int down = matrix.length - 1;
        int right = matrix[0].length - 1;
        int total = (down + 1) * (right + 1);
        int i = 0, j = 0;
        if (left == right) {
            for (int k = 0; k < matrix.length; k++) {
                list.add(matrix[k][0]);
            }
        } else {
            while (total-- > 0) {
                System.out.printf("var = %d, i = %d, j = %d, left = %d, right = %d, up = %d, down = %d\n", matrix[i][j], i, j, left, right, up, down);
                list.add(matrix[i][j]);
                if (i == up) {
                    if (j < right) {
                        if (j == left) {
                            if (up > 0) {
                                if (down - 1 != up) {
                                    down -= 1;
                                }
                            }
                        }
                        j += 1;
                    } else if (j == right) {
                        if (up > 0) {
                            if (left + 1 != right) {
                                left += 1;
                            }
                        }
                        i += 1;
                    }
                } else if (i == down) {
                    if (j == right) {
                        if (up + 1 != down) {
                            up += 1;
                        }
                        j -= 1;
                    } else if (j > left) {
                        j -= 1;
                    } else if (j == left) {
                        if (right - 1 != left) {
                            right -= 1;
                        }
                        i -= 1;
                    }
                } else {
                    if (j == right) {
                        i += 1;
                    }
                    if (j == left) {
                        i -= 1;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) throws Throwable {
        int[][] arr = new int[3][3];
        /*        {
                {2, 5, 8},
                {4, 0, -1}
        };*/
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(k + " ");
                arr[i][j] = k;
                k++;
            }
            System.out.println();
        }
        long startTime = System.currentTimeMillis();
        System.out.println(spiralOrder(arr));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

    static ArrayList<Integer> StrToArrlist(String w) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(w);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String s[] = sb.toString().split(",");
        for (int i = 0; i < s.length; i++) {
            try {
                list.add(Integer.parseInt(s[i]));
            } catch (Exception e) {

            }
        }
        return list;
    }

    static int[] strtoarr(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String w[] = sb.toString().split(",");
        int arr[] = new int[w.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(w[i]);
        }
        return arr;
    }
}