class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0 ; i<sentences.length ; i++){
            String ch=sentences[i];
            String [] arr=ch.split(" ");
            if(arr.length>max){
                max=arr.length;
            }
        }
        return max;
        
    }
}
