class removeVowels {
    public static void main(String[] args) {
        // String str = "Hello World";
        // System.out.println(removeVowels(str));

        //way 2
        // StringBuilder sb = new StringBuilder();
        // String str = "Hello World";
        // sb.append(str);
        // for (int i = 0; i < sb.length(); i++) {
        //     if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o'
        //             || sb.charAt(i) == 'u' || sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I'
        //             || sb.charAt(i) == 'O' || sb.charAt(i) == 'U') {
        //         sb.deleteCharAt(i);
        //         i--;
        //     }
        // }

        // System.out.println(sb); 

        //way 3
        String str="Hello World";
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u' && str.charAt(i)!='A' && str.charAt(i)!='E' && str.charAt(i)!='I' && str.charAt(i)!='O' && str.charAt(i)!='U'){
                ans+=str.charAt(i);
            }
        }

        System.out.println(ans);

    }

    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}