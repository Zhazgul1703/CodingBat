package codingbat;

public class String1 {
    public String helloName(String name) {
        return "Hello "+ name+"!";
    }
    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }
    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }
    public String makeOutWord(String out, String word) {
        String one = out.substring(0,2);
        String two = out.substring(2,4);
        return one + word + two;
    }
    public String extraEnd(String str) {
        return str.substring(str.length()-2,str.length())+str.substring(str.length()-2,str.length())+str.substring(str.length()-2,str.length());
    }
    public String firstTwo(String str) {
        if (str.length() >= 2){
            return str.substring (0,2);
        }else{
            return str;
        }
    }
    public String firstHalf(String str) {
        int leng = str.length() / 2;
        return str.substring (0,leng);
    }
    public String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }
    public String comboString(String a, String b) {
        return a.length() < b.length()? a+b+a : b+a+b;
    }
    public String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }
    public String left2(String str) {
        String end = str.substring(2, str.length());
        String first = str.substring(0,2);
        return end + first;
    }
    public String right2(String str) {
        int s =str.length()-2;
        String right2 =str.substring(s);
        String result = str.substring(0,s);
        return right2 + result;
    }
    public String theEnd(String str, boolean front) {
        if(front){
            return str.substring(0,1);
        }else{
            int last_index = str.length()-1;
            return str.substring(last_index);
        }
    }
    public String withouEnd2(String str) {
        int length = str.length();
        if(length <= 2){
            return "";
        }
        return str.substring(1, length - 1);
    }
    public String middleTwo(String str) {
        int length = str.length();
        int start_index = length / 2-1;
        int end_index = start_index + 2;
        return str.substring(start_index, end_index);
    }
    public boolean endsLy(String str) {
        return str.endsWith("ly") ? true : false;
    }
    public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length()-n);
    }
    public String twoChar(String str, int index) {
        int str1 = str.length()-2;
        if(index >= 0 && index <= str1){
            return str.substring(index,index+2);
        }else{
            return str.substring(0,2);
        }
    }
    public String middleThree(String str) {
        int index = ((str.length()) - 3) / 2;
        if (str.length() % 2 != 0){
            if (str.length() == 3){
                return str;
            }

            if (str.length() > 3) {
                return str.substring(index, str.length() - index);
            }
        }
        return "The string Length will be at least 3";
    }
    public boolean hasBad(String str) {
        if(str.contains("bad")){
            if(str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad")){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0,2);
        } else if (str.isEmpty()){
            return "@@";
        } else {
            return str + "@";
        }
    }
    public String lastChars(String a, String b) {
        if(a.isEmpty()){
            a = "@";
        }else{
            a = a.substring(0,1);
        }
        if(b.isEmpty()){
            b = "@";
        }else{
            b = b.substring(b.length()-1,b.length());
        }
        return a+b;
    }
    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return a + b;
        }
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }

        String front = str.substring(0, str.length() - 2);
        String last = str.substring(str.length() - 2);
        String swapped = last.substring(1) + last.substring(0, 1);

        return front + swapped;
    }
    public String seeColor(String str) {
        String seeColor = "";
        if(str.startsWith("red")){
            return "red";
        }
        if(str.startsWith("blue")){
            return "blue";
        }
        return "";
    }
    public boolean frontAgain(String str) {
        if(str.length() < 2){
            return false;
        }

        String str1 = str.substring(0,2);
        String str2 = str.substring(str.length()-2);
        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }
    }
    public String minCat(String a, String b) {
        if(a.length() > b.length()){
            return a.substring(a.length() - b.length()) + b;
        }else if(b.length() > a.length()){
            return a + b.substring(b.length()- a.length());
        }else{
            return a+b;
        }
    }
    public String extraFront(String str) {
        String str1;
        if(str.length() >= 2){
            str1 = str.substring(0,2);
        }else{
            str1 = str;
        }
        return str1 + str1 + str1;
    }
    public String without2(String str) {
        int str1 = str.length();
        if (str1 < 2) {
            return str;
        }
        if (str.substring(0, 2).equals(str.substring(str1 - 2))) {
            return str.substring(2);
        }else {
            return str;
        }
    }
    public String deFront(String str) {
        String result = "";
        if (str.length() > 0 && str.charAt(0) == 'a') {
            result += 'a';
        }
        if (str.length() > 1 && str.charAt(1) == 'b') {
            result += 'b';
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }
        return result;
    }
    public String startWord(String str, String word) {
        int words = word.length();
        if (str.length() < words) {
            return "";
        }
        if (str.substring(1, words).equals(word.substring(1))) {
            return str.substring(0, words);
        }
        return "";
    }
    public String withoutX(String str) {
        if(str.length()== 0){
            return str;
        }
        if(str.startsWith("x")){
            str = str.substring(1);
        }
        if(str.endsWith("x") && str.length()>0){
            str = str.substring(0, str.length()-1);
        }
        return str;
    }
    public String withoutX2(String str) {
        if (str.length() < 2) {
            if (str.equals("x")) {
                return "";
            }
            return str;
        }
        String result = "";
        if (str.charAt(0) != 'x') {
            result += str.charAt(0);
        }
        if (str.charAt(1) != 'x') {
            result += str.charAt(1);
        }
        if (str.length() >= 3) {
            result += str.substring(2);
        }
        return result;
    }


}
