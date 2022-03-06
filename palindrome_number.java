// Initial solution -> Test case passed for numbers like 121, 1771, etc but fails to check for numbers like 1231...
class Solution {
    public boolean isPalindrome(int x) {
	    int i = 0;
	    boolean isPalin = true;
      String x_str = String.valueOf(x);
        
      char[] digits = x_str.toCharArray();
	    int[] list = new int[digits.length];
        
	    while(x>0 && i<digits.length){
	       list[i] = x%10;
	       x = x/10;
	       i++;
	    }
	    for(i=0;i<digits.length;i++){
	        if((list[i])==(list[(digits.length-1)-i]))
	         isPalin = true;
	        else
	         isPalin = false;
	    }
    return isPalin;
    }
}

// correct solution ---passed all test cases (reference - javatpoint)
class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0, temp=x, r=0;
        while(x>0){    
            r=x%10;   
            sum=(sum*10)+r;    
            x=x/10;    
        } 
        if(temp==sum)
            return true;
        else
            return false;
    }
}

