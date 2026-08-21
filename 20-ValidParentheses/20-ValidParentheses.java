// Last updated: 8/21/2026, 10:48:32 AM
1class Solution {
2    public boolean isValid(String s) {
3        if (s.length() % 2 != 0) return false;
4
5        char[] stack = new char[s.length()];
6        int head = 0;
7
8        for (char c : s.toCharArray()) {
9            switch (c) {
10                case '(': stack[head++] = ')'; break;
11                case '{': stack[head++] = '}'; break;
12                case '[': stack[head++] = ']'; break;
13                default:
14                    if (head == 0 || stack[--head] != c) {
15                        return false;
16                    }
17            }
18        }
19
20        return head == 0;
21    }
22}