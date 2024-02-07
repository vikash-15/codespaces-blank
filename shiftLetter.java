// You are given a string s of lowercase English letters and an integer array shifts of the same length.

// Call the shift() of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').

// For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
// Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.

// Return the final string after all such shifts to s are applied.


class shiftLetter {
    public static void main(String[] args) {
        String str = "abc";
        int arr[]={3,5,9};
        System.out.println(shiftLetter(str,arr));

    }
    //way 1
    // public static String shiftLetter(String str, int[] arr) {
    //     StringBuilder sb = new StringBuilder();
    //     int sum = 0;
    //     for (int i = arr.length - 1; i >= 0; i--) {
    //         sum += arr[i];
    //         if(sum>26){
    //             sum=sum%26;
    //         }
    //         sb.append((char) ((str.charAt(i) - 'a' + sum) % 26 + 'a'));
    //     }
    //     return sb.reverse().toString();
    // }

    ///way 2
    public static String shiftLetter(String s, int[] shifts) {
        StringBuilder str= new StringBuilder("");
               int n=shifts.length;
               int move=0;
               for(int i=n-1;i>=0;i--){
                   move+=shifts[i];
                   if(move>26){
                       move=move%26;
                   }
                   char ch=s.charAt(i);
                   int asci=ch;
                   int l=asci;
                   l+=move;
                   while(l>122){
                       l-=26;
                   }
                   ch=(char)l;
                   str.append(ch);
               }
               
               s=str.reverse()+"";
               return s;
           }
}