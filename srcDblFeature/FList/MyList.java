package FList; 
import java.io.PrintStream; 
import LApp.Entity; 
import java.util.Iterator; 

public   class  MyList  implements Iterable {
	

    MyNode head;

	
	
	public MyList  () {
        head = null;
    
		tail = null;
	}

	

    public void insert(Entity elem) {
        insert(new MyNode(elem));
    }

	

     private void  insert__wrappee__Base  (MyNode n) {
        n.right = head;
        head = n;
    }

	
	
	void insert(MyNode n) {
	     insert__wrappee__Base(n);
	     n.left = null;
	     if (n.right != null) {
	    	 n.right.left = n;
	     }
	}

	

    public Iterator iterator() {
        return new MyIterator(this);
    }

	

    public void print(PrintStream out) {
        for (Iterator eIterator = iterator(); 
		eIterator.hasNext();) {
            Entity e = (Entity) eIterator.next();
            out.println(e);
        }
    }

	

	MyNode tail;


}
