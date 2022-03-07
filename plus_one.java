// 59/111 test cases passed.
class Solution {
    public int[] plusOne(int[] digits) {
        int single = 0;
        int factor = 0;
     
        for(int element:digits){
            single = element + factor*10;
            factor = single;
        }
        single = single + 1;
        String str = Integer.toString(single);
        int temp[] = new int[str.length()];
        for(int i=0;i<str.length();i++){
            temp[i] = str.charAt(i) - '0';
        }
        return temp;
    }
}

// 104/111 test cases passed
class Solution {

    public int[] plusOne(int[] digits) {
        int single = 0;
        int factor = 0;
        
        if(digits[digits.length - 1] != 9){
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
        else{
        for(int element:digits){
            single = element + factor*10;
            factor = single;
        }
        single = single + 1;
        String str = Integer.toString(single);
        int temp[] = new int[str.length()];
        for(int i=0;i<str.length();i++){
            temp[i] = str.charAt(i) - '0';
        }
        return temp;
        }
    }
}
