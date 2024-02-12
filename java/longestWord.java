class longestWord {
    public static void main(String[] args) {
        // String str = "The cow jumped over the moon";
        // String[] words = str.split(" ");
        // int max = 0;
        // String longestWord = "";
        // for (int i = 0; i < words.length; i++) {
        //     if (words[i].length() > max) {
        //         max = words[i].length();
        //         longestWord = words[i];
        //     }
        // }
        // System.out.println("The longest word is: " + longestWord);

        //way 2
        String str="The cow jumped over the moon";
        str=str+" ";
        String longestWord="";
        String word="";
        int max=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                word+=str.charAt(i);
            }else{
                if(word.length()>max){
                    max=word.length();
                    longestWord=word;
                }
                word="";
            }
        }
        System.out.println("The longest word is: " + longestWord);
        
    }
}
