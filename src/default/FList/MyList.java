package FList; 
import java.io.PrintStream; 
import LApp.Entity; 
import java.util.Iterator; 

import FList.MyNode; 

public   class  MyList  implements Iterable {
	

    MyNode head  ;

	

    public MyList  () {
        head = null;
    
        head = null;
    }

	

    public void insert  (Entity elem) {
        insert(new MyNode(elem));
    }

	

     private void  insert__wrappee__Base  (MyNode n) {
        n.right = head;
        head = n;
    }

	

    void insert(MyNode n) {
    	//List is null or its the smallest element.. Insert into the start of list
    	if (head == null || head.elem.compare(head.elem, n.elem) >= 0) {
    		insert__wrappee__Base(n);
    		return;
    	}
    	MyNode rightNode = head;
    	MyNode leftNode = head;
    	//Insert into the middle or end of list
    	while (rightNode != null && rightNode.elem.compare(rightNode.elem, n.elem) < 0) {
    		leftNode = rightNode;
    		rightNode = rightNode.right;
    	}
    	leftNode.right = n;
    	n.right = rightNode;
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


}
