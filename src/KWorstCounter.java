import java.util.*;

public class KWorstCounter<T extends Comparable<? super T>> implements KWorst<T> {

    private int k;
    private PriorityQueue<T> pq;

    public KWorstCounter(int k) {
        this.k = k;
        pq = new PriorityQueue<T>(Collections.reverseOrder());
    }

    public void count(T x) {
        if (pq.peek() != null) {
            if (pq.size() < k) {
                pq.add(x);
            } else {
                T greatest = pq.peek();
                if (x.compareTo(greatest) <= 0) {
                    pq.add(x);
                    pq.remove();
                }
            }
        } else {
            pq.add(x);
        }
    }

    public List<T> kworst() {
        ArrayList<T> kWorst = new ArrayList<>();
        for (T x : pq){
            kWorst.add(0, x);
        }
        Collections.sort(kWorst);
        return kWorst;
    }


    public void printQ() {
        PriorityQueue<T> pqTemp = new PriorityQueue<T>(pq);

        ArrayList<String> arrList = new ArrayList<String>();
        int size = pqTemp.size();
        for (int i = 0; i < size; i++) {
            arrList.add(pqTemp.poll().toString());
        }
        System.out.println("printing pq: [" + String.join("," , arrList) + "]");
    }


}
