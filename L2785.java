import java.util.*;

public class L2785 {
    final static Scanner sc = new Scanner(System.in);

    public static String sortVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder vo = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        ArrayList<Character> vowel = new ArrayList<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        for (int i = 0; i < s.length(); i++) {
            ans.append("∂");
        }
        for (int i = 0; i < sb.length(); i++) {
            if (vowel.contains(Character.toLowerCase(sb.charAt(i)))) {
                vo.append(sb.charAt(i));
            } else {
                ans.replace(i, i+1, Character.toString(sb.charAt(i)));
            }
        }
        char arr[] = vo.toString().toCharArray();
        Arrays.sort(arr);
        for (int i = 0, j = 0; i < sb.length(); i++) {
            if (vowel.contains(Character.toLowerCase(sb.charAt(i)))) {
                ans.replace(i, i+1, Character.toString(arr[j]));
                j++;
            }
            if(Character.isAlphabetic(ans.charAt(i))){

            }
        }
        return ans.toString();
    }

    public static void main(String[] args) throws Throwable {
        String s = sc.nextLine();
        long startTime = System.currentTimeMillis();
        System.out.println(sortVowels(s));
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

}