class TotalPermutation{

    // non repeating
    public static void main(String[] args) {
        String str = "abc" ;
        perm(str, "");
    }

    public static void perm(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0 ; i < str.length() ; i++){
        char ch = str.charAt(i);
        String Newstr = str.substring(0,i) + str.substring(i+1);
        perm(Newstr, ans + ch);    
        }
    }
}