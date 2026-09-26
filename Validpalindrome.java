class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')|| (ch>=0 && ch<=9)){
                sb.append(ch);
            }
        }
        StringBuilder sb2=new StringBuilder();
        for(int i=sb.length()-1 ; i>=0 ; i--){
            sb2.append(sb.charAt(i));
        }
        String s1=new String(sb);
        String s2=new String(sb2);
        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
    }
}
