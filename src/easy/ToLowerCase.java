package easy;

public class ToLowerCase {

    public static String toLowerCase(String s) {

        //   retun s.toLowerCase();
        //or
String str="";
        for (char c : s.toCharArray()) {
            if(Character.isUpperCase(c)){//if(c>='A' && c<='Z')
              str+= ( char)(c+'a'-'A');
            }else{
                str+=c;
            }

        }
return str;
    }
}
