class Solution {
    public boolean isPalindrome(int x) {

        int sum=0, reminder;
        int save=x;
        if(x<0) return false;
        while(x>0)
        {
            reminder = x%10;
            sum = sum*10 + reminder;
            x = x /10;

        }
        
        return sum==save;
    }
}