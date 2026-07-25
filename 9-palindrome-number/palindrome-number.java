class Solution {
    public boolean isPalindrome(int x) {
        int check = x;
        int r=0,s=0;
        if(x<0)
            return false;
        while(x>0) {
            r = x%10;
            s = s*10 + r;
            x=x/10;
        }
        if(s==check)
            return true;
        else 
                return false;

    }
}