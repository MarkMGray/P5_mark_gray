package FList;
import java.io.PrintStream;

import FList.MyNode;
import LApp.Entity;
import java.util.Iterator;

public class MyList implements Iterable {

    MyNode head;

    public MyList() {
        head = null;
    }

    public void insert(Entity elem) {
        insert(new MyNode(elem));
    }

    void insert(MyNode n) {
    	//List is null or its the smallest element.. Insert into the start of list
    	if (head == null || head.elem.compare(head.elem, n.elem) >= 0) {
    		original(n);
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
}
