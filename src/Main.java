import java.util.*;
public class Main {

    public static void doOnce(ArrayList<Integer> list){
        KWorstCounter<Integer> blah = new KWorstCounter<Integer>(3);

        System.out.println();
        System.out.println(list);
        for (int i = 0; i < list.size(); i++){
            blah.count(list.get(i));
        }
        System.out.println();
        blah.printQ();

        List<Integer> kworst = blah.kworst();
        System.out.print("kworst: ");
        System.out.println(kworst);

        System.out.println("checking if pq unchanged");
        blah.printQ();

        List<Integer> kworst2 = blah.kworst();
        System.out.print("kworst: ");
        System.out.println(kworst2);

    }
    public static void main(String[] args) {

        doOnce(new ArrayList<Integer>(Arrays.asList(6,2,5,3,7)));
        doOnce(new ArrayList<Integer>(Arrays.asList(6,3,2,5,3,7)));
        doOnce(new ArrayList<Integer>(Arrays.asList()));
        doOnce(new ArrayList<Integer>(Arrays.asList(10, 11)));
        doOnce(new ArrayList<Integer>(Arrays.asList(2, 23, 7)));
        doOnce(new ArrayList<Integer>(Arrays.asList(0,0,0)));
        doOnce(new ArrayList<Integer>(Arrays.asList(8,10,8,10)));
        doOnce(new ArrayList<Integer>(Arrays.asList(-8,-10,-4, 2)));
        doOnce(new ArrayList<Integer>(Arrays.asList(-6,-4,-3, 2)));
        doOnce(new ArrayList<Integer>(Arrays.asList(2,5,3,7)));


    }
}
