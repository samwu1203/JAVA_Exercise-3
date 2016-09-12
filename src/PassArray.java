
public class PassArray {
	static double average (int x[][]) {
		double result = 1;
		for (int i=0;i<x.length;i++)
		for (int j=0;j<x[i].length;j++)
			result += x[i][j];
		    result=result/12;
		return result;
	}
	
	static int Max (int x[][]) {
		int Max = 0;
		for (int i=0;i<x.length;i++)
		for (int j=0;j<x[i].length;j++)
			if (x[i][j]>Max) Max=x[i][j];
		return Max;
	}
	static int Min (int x[][]) {
		int Min = x[0][0];
		for (int i=0;i<x.length;i++)
		for (int j=0;j<x[i].length;j++)
			if (x[i][j]<Min) Min=x[i][j];
		return Min;
	}
	static double  AvgBya (int x[][], int y) {
		double AvgByaa=0;
		int i=y;
		for (int j=0;j<x[i].length;j++){
		AvgByaa+=x[i][j];
		}
		AvgByaa=AvgByaa/4;
		return AvgByaa;
	}
	
	public static void main(String[] args) {
	int[][] number={{ 71, 68, 119, 20 }, { 27, 222, 284, 30 },{ 264, 166, 51, 40}};
	double a;
	a= average(number);
	System.out.print("������=");
	System.out.printf("%5.2f%n", a);
	
	int b;
	b= Max(number);
	System.out.println("�̤j��="+b);
	
	int c;
	c= Min(number);
	System.out.println("�̤p��="+c);
	
	double avga, avgb, avgc;
	avga=AvgBya(number,0);
	System.out.print("�@�ե�����=");
	System.out.printf("%5.2f%n", avga);
	avgb=AvgBya(number,1);
	System.out.print("�G�ե�����=");
	System.out.printf("%5.2f%n", avgb);
	avgc=AvgBya(number,2);
	System.out.print("�T�ե�����=");
	System.out.printf("%5.2f%n", avgc);
	
	

	}// end og main()

}// end of class
