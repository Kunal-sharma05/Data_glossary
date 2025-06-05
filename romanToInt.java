class Solution {
    public int romanToInt(String s) {

        int integer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I' && i < (s.length() - 1)) {
                if (s.charAt(i + 1) == 'V') {
                    integer = integer + 4;
                    i++;
                } else if (s.charAt(i + 1) == 'X') {
                    integer = integer + 9;
                    i++;
                } else {
                    integer = integer + 1;
                }
            } else if (s.charAt(i) == 'X' && i < (s.length() - 1)) {
                if (s.charAt(i + 1) == 'L') {
                    integer = integer + 40;
                    i++;
                } else if (s.charAt(i + 1) == 'C') {
                    integer = integer + 90;
                    i++;
                } else {
                    integer = integer + 10;
                }
            } else if (s.charAt(i) == 'C' && i < (s.length() - 1)) {
                if (s.charAt(i + 1) == 'D') {
                    integer = integer + 400;
                    i++;
                } else if (s.charAt(i + 1) == 'M') {
                    integer = integer + 900;
                    i++;
                } else {
                    integer = integer + 100;
                }
            } else if (s.charAt(i) == 'I') {
                integer = integer + 1;
            } else if (s.charAt(i) == 'X') {
                integer = integer + 10;
            } else if (s.charAt(i) == 'C') {
                integer = integer + 100;
            } else if (s.charAt(i) == 'V') {
                integer = integer + 5;
            } else if (s.charAt(i) == 'L') {
                integer = integer + 50;
            } else if (s.charAt(i) == 'D') {
                integer = integer + 500;
            } else if (s.charAt(i) == 'M') {
                integer = integer + 1000;
            }
        }
        return integer;
    }
}
