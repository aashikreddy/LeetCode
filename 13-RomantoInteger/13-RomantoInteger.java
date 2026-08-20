// Last updated: 8/20/2026, 3:54:13 PM
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int romanToInt(String s) {
6        Map<Character, Integer> romanMap = new HashMap<>();
7        romanMap.put('I', 1);
8        romanMap.put('V', 5);
9        romanMap.put('X', 10);
10        romanMap.put('L', 50);
11        romanMap.put('C', 100);
12        romanMap.put('D', 500);
13        romanMap.put('M', 1000);
14
15        int total = 0;
16        int n = s.length();
17
18        for (int i = 0; i < n; i++) {
19            int currentVal = romanMap.get(s.charAt(i));
20            
21            // If current value is less than the next value, subtract it
22            if (i < n - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
23                total -= currentVal;
24            } else {
25                total += currentVal;
26            }
27        }
28
29        return total;
30    }
31}