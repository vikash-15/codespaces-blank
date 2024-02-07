class consequativeRomanNumber {
    public static void main(String[] args) {
        String roman = "XXIV";
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (i > 0 && value(roman.charAt(i)) > value(roman.charAt(i - 1))) {
                result += value(roman.charAt(i)) - 2 * value(roman.charAt(i - 1));
            } else {
                result += value(roman.charAt(i));
            }
        }
        System.out.println(result);
    }

    public static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
}