import java.util.List;
//Autoboxing
public class ListInsertion {
    public static void main(String[] args) {
        List<Object> val = List.of("A", 'A', 1, 1.0);
        System.out.println(val);
        Object A = val.get(2);
        Boolean B  = false;
        if (A instanceof Integer){
            B = true;
        }
        System.out.println(B);
    }
}
