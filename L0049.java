import java.util.*;

public class L0049 {
    final static Scanner sc = new Scanner(System.in);

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] tmp = strs[i].toCharArray();
            Arrays.sort(tmp);
            String key = new String(tmp);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        List<List<String>> result = new ArrayList<>();
        result.addAll(map.values());
        return result;
    }

    public static List<List<String>> groupAnagrams1(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        List<List<String>> list = new ArrayList<>();
        List<String> cont = new ArrayList<>();
        if (strs.length == 1) {
            ArrayList<String> lis = new ArrayList<>();
            lis.add(strs[0]);
            list.add(lis);
            return list;
        }
        ArrayList<String> strss = new ArrayList<>();
        strss.addAll(Arrays.asList(strs));
        while (!strss.isEmpty()) {
            ArrayList<String> lis = new ArrayList<>();
            String s = strss.get(0);
            char curr[] = s.toCharArray();
            Arrays.sort(curr);
            if (!cont.contains(new String(curr))) {
                lis.add(s);
                cont.add(new String(curr));
                for (int i = 1; i < strss.size(); i++) {
                    if (strss.get(i).length() != s.length()) {
                        continue;
                    }
                    char c[] = strss.get(i).toCharArray();
                    Arrays.sort(c);
                    if (Arrays.equals(c, curr)) {
                        lis.add(strss.get(i));
                    }
                }
                strss.remove(0);
                list.add(lis);
            } else {
                strss.remove(strss.get(0));
            }
        }
        return list;
    }


    public static void main(String[] args) throws Throwable {
        String str[] = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        long startTime = System.currentTimeMillis();
        System.out.println(groupAnagrams(str));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}