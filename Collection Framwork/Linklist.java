import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;


public class Linklist {
    public static void main(String[] args) {
        LinkedList<String> lili = new LinkedList<>();

        System.out.println("before adding Elements" + lili);

        lili.add("kavita");
        lili.add("Deeksha");
        lili.add("Seema");
        lili.add("Rachna");

        System.out.println("After Adding Elements" + lili);
        
        System.out.println("------Using Iterator-------");

        Iterator<String> iterator = (Iterator<String>) lili.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        
        lili.addFirst("Komal");
        System.out.println(lili);
        lili.addLast("Renu");
        System.out.println("lili");


        Collections.sort(lili);
        System.err.println("lili");
        
        
        Collections.sort(lili, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                return o2.compareTo(o1);
            }
            
        });

        System.err.println("lili");


        lili.add("Pooja");
        lili.add("Rupal");

        System.err.println("lili");

        lili.removeAll(Collections.singleton("Kunjesh"));
        System.err.println("lili");
        

        

    }
    
}
