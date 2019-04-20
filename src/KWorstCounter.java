import java.util.*;

public class KWorstCounter<T> implements KWorst<T> {

    private PriorityQueue<T> pq = new PriorityQueue<T>(Collections.reverseOrder());
    private int k;

    public KWorstCounter(int k){
          this.k = k;
    }

    public void count(T x){
        pq.add(x);
    }

    public List<T> kworst() {
        ArrayList<T> kWorst = new ArrayList<T>();

        for (int i = 0; i < k; i++) {
            T next = pq.poll();
            if (next == null) {
                System.out.println("queue is empty at " + i);
                break;
            }
            else{
                kWorst.add(next);
            }
        }

        for (int i = 0; i < kWorst.size(); i++) {
            pq.add(kWorst.get(i));
        }

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
