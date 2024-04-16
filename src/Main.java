public class Main {

    // Question 1 - calculateGrade
    public static int calculateGrade(int grade) {
        if (grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 70) {
            return 'C';
        } else if (grade >= 60) {
            return 'D';
        } else if (grade >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }

    // Question 2 - fizzBuzz
    ///
    public static String fizzBuzz(int num) {
        String ans = "";
        if(num%3 == 0){
            ans += "fizz";
        }
        if(num%5 == 0){
            ans += "buzz";
        }
        if(num%5 != 0&&num%3 != 0){
            return "unlucky";
        }
        return ans;
    }
    // Question 3 - frontBack

    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String first = str.substring(0, 2);
        return first + str + first;
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || a + c == b || b + c == a) {
            return true;
        }
        return false;
    }

    // Question 5 - endUp
    public static String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        String front = str.substring(0, str.length() - 3);
        String back = str.substring(str.length() - 3);
        return front + back.toUpperCase();
    }
}