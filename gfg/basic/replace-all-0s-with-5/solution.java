class Solution {
    public int convertFive(int n) {
        // code here
        String str=String.valueOf(n);
        int res=Integer.parseInt(str.replaceAll("0","5"));
        return res;
    }
}