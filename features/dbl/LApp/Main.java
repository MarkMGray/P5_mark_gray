package LApp;

import java.util.Iterator;
import FList.*;

public class Main {

    static MyList mylist;

    public static void main(String[] args) {
        original(args);
    }

    public static void addArray(MyList l, Entity[] arr) {
        for (int j = 0; j < arr.length; j++) {
            l.insert(arr[j]);
        }
    }
}