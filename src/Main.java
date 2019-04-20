import java.util.*;
public class Main {

    public static void doOnce(ArrayList<Integer> list){
        KWorstCounter<Integer> blah = new KWorstCounter<Integer>(3);

        System.out.println(list);
        for (int i = 0; i < list.size(); i++){
            blah.count(list.get(i));
        }
        System.out.println();
        blah.printQ();

        System.out.println();
        List<Integer> kworst = blah.kworst();
        System.out.println(kworst);
        blah.printQ();

        System.out.println();
        List<Integer> kworst2 = blah.kworst();
        System.out.println(kworst2);
        blah.printQ();

    }
    public static void main(String[] args) {

        doOnce(new ArrayList<Integer>(Arrays.asList(6,2,5,3,7)));
        doOnce(new ArrayList<Integer>(Arrays.asList(6,3,2,5,3,7)));
        doOnce(new ArrayList<Integer>(Arrays.asList()));
        doOnce(new ArrayList<Integer>(Arrays.asList(10, 11)));
        doOnce(new ArrayList<Integer>(Arrays.asList(7, 2, 23)));
        doOnce(new ArrayList<Integer>(Arrays.asList(0,0,0)));
        doOnce(new ArrayList<Integer>(Arrays.asList(8,10,8,10)));
        doOnce(new ArrayList<Integer>(Arrays.asList(-8,-10,-4, 2)));


    }
}
