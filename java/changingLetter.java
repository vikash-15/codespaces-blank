class changingLetter {
    public static void main(String[] args) {
        // String str = "Hello World";
        // System.out.println(str.replace('l', 'p'));

        // //way 2
        // StringBuilder sb = new StringBuilder();
        // sb.append(str);
        // for (int i = 0; i < sb.length(); i++) {
        //     if (sb.charAt(i) == 'l') {
        //         sb.setCharAt(i, 'p');
        //     }
        // }

        // //way 3
        // String str2="Hello World";
        // String ans="";
        // for(int i=0;i<str2.length();i++){
        //     if(str2.charAt(i)=='l'){
        //         ans+='p';
        //     }else{
        //         ans+=str2.charAt(i);
        //     }
        // }

        //WAY 4

        String str3 = "Hello World";
        String ans2 = str3.replaceAll("l", "p");
        System.out.println(ans2);
    }
}
