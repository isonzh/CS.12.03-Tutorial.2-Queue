import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreadthFirstSearchTest {

    private int[][] graph1;
    private int[][] graph2;

    @BeforeEach
    void setUp() {

        graph1 = new int[][]{
                {6,9},
                {11},
                {6,7},
                {9},
                {5,8},
                {4,7},
                {0,2,11},
                {2,5},
                {4,10},
                {0,3},
                {8},
                {1,6}
        };

        graph2 = new int[][] {
                {3,6,5,9},
                {11},
                {7,10},
                {0},
                {5},
                {0,4,7},
                {0,11},
                {2,5,8},
                {7},
                {0},
                {2},
                {1,6}
        };

    }

    @AfterEach
    void tearDown() {

        graph1 = null;
        graph2 = null;
    }

    @Test
    void bfs() {

        int[] traversalGraph1 = BreadthFirstSearch.bfs(graph1);
        int[] traversalGraph2 = BreadthFirstSearch.bfs(graph2);

        int[] expectedTraversalGraph1 = {0,6,9,2,11,3,7,1,5,4,8,10};
        int[] expectedTraversalGraph2 = {0,3,6,5,9,11,4,7,1,2,8,10};

        for (int i = 0; i < expectedTraversalGraph1.length; i++) {

            assertEquals(traversalGraph1[i], expectedTraversalGraph1[i]);
            assertEquals(traversalGraph2[i], expectedTraversalGraph2[i]);

        }

    }
        @Test
        void queue(){
            queue q =new queue();
            q.enqueue(5);
            q.enqueue(3);
            q.array();
        }



}