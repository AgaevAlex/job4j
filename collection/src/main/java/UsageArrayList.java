import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");

        for (String printNames : names
        ) {
            System.out.println(printNames);

        }
    }
}
