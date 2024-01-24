import java.util.*;

public class L1331 {
    final static Scanner sc = new Scanner(System.in);


    public class soilder {
        int index;
        int num;

        int getIndex() {
            return this.index;
        }

        int getNum() {
            return this.num;
        }

        soilder(int index, int num) {
            this.index = index;
            this.num = num;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int nums[] = new int[mat.length];
        soilder rank[] = new soilder[mat.length];
        for (int i = 0; i < nums.length; i++) {
            rank[i] = new soilder(i, Arrays.stream(mat[i]).sum());
        }
        Arrays.sort(rank, Comparator.comparing(soilder::getNum)
                .thenComparing(soilder::getIndex));
        int ans[] = new int[k];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = rank[i].getIndex();
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();

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