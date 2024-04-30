import java.util.HashSet;
import java.util.List;
import java.util.Set;
//Given a long sentence, give me all the unique words used in the sentence
public class UniqueWords {

        public static void main(String[] args) {

            String str1 = "The third way to iterate a Java Set is via the Java Stream API To itereate a Java Set using the Java Stream API you must create a Stream from the Set Here is an example of creating a Java Stream from a Set and iterate the Stream";
            String[] str2 = str1.split(" ");
            Set<String> set = new HashSet<>(List.of(str2));
            System.out.println(set);
        }

}
