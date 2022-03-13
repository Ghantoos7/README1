

public class TowerOfHanoi {


	public static void hanoi(int number , int start , int mid , int end) {
		int number_of_moves = (int) (Math.pow(2, number) - 1);
		if (number % 2 == 1){
			int counter_for_start_to_end = 0;
			int counter_for_start_to_end_exception = 0;
			int counter_for_start_to_mid_exception1 = 0;
			int counter_for_start_to_mid_exception2 = 0;
			int counter_for_mid_to_end_exception1 = 0;
			int counter_for_mid_to_end_exception2 = 0;

			for (int move = 1 ; move < number_of_moves + 1; move++) {
				if (move % 3 == 1) {
					if (move == 40 + (44 * counter_for_start_to_end_exception)) {
						System.out.println(end + " ----> " + start);
						counter_for_start_to_end_exception++;
						counter_for_start_to_end++;
					}
					else {
						if (counter_for_start_to_end % 3 == 0 && counter_for_start_to_end != 0)  {
							System.out.println(end + " ----> " + start);
							counter_for_start_to_end =0;
						}
						else {
							System.out.println(start + " ----> " + end);
							counter_for_start_to_end++;
						}

					}
				}

				else if (move % 3 == 2) {
					if (move == 20 + (24 * counter_for_start_to_mid_exception1)){
						System.out.println(mid + " ----> " + start);
						counter_for_start_to_mid_exception1++;
					}
					else if (move == 80 + (24 * (3*counter_for_start_to_mid_exception2))) {
						System.out.println(mid + " ----> " + start);
						counter_for_start_to_mid_exception2++;
					}
					else {
						if (move % 2 == 0 ) {
							System.out.println(start + " ----> " + mid);
						}
						else {
							System.out.println(mid + " ----> " + start);
						}
					}
				}

				else {
					if (move == 12 +(24 * counter_for_mid_to_end_exception1)) {
						System.out.println(end + " ----> " + mid);
						counter_for_mid_to_end_exception1++;
					}
					else if (move == 48 + (24 * (3*counter_for_mid_to_end_exception2))){
						System.out.println(end + " ----> " + mid);
						counter_for_mid_to_end_exception2++;
					}
					else {
						if (move % 2 == 0 ) {
							System.out.println(mid + " ----> " + end);
						}
						else {
							System.out.println(end + " ----> " + mid);
						}
					}

				}
			}
		}
		if (number % 2 == 0){
			int temp;
			temp = mid;
			mid = end;
			end = temp; 
			int counter_for_start_to_end = 0;
			int counter_for_start_to_end_exception = 0;
			int counter_for_start_to_mid_exception1 = 0;
			int counter_for_start_to_mid_exception2 = 0;
			int counter_for_mid_to_end_exception1 = 0;
			int counter_for_mid_to_end_exception2 = 0;

			for (int move = 1 ; move < number_of_moves + 1; move++) {
				if (move % 3 == 1) {
					if (move == 40 + (44 * counter_for_start_to_end_exception)) {
						System.out.println(end + " ----> " + start);
						counter_for_start_to_end_exception++;
						counter_for_start_to_end++;
					}
					else {
						if (counter_for_start_to_end % 3 == 0 && counter_for_start_to_end != 0)  {
							System.out.println(end + " ----> " + start);
							counter_for_start_to_end =0;
						}
						else {
							System.out.println(start + " ----> " + end);
							counter_for_start_to_end++;
						}

					}
				}

				else if (move % 3 == 2) {
					if (move == 20 + (24 * counter_for_start_to_mid_exception1)){
						System.out.println(mid + " ----> " + start);
						counter_for_start_to_mid_exception1++;
					}
					else if (move == 80 + (24 * (3*counter_for_start_to_mid_exception2))) {
						System.out.println(mid + " ----> " + start);
						counter_for_start_to_mid_exception2++;
					}
					else {
						if (move % 2 == 0 ) {
							System.out.println(start + " ----> " + mid);
						}
						else {
							System.out.println(mid + " ----> " + start);
						}
					}
				}

				else {
					if (move == 12 +(24 * counter_for_mid_to_end_exception1)) {
						System.out.println(end + " ----> " + mid);
						counter_for_mid_to_end_exception1++;
					}
					else if (move == 48 + (24 * (3*counter_for_mid_to_end_exception2))){
						System.out.println(end + " ----> " + mid);
						counter_for_mid_to_end_exception2++; 
					}
					else {
						if (move % 2 == 0 ) {
							System.out.println(mid + " ----> " + end);
						}
						else {
							System.out.println(end + " ----> " + mid);
						}
					}

				}
			}
		}
	}
	public static void main(String[] args) {
		hanoi(2,1,2,3);
	}
}
