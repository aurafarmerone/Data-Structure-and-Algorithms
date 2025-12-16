public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "aaabbbccccdddd";
        StringBuilder res = new StringBuilder("");
        boolean arr[] = new boolean[26]; // map , all value = false
        rem(str,0,res,arr);


    }

    public static void rem(String str, int idx , StringBuilder res , boolean arr[] ){
        if(idx == str.length()-1){
            System.out.print(res);
            return;
        }

        char currChar = str.charAt(idx);
        if(arr[currChar - 'a'] == true){
            // ignore because already appear before
            rem(str,idx+1,res,arr);
        }
        else{
            arr[currChar - 'a'] = true;
            rem(str,idx+1,res.append(currChar),arr);
        }


    }
}
