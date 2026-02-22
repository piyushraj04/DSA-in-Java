public class StringPrac {
    public static void main(String[] args) {
        String str = "Piyush";
        String str2 = "Raj";
        char[] arr = str.toCharArray();
        for(char ch:arr){
            System.out.print(ch+" ");
        }
        System.out.println();
        arr = str2.toCharArray();
         for(char ch:arr){
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println(str.indexOf('j')); //-1
        System.out.println(str.contains("piy")); //false
        System.out.println(str.toLowerCase().startsWith("piyu")); //true

    }
}
