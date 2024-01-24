import java.util.*;

public class L1743 {
    final static Scanner sc = new Scanner(System.in);


    static class dir {
        int val;
        boolean left = false;
        boolean right = false;

        dir() {
        }

        dir(int val) {
            this.val = val;
        }

    }

    public static int[] restoreArray(int[][] arr) {

        return new int[0];
    }

    public static int[] swapin(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
        return arr;
    }

    public static void main(String[] args) throws Throwable {
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(restoreArray(arr)));
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

    public static int[] restoreArray1(int[][] adjacentPairs) {
        ArrayList<Integer> county = new ArrayList<>();
        dir[] lis = new dir[adjacentPairs.length + 1];
        ArrayList<Integer> tmp = new ArrayList<>();
        ArrayList<Integer> tt = new ArrayList<>();
        int left, right;
        for (int i = 0; i < adjacentPairs.length; i++) {
            for (int j = 0; j < adjacentPairs[0].length; j++) {
                tmp.add(adjacentPairs[i][j]);
            }
        }
        Collections.sort(tmp);
        int count = 1;
        for (int i = 1; i < adjacentPairs.length; i++) {
            if (Objects.equals(tmp.get(i), tmp.get(i - 1))) {
                count++;
            } else {
                if (count == 1) {
                    tt.add(tmp.get(i - 1));
                }
            }
        }
        System.out.println(tt);
        Collections.sort(tt);
        left = tt.get(0);
        right = tt.get(1);
        lis[0] = new dir(left);
        lis[lis.length - 1] = new dir(right);
        lis[0].left = true;
        lis[lis.length - 1].right = true;
        county.add(left);
        county.add(right);
        int a, b;
        //================
        for (int i = 0; i < adjacentPairs.length; i++) {
            a = adjacentPairs[i][0];
            b = adjacentPairs[i][1];
            if (county.contains(a) && county.contains(b)) {
                break;
            } else if (!county.contains(a) && !county.contains(b)) {

            }
        }
        //================
        int ans[] = new int[lis.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = lis[i].val;
        }
        return ans;
    }
}