class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] arrs = s.toCharArray();
        char[] arrt = t.toCharArray();

        Arrays.sort(arrs);
        Arrays.sort(arrt);

        String ss=new String(arrs);
        String tt=new String(arrt);

        if(ss.equals(tt)){
            return true;
        }
        else{
            return false;
        }
    }
}
