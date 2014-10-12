package FList;  

import java.util.Iterator; 
import LApp.Entity;  

import org.omg.CORBA.Current; 

import com.sun.xml.internal.messaging.saaj.packaging.mime.Header; 

import FList.MyNode;  

public     class   MyIterator   implements Iterator {
	

    MyNode current;

	
    MyList list;

	
    boolean alreadyAdvanced;

	

    MyIterator(MyList list) {
        current = list.head;
        this.list = list;
        alreadyAdvanced = true;
    }

	

    public boolean hasNext  () {
        if (alreadyAdvanced) {
        	MyNode tempCurrent = current;
        	if (tempCurrent == null) {
        		return false;
        	}
        	while (tempCurrent != null && tempCurrent.deleted) {
        		tempCurrent = tempCurrent.right;
        	}
            return tempCurrent != null;
        } else {
        	MyNode tempCurrent = current.right;
        	if (tempCurrent == null) {
        		return false;
        	}
        	while (tempCurrent != null && tempCurrent.deleted) {
        		tempCurrent = tempCurrent.right;
        	}
            return tempCurrent != null;
        }
    }

	
    public Entity next  () {
        if (alreadyAdvanced) {
        	while (current.deleted && current.right != null) {
            	current = current.right;
            }
            alreadyAdvanced = false;
        } else {
            current = current.right;
            while (current.deleted && current.right != null) {
            	current = current.right;
            }
        }
        return current.elem;
    }

		
    public void remove  () {
    	MyNode newCurrent;
    	newCurrent = current.right;
    	while (newCurrent != null && newCurrent.deleted) {
    		newCurrent = newCurrent.right;
    	}
    	list.delete(current);
    	current = newCurrent;
    	alreadyAdvanced = true;
    }


}
