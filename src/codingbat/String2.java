package codingbat;

public class String2 {
    public String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result.append(c);
            result.append(c);
        }
        return result.toString();
    }
    public int countHi(String str) {
        int count=0;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i + 2).equals("hi")){
                count++;
            }
        }
        return count;
    }
    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for(int i=0; i < str.length() - 2; i++){
            String sub = str.substring(i, i +3);
            if(sub.equals("cat")){
                catCount++;
            }
            if(sub.equals("dog")){
                dogCount++;
            }
        }
        return catCount == dogCount;
    }
    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co")
                    && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith(b) || b.endsWith(a);
    }
    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
    public boolean xyBalance(String str) {
        int y = str.lastIndexOf('y');
        if (y == -1) {
            return !str.contains("x");
        }
        for (int i = y + 1; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                return false;
            }
        }
        return true;
    }
    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i)).append(b.charAt(i));
        }
        if (a.length() > minLength) {
            result.append(a.substring(minLength));
        }
        if (b.length() > minLength) {
            result.append(b.substring(minLength));
        }
        return result.toString();
    }
    public String repeatEnd(String str, int n) {
        String end = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(end);
        }
        return result.toString();
    }
    public String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = n; i > 0; i--) {
            result.append(str.substring(0, i));
        }
        return result.toString();
    }
    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) return "";
        StringBuilder result = new StringBuilder(word);
        for (int i = 1; i < count; i++) {
            result.append(sep).append(word);
        }
        return result.toString();
    }
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.indexOf(prefix, n) != -1;
    }
    public boolean xyzMiddle(String str) {
        int len = str.length();
        if (len < 3) return false;
        for (int i = 0; i <= len - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                int left = i;
                int right = len - (i + 3);
                if (Math.abs(left - right) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }
    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if (first == -1 || first == last) {
            return "";
        }
        return str.substring(first + 5, last);
    }
    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }
    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i + 2 < str.length(); i += 3) {
            result.append(str.charAt(i + 1))
                    .append(str.charAt(i + 2))
                    .append(str.charAt(i));
        }
        return result.toString();
    }
    public String zipZap(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result.append("zp");
                i += 3;
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
    public String starOut(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') continue;
            if (i > 0 && str.charAt(i - 1) == '*') continue;
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') continue;
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i <= str.length() - word.length() && str.substring(i, i + word.length())
                    .equals(word)) {
                result.append(word);
                i += word.length();
            } else {
                result.append("+");
                i++;
            }
        }
        return result.toString();
    }

}
