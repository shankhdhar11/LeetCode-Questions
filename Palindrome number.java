class Solution {
    public boolean isPalindrome(int x) {
        int num=0;
        int check=x;
        while(x>0){
            int digit=x%10;
            num= num*10+digit;
            x=x/10;
        }
        if(num==check){
            return true;
        }
        else{
            return false;
        }
    }  
}
