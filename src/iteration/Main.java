package iteration;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue q = new PriorityQueue();
        BigInteger num = new BigInteger("5");
        for(BigInteger i = BigInteger.valueOf(0); i.compareTo(num) < 0; i = i.add(BigInteger.ONE)) {
            q.add(i);
        }

        Iterator it = q.iterator();
        while(it.hasNext()){
            Object element = it.next();
            System.out.println(element);
        }
        q.clear();
        System.out.println("Complete");

        Iterator it2 = q.iterator();
        while(it2.hasNext()){
            Object element = it2.next();
            System.out.println(element);
        }
        System.out.println("complete 2");
    }
}
