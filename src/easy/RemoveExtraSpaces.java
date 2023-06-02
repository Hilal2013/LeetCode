package easy;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "   today is      tuesday             ";
str=str.trim();
StringBuilder newStr=new StringBuilder();

        boolean isSpace = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(!Character.isWhitespace(c)){
             newStr.append(c);

             isSpace=false;
            }else{
                if (!isSpace) {
                    newStr.append(" ");

                    isSpace=true;
                }
            }

        }
        System.out.println(newStr.toString());

    }

}
/*
String str = "   today is      tuesday       "
Output: "today is tuesday"
 */
