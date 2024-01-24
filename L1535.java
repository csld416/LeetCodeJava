import java.util.*;

public class L1535 {

    final static Scanner sc = new Scanner(System.in);

    public static int getWinner_yeh(int arr[], int k) {
        int max = Arrays.stream(arr).max().getAsInt();
        if(k > arr.length){
            return max;
        }
        int var = 0;
        Integer brr[] = new Integer[arr.length];
        for (int i = 0; i < brr.length; i++) {
            brr[i] = Integer.valueOf(arr[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(brr));
        for (int i = 0; i < arr.length; i++) {
            if(list.get(0) == max){
                return max;
            }else{
                if(list.get(0) > list.get(1)){
                    var++;
                    list.remove(1);
                }else{
                    list.remove(0);
                    var = 1;
                }
            }
            System.out.println(list + "var = " + var);
            if(var == k){
                return list.get(0);
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Throwable {
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        String s[] = sb.toString().split(",");
        int k = Integer.parseInt(sc.nextLine());
        int a[] = new int[s.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        long startTime = System.currentTimeMillis();
        System.out.println(getWinner_yeh(a, k));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }


    public static int getWinner1(int[] arr, int k) {
        if(k > arr.length){
            return Arrays.stream(arr).max().getAsInt();
        }
        int a, b;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> brr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Integer[] count = new Integer[Collections.max(list) + 1];
        Arrays.fill(count, 0);
        ArrayList<Integer> arrayList;

        while (true) {
            brr.clear();
            arrayList = new ArrayList<>(Arrays.asList(count));
            if (Collections.max(arrayList) == k) {
                return Arrays.asList(count).indexOf(k);
            }
            a = list.get(0);
            b = list.get(1);
            list.remove(0);
            list.remove(0);
            brr.add(Integer.max(a, b));
            count[Integer.max(a, b)]++;
            brr.addAll(list);
            brr.add(Integer.min(a, b));
            list.clear();
            list.addAll(brr);
        }
    }
    public static int getWinner2(int arr[], int k) {
        int tmp[];
        if (k > arr.length) {
            return Arrays.stream(arr).max().getAsInt();
        }
        if (arr[0] == Arrays.stream(arr).max().getAsInt()) {
            return arr[0];
        } else {
            for (int i = 0; i < arr.length - k; i++) {
                tmp = new int[k + 1];
                for (int j = i, in = 0; in <= k; j++, in++) {
                    tmp[in] = arr[j];
                }
                if (i == 0) {
                    if (tmp[0] == Arrays.stream(tmp).max().getAsInt()) {
                        return tmp[0];
                    }
                }
                if (tmp[1] == Arrays.stream(tmp).max().getAsInt()) {
                    return tmp[1];
                }
            }
        }
        return Arrays.stream(arr).max().getAsInt();
    }
}