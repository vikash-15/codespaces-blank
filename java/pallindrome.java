// palindrome
//String is a palindrome

class pallindrome {
    public static void main(String args[]) {

        //way 1
        // String str = "madam";
        // String rev = "";
        // int length = str.length();
        // for (int i = length - 1; i >= 0; i--) {
        //     rev = rev + str.charAt(i);
        // }
        // if (str.equals(rev)) {
        //     System.out.println(str + " is a palindrome");
        // } else {
        //     System.out.println(str + " is not a palindrome");
        // }

        //way 2

        StringBuilder sb=new StringBuilder();
        String str = "madam";
        sb.append(str);
        sb.reverse();
        if(str.equals(sb.toString())){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is not a palindrome");
        }

    }
}