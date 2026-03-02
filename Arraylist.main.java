import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean t = true;
        while (t) {
            System.out.println("Enter a Sentence");
            String x = input.next();
            if (x.equals("STOP")) {
                t = false;
            } else {
                s.add(x);
            }
        }
        System.out.println("You used " + s.size() + " words");

        ArrayList<String> unique = new ArrayList<String>();
        for (int x = 0; x < s.size(); x++) {
            if (unique.contains(s.get(x).toLowerCase())) {

            } else {
                unique.add(s.get(x));
            }
        }
        System.out.println("You used " + unique.size() + " unique words");

        int h = 0;
        for (int x = 0; x < s.size()-1; x++) {
            if(s.get(x).equalsIgnoreCase("the")){
                h = h + 1;
            }
        }
        System.out.println("You used 'the' " + h + " times");
        String w = "";
        for(int x = 0; x < s.size()-1; x++) {
            if (s.get(x).length() > w.length()){
                w = s.get(x);
            }
        }
        System.out.println(w + " is the longest word");
        boolean b = true;
        for (int x = 0; x < s.size(); x++) {
            for (int y = 0; y < s.get(x).length(); y ++){
                char c = s.get(x).charAt(y);
                int ascii = (int) c;
                if (c <= 96){
                    b = false;
                }
            }
        }
        System.out.println("Are all words lowercase? " + b);
        for (int x = 0; x < unique.size(); x++){
            if (unique.get(x).length() <= 3){
                unique.remove(x);
            }
        }

        System.out.println("Condensed Chat History");
        for (int x = 0; x < unique.size(); x++){
            System.out.println(unique.get(x).toLowerCase());
        }

    }
}
