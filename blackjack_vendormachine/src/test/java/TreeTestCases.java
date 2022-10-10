
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.pivottech.Node;
import com.pivottech.TreeTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TreeTestCases {


    @Test
    void Test1() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        List<Integer> myList = new ArrayList<>();
        TreeTest.preOrder(n1, myList);

        List<Integer> expectedList = Arrays.asList(1, 2, 4,5,3,6,7);

        for(int i = 0;i<expectedList.size();i++) {
            assertEquals(expectedList.get(i), myList.get(i));
        }

    }

    @Test
    void Test2() {
        assertEquals(2, 2);
    }

}