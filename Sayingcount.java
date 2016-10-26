
public class Sayingcount
{
    public static int Sayingcount(String s){

        int Sayingcount = 0;

        boolean word = false;
        int enOfLine = s.length() -1;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
                word = true;
            } else if (!Character.isLetter(s.charAt(i)) && word) {
                wordCount++;
                word = false;
            } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;

    }
}    
