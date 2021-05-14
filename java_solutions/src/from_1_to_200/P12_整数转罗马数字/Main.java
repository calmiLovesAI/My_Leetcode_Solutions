package from_1_to_200.P12_整数转罗马数字;


class Solution {

    private int[] A = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private String[] B= new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V",
            "IV", "I"};

    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < A.length; i++) {
            while (num >= A[i]){
                num -= A[i];
                stringBuilder.append(B[i]);
            }
            if (num == 0){
                break;
            }
        }
        return stringBuilder.toString();
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().intToRoman(1234));
    }
}
