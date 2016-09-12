
public class Sales {
     
	public static void main(String[] args) {
      int[] price={12,16,10,14,15};
      int[][] product={{33,32,56,45,33},{77,33,68,45,23},{43,55,43,67,65}};
      int sales1=0, sales2=0, sales3=0;
      int pda=0,pdb=0,pdc=0,pdd=0,pde=0;
      for (int j=0;j<price.length;j++)
    		sales1+=product[0][j]*price[j];
    	    System.out.println("1號 sales銷售金額="+sales1);
      for (int j=0;j<price.length;j++) 
      		sales2+=product[1][j]*price[j];
      		System.out.println("2號 sales銷售金額="+sales2);
      for (int j=0;j<price.length;j++) 
          	sales3+=product[2][j]*price[j];
          	System.out.println("3號 sales銷售金額="+sales3);
       for (int i=0;i<product.length;i++)
            pda+=product[i][0]*price[0];
             System.out.println("產品A銷售金額="+pda);
        for (int i=0;i<product.length;i++)
            pdb+=product[i][1]*price[1];
             System.out.println("產品B銷售金額="+pdb);
         for (int i=0;i<product.length;i++)
              pdc+=product[i][2]*price[2];
              System.out.println("產品C銷售金額="+pdc);
         for (int i=0;i<product.length;i++)
              pdd+=product[i][3]*price[3];
              System.out.println("產品D銷售金額="+pdd);             
          for (int i=0;i<product.length;i++)
              pde+=product[i][4]*price[4];
              System.out.println("產品E銷售金額="+pde);   
          
          int[] performance={sales1,sales2,sales3};
          int salesmax=0;
          for (int i=0;i<performance.length;i++)
        	  if (performance[i]>=salesmax)
        		  salesmax=performance[i];
        	  System.out.println("有最好業績的銷售員業績"+salesmax);   
          int[] value={pda,pdb,pdc,pdd,pde}; 
          int productmax=0;
          for (int i=0;i<value.length;i++)
              if (value[i]>=productmax)
            	  productmax=value[i];
            	  System.out.println("有最好產品的業績"+productmax);    
             
             
             
	}// end of main()

}// end of class
