class Solution {
    int i=0;
    public String decodeString(String s) {
        String result = "";

        while(i<s.length() && s.charAt(i)!=']'){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                int num = 0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    num = num*10 + (s.charAt(i)-'0');
                    i++;
                }
                i++;
                String r_sub = decodeString(s);
                i++;
                for(int j=0; j<num; j++){
                    result += r_sub;
                }
            }
            else{
                result += ch;
                i++;
            }
        }
        return result;
    }
}