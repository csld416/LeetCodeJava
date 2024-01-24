import java.util.*;

public class L2147 {
    final static Scanner sc = new Scanner(System.in);

    public static int numberOfWays(String corridor) {
        int ind[] = new int[corridor.length()];
        for (int i = 0; i < ind.length; i++) {
            ind[i] = i;
        }
        final int mod = (int) 1e9 + 7;
        if (corridor.length() == 1) {
            return 0;
        }
        int nums[] = new int[corridor.length()];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (corridor.charAt(i) == 'S') {
                nums[i] = 1;
                sum++;
            } else {
                nums[i] = 0;
            }
        }
        if (sum <= 1) {
            return 0;
        }
        if (sum <= 3) {
            return 1;
        }
        if (sum % 2 == 0) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    list.add(i);
                }
            }
            long ans = 1;
            for (int i = 1; i <= list.size() - 2; i += 2) {
                ans = ans * (list.get(i + 1) - list.get(i)) % mod;
            }
            return (int) ans % mod;
        }
        return 0;
    }

    public static int numberOfWays2(String corridor) {
        int ind[] = new int[corridor.length()];
        for (int i = 0; i < ind.length; i++) {
            ind[i] = i;
        }
        final int mod = (int) 1e9 + 7;
        if (corridor.length() == 1) {
            return 0;
        }
        int nums[] = new int[corridor.length()];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (corridor.charAt(i) == 'S') {
                nums[i] = 1;
                sum++;
            } else {
                nums[i] = 0;
            }
        }
     /*   System.out.println("sum = " + sum);
        for (int i = 0, j = 1; i < nums.length; i++) {
            System.out.print(nums[i] == 1 ? i + (j % 2 == 0 ? "\n" : " ") : "");
            if (nums[i] == 1) {
                j++;
            }
        }
      */
        if (sum <= 1) {
            return 0;
        }
        if (sum <= 3) {
            return 1;
        }
        int st = 0, ed = 0, ans = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                st = i;
                for (int j = i; j < nums.length; j++) {
                    if (summa(i, j, nums) == 2) {
                        ed = j;
                        break;
                    }
                }
                break;
            }
        }
        if (sum % 2 == 0) {
            for (int i = ed + 1; i < nums.length; i++) {
                if (nums[i] == 1) {
                    if (i > ed) {
                        st = i;
                        ans = (ans * (st - ed) % mod);
                        System.out.printf("ans *= %d - %d = %d\n", ed, st, st - ed);
                        for (int j = i + 1; j < nums.length; j++) {
                            if (summa(i, j, nums) == 2) {
                                ed = j;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }

    static int summa(int a, int b, int nums[]) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += nums[i];
        }
        return sum;
    }

    static int ways(int a, int b, int nums[]) {
        int subsum = 0;
        for (int i = a; i <= b; i++) {
            subsum += nums[i];
        }
        if (subsum <= 1) {
            return 0;
        }
        if (subsum - nums[a] - nums[b] == 0) {
            System.out.println("you???");
            return b - a;
        }
        if (subsum <= 3) {
            System.out.println("???");
            return 1;
        }
        int left = 0, right = 0;
        for (int i = a, j = b; true; ) {
            if (left < 2) {
                left += nums[i];
                if (left < 2) {
                    i++;
                }
            }
            if (right < 2) {
                right += nums[j];
                if (right < 2) {
                    j--;
                }
            }
            if (left == 2 && right == 2) {
                return ways(i, j, nums);
            }
            if (left > 2 && right > 2) {
                System.out.println("fuck");
                break;
            }
        }
        System.out.println("fuck");
        return 0;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(numberOfWays("PPPPPPPSPPPSPPPPSPPPSPPPPPSPPPSPPSPPSPPPPPSPSPPPPPSPPSPPPPPSPPSPPSPPPSPPPPSPPPPSPPPPPSPSPPPPSPSPPPSPPPPSPPPPPSPSPPSPPPPSPPSPPSPPSPPPSPPSPSPPSSSS"));
        System.out.println(numberOfWays2("PPPPPPPSPPPSPPPPSPPPSPPPPPSPPPSPPSPPSPPPPPSPSPPPPPSPPSPPPPPSPPSPPSPPPSPPPPSPPPPSPPPPPSPSPPPPSPSPPPSPPPPSPPPPPSPSPPSPPPPSPPSPPSPPSPPPSPPSPSPPSSSS"));
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