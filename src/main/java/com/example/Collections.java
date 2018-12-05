import java.util.*;
 
public class Collections{
      
    public static void main(String[] args) {
          
        ArrayList<Integer> qq = new ArrayList<>();
	LinkedList<Integer> qqq = new LinkedList<>();
	TreeSet<Integer> q = new TreeSet<>();
	int n=1000000; 
	long startTime = 0;
        for (int i=0; i<n; i++)
        qq.add(i);
	startTime=System.nanoTime();
	qq.add(n/2,100);
	System.out.println("AL add=" +(System.nanoTime()-startTime));
	startTime=System.nanoTime();	
        qq.remove(100);
	System.out.println("AL delete=" +(System.nanoTime()-startTime));	
	  	
        for (int i=0; i<n; i++)
        qqq.add(i);
	startTime=System.nanoTime();
	qqq.add(n/2,100);
	System.out.println("LL add=" +(System.nanoTime()-startTime));
	startTime=System.nanoTime();	
        qqq.remove(100);
	System.out.println("LL delete=" +(System.nanoTime()-startTime));

	for (int i=0; i<n/2; i++)
        q.add(i);
	for (int i=n/2+1; i<n+1; i++)
        q.add(i);
	startTime=System.nanoTime();
	q.add(n/2);
	System.out.println("TS add=" +(System.nanoTime()-startTime));
	startTime=System.nanoTime();	
        q.remove(n/2);
	System.out.println("TS delete=" +(System.nanoTime()-startTime));

    }
}
