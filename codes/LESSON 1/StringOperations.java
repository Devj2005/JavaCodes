public class StringOperations {
    public static void main(String args[]){
      String str1="Hello ";
      String str2= "Devyan Jethwa";
      String str3;
      str3= str1 + str2;
      System.out.println("Welcome "+str3 );
      System.out.println(str1.length());
      System.out.println(str3.substring(0, 5));
      System.out.println(str2.toUpperCase());
      System.out.println(str1.compareTo(str2));
      System.out.println(str1.equals(str2));

    }
    
}
