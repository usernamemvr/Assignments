import java.util.HashMap;
import java.util.Map;
//Write a program to count each word of a String and store them in proper DS.
public class WordCounter {
    public static void main(String[] args) {
        String str1 = "The third way to iterate a Java Set is via the Java Stream API To itereate a Java Set using the Java Stream API you must create a Stream from the Set Here is an example of creating a Java Stream from a Set and iterate the Stream";
        str1 = str1.toLowerCase();
        String[] str2 = str1.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (String str : str2) {
            if(map.get(str) != null) {
                map.put(str,map.get(str)+1);
            }
            else{
                map.put(str,1);
            }
        }
        System.out.println(map);

    }
}
