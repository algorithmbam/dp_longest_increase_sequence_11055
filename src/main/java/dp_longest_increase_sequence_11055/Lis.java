package dp_longest_increase_sequence_11055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lis {

	private static int sumMax[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int inputSize= Integer.parseInt(br.readLine());
		
		String readLine= br.readLine();
		String[] inputArr= readLine.split(" ");
		int input[] = new int[inputArr.length+1];
		
		for(int i= 0; i< inputArr.length; i++) {
			input[i+1]= Integer.parseInt(inputArr[i]);
		}
		
		int result= dp(input, input.length);
		
		System.out.println(result);
	}
	
	public static int dp(int[] input, int inputLength) {
		sumMax= new int[inputLength];
		int N= inputLength-1;
		int cnt= 0;
		int result= 0;
		
		for(int i= 1; i<= N; i++) {
			cnt= 0;
			if(i==1) {
				sumMax[i]= input[i];
			} else {
				for(int j= i; j> 1; j--) {
					if(input[i] > input[j-1]) {
						sumMax[i]= Math.max(sumMax[i], sumMax[j-1] + input[i]);
						cnt= cnt+1;
					}
					
				}
				
				if(cnt == 0 ) {
					sumMax[i]= input[i];
				}
			}
		}
		
		for(int x= 1; x <= N; x++) {
			result= Math.max(result, sumMax[x]);
		}
		
		return result;
	}

}
