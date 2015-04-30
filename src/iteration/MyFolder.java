package iteration;

import java.util.Iterator;
import java.util.Queue;

public class MyFolder<T, U> implements Folder<T, U>
{
    public U fold(U u, Queue<T> ts, Function2<T, U, U> function)
    {
        if(u == null || ts == null || function == null)
            throw new IllegalArgumentException();

        if (ts.isEmpty()) {
            return u;
        }

        Iterator<T> it = ts.iterator();
        while(it.hasNext()){
            T element = it.next();
            function.apply(element, u);
        }

        return u;
    }
}