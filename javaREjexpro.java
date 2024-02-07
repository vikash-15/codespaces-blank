public class javaREjexpro {

    public static void main(String[] args) {
        // split by space
        String str = "Hello World";
        String[] strArray = str.split(" ");
        for (String s : strArray) {
            System.out.println(s);
        }

        // split byeverything escapt a chatacter
        String str1 = "Hello537@#$ sun*& 09389))OOO World@5lkj";
        String[] strArray1 = str1.split("[^a-zA-Z]");
        for (String s : strArray1) {
            System.out.println(s);
        }

        // split by everything except a digit
        String str2 = "xxxxxxxx@xx sun*& 09389))OOO xxxxx@xxxx";
        String[] strArray2 = str2.split("[^0-9]");
        for (String s : strArray2) {
            System.out.println(s);
        }

        //complete regex
        String str3 = "xxxxxxxx@xx sun*& 09389))OOO xxxxx@xxxx";
        String[] strArray3 = str3.split("[^a-zA-Z0-9]");
        for (String s : strArray3) {
            System.out.println(s);
        }
        

    }
    
}
