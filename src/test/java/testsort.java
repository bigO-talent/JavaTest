

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testsort {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBubble() {
		System.out.println("bubble");
		sort sort = new sort();
		assertArrayEquals(new int[] {1,2,3}, sort.bubble(new int[] {3,1,2}));
		assertArrayEquals(new int[] {1,2,3,4}, sort.bubble(new int[] {3,1,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5}, sort.bubble(new int[] {5,3,1,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5,6}, sort.bubble(new int[] {6,3,1,5,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7}, sort.bubble(new int[] {3,7,1,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, sort.bubble(new int[] {3,7,1,8,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, sort.bubble(new int[] {3,7,9,1,8,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, sort.bubble(new int[] {3,7,9,1,8,6,4,2,10,5}));
	}
	public void testSelection() {
		System.out.println("selection");
		sort sort = new sort();
		assertArrayEquals(new int[] {1,2,3}, sort.selection(new int[] {3,1,2}));
		assertArrayEquals(new int[] {1,2,3,4}, sort.selection(new int[] {3,1,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5}, sort.selection(new int[] {5,3,1,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5,6}, sort.selection(new int[] {6,3,1,5,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7}, sort.selection(new int[] {3,7,1,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, sort.selection(new int[] {3,7,1,8,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, sort.selection(new int[] {3,7,9,1,8,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, sort.selection(new int[] {3,7,9,1,8,6,4,2,10,5}));
	}

}
