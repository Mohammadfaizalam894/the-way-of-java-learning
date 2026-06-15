import java.util.HashMap;

public class CountDigits {
    public static void main(String[] args) {
        String str = "11223344556677889900";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        for (char digit : map.keySet()) {
            System.out.println(digit + " -> " + map.get(digit));
        }
    }
}
