
public class MaxMin {

	public static void main(String[] args) {
		int[] number={2,7,3,8,9,12,15,23,44,28};
	    int max=number[0];
	    for (int i=0;i<number.length;i++){
		if (number[i]>=max)
			max=number[i];
		}
		System.out.println("最大值= "+ max);
	    int min=number[0];
	    for (int i=0;i<number.length;i++){
		if (number[i]<=min)
			min=number[i];
		}
			System.out.println("最大值= "+ min);
	}

}
