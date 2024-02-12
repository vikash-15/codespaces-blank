// import java.util.*;
// class stringScramble {
//   public static void main(String[] args) {
//     String s1="great";
//     String s2="rgeat";
//     System.out.println(isScramble(s1,s2));
//   }
//   public static  boolean isScramble(String s1, String s2) {
//       HashMap<String,Boolean> map=new HashMap<>();
//      return helper(s1,s2,map);
//   }

//   public static boolean helper(String s1,String s2,HashMap<String,Boolean> map){
//       if(s1.equals(s2)){
//           return true;
//       }

//       if(s1.length()!=s2.length()){
//           return false;
//       }
//       String key=s1+s2;
//       if(map.containsKey(key)){
//           return map.get(key);
//       }

//       int n=s1.length();
//       for(int i=1;i<n;i++){
//           boolean notSwapper=(helper(s1.substring(0,i),s2.substring(0,i),map) && helper(s1.substring(i),s2.substring(i),map));
//           boolean swapper=(helper(s1.substring(0,i),s2.substring(n-i),map) && helper(s1.substring(i),s2.substring(0,n-i),map));

//           if(notSwapper || swapper){
//               map.put(key,true);
//               return true;
//           }
//       }

//       map.put(key,false);

//       return false;
//   }

// }

import java.util.*;
class stringScramble {
  static HashMap<String,Boolean>map=new HashMap<>();

  public static void main(String[] args) {
    // map=new HashMap<>();
    String s1 = "great";
    String s2 = "rgeat";
    System.out.println(isScramble(s1, s2));
  }

  public static boolean isScramble(String s1, String s2) {

    return helper(s1, s2);
  }

  public static boolean helper(String s1, String s2) {
    if (s1.equals(s2)) {
      return true;
    }

    if (s1.length() != s2.length()) {
      return false;
    }
    String key = s1 + s2;
    if (map.containsKey(key)) {
      return map.get(key);
    }

    int n = s1.length();
    for (int i = 1; i < n; i++) {
      boolean notSwapper = (helper(s1.substring(0, i), s2.substring(0, i)) && helper(s1.substring(i), s2.substring(i)));
      boolean swapper = (helper(s1.substring(0, i), s2.substring(n - i))
          && helper(s1.substring(i), s2.substring(0, n - i)));

      if (notSwapper || swapper) {
        map.put(key, true);
        return true;
      }
    }
    map.put(key, false);
    return false;
  }
}