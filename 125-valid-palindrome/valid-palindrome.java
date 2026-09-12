class Solution { 

    public boolean isAlphaNumericCharacter(char ch) { 
        return (ch >= 'a' && ch <= 'z') ||  
               (ch >= 'A' && ch <= 'Z') ||  
               (ch >= '0' && ch <= '9'); 
    } 

    public boolean isPalindrome(String s) { 
        int i = 0; 
        int j = s.length() - 1; 
 
        while (i < j) { 
            char c1 = s.charAt(i); 
            char c2 = s.charAt(j); 
 
            if (!isAlphaNumericCharacter(c1)) { 
                i++; 
                continue; 
            } 

            if (!isAlphaNumericCharacter(c2)) { 
                j--; 
                continue; 
            } 
 
            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) { 
                return false; 
            } 

            i++; 
            j--; 
        } 

        return true; 
    } 
}