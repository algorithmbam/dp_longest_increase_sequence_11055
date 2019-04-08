package dp_longest_increase_sequence_11055;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ListTest {

	private Lis lis;
	
	@Before
	public void setUp() {
		lis= new Lis();
	}
	
	@Test
	public void test1_is113() {
		
		int input[] = new int[] {0, 1, 100, 2, 50, 60, 3, 5, 6, 7, 8};
		
		int result= lis.dp(input, input.length);
		
		assertThat(result, is(113));
		
	}
	
	@Test
	public void test2_is5() {
		
		int input[] = new int[] {0, 2, 1, 3};
		
		int result= lis.dp(input, input.length);
		
		assertThat(result, is(5));
		
	}
	
	@Test
	public void test3_is2() {
		
		int input[] = new int[] {0, 2, 1};
		
		int result= lis.dp(input, input.length);
		
		assertThat(result, is(2));
		
	}
	
	@Test
	public void test4_is2() {
		
		int input[] = new int[] {0, 2};
		
		int result= lis.dp(input, input.length);
		
		assertThat(result, is(2));
		
	}

	@Test
	public void test5_is6() {
		
		int input[] = new int[] {0, 1, 2, 3};
		
		int result= lis.dp(input, input.length);
		
		assertThat(result, is(6));
		
	}
	
	@Test
	public void test6_is3() {
		
		int input[] = new int[] {0, 3, 2, 1};
		
		int result= lis.dp(input, input.length);
		
		assertThat(result, is(3));
		
	}
	
	@Test
	public void test7_is7() {
		
		int input[] = new int[] {0, 3, 2, 1, 4};
		
		int result= lis.dp(input, input.length);
		
		assertThat(result, is(7));
		
	}
}
