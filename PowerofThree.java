class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        else if(n<=0 || Sum(n , 0)%3!=0) return false;
        return isPowerOfThree(n/3);
    }
    public static int Sum(int x , int res){
        if(x>1 || x<10){
            return x;
        }
        int temp=x%10;
        return res+Sum(x/10 , res+temp);

    }
}
