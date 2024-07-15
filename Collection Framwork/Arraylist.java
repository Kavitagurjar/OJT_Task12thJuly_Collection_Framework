import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> ar1 = new ArrayList<String>();
        System.out.println("Empty ArrayList" + ar1);

        ar1.add("Kavita");
        ar1.add("Deeksha");
        ar1.add("Seema");
        ar1.add("Renu");
        ar1.add("Deepa");
        System.out.println("Array list add in " + ar1);


        for (int i = 0; i <= ar1.size() - 1; i++) {
            System.out.println("Index" + i + "Vallue :- " + ar1.get(i));

        }

        System.out.println("Using Iterator");
        Iterator itr = ar1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()+ "");
        }

        System.out.println("Using List Iterator");

        ListIterator li1 = ar1.listIterator();
        while (li1.hasNext()) {
            System.out.println(li1.next() + " ");
        }

        System.out.println("In Revers order");
        while (li1.hasPrevious()) {
            System.out.println(li1.previous() + " ");
        }

        ArrayList<String> clone = (ArrayList) ar1.clone();
        System.err.println(ar1);
        System.err.println("Array list clone in " + clone);


    }
}
    
