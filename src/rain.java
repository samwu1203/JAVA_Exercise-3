
public class rain {

	public static void main(String[] args) {
		double[][][] all = { {{ 71.9, 68, 119.1 }, { 27.4, 222.0, 284.6 },{ 264.2, 166.6, 51.6},{ 92.6, 231.2, 159.4}},
				        { { 157.4, 268.8, 85.4 }, { 289.1, 231.2, 625.6 },{ 162.8, 518.9, 85.0},{ 64.0, 232.7, 189.4}},
				        { { 93.0, 34.4, 49.1 }, { 253.0, 338.4, 203.1},{ 240.5, 808.7, 143.1},{ 240.5, 808.7, 143.1}},
				        { { 21.8, 198.0, 147.0 }, { 98.1, 634.7, 384.4},{ 222.1, 84.0, 198.9},{ 25.5, 46.0, 86.8}},
				        { { 20.0, 90.0, 182.0 }, {87.6, 302.8, 248.3},{ 316.8, 728.2, 309.9},{ 135.3, 22.6, 75.7}},
				 }; // 5*4*3
		double qun=0;
		for (int i=0;i<all.length;i++){
		for (int j=0;j<all[i].length;j++)
		for (int k=0;k<all[i][j].length;k++)
		       qun+=all[i][j][k];  
		}// end of if
		qun=qun/60;
		System.out.print("五年平均雨量=");
		System.out.printf("%10.2f%n",qun);
		
	    int year=2, season=4, month=0;// 輸入查詢平均雨量的年, 季, 月
		
		if ((year>5) || (season>4) || (month>12))
			System.out.println("輸入錯誤");

		if (month==0 && season!=0){
			int i=(year-1), j=(season-1);
			qun=0;
			for (int k=0;k<all[i][j].length;k++){
				qun+=all[i][j][k];
			}
			    qun=qun/3;	
			System.out.print(year+"年"+season+"季平均雨量=");
			System.out.printf("%10.2f%n",qun);
		}//end of first if	
		
		if(month==0 && season==0){
		    int i=(year-1);
			qun=0;
			for (int j=0;j<all[i].length;j++){
			for (int k=0;k<all[i][j].length;k++)
				qun+=all[i][j][k];
			}
			    qun=qun/12;
			System.out.print(year+"年平均雨量="); 
			System.out.printf("%10.2f%n",qun);
		}    //end of second if	
		
		if(year!=0 && month!=0 && season!=0){
			int i=year-1, j=season-1, k=1;
			if (month<=3) k=month-1;
			else if (month%3==0)  k=2;
			else if (month%3!=0) k=month%3-1;
			qun=all[i][j][k];
			System.out.print(year+"年"+season+"季"+month+"月平均雨量="); 
			System.out.printf("%10.2f%n",qun);
		}
	}// end of main()

}// end of class
