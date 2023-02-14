/**
 * middel
 */
public class middel {

    public static void main(String[] args) {

        }
    public static String getMiddle(String word) {
        int length = word.length();
        String result;
        if (length%2==0) {
            result = word.substring((length/2)-1, length/2+1);
            
        } else {
            result = word.substring((length-1)/2, (length-1)/2 +1 );
            
        }
        
        return result;
      }
}