
public class Sales {
     
	public static void main(String[] args) {
      int[] price={12,16,10,14,15};
      int[][] product={{33,32,56,45,33},{77,33,68,45,23},{43,55,43,67,65}};
      int sales1=0, sales2=0, sales3=0;
      int pda=0,pdb=0,pdc=0,pdd=0,pde=0;
      for (int j=0;j<price.length;j++)
    		sales1+=product[0][j]*price[j];
    	    System.out.println("1�� sales�P����B="+sales1);
      for (int j=0;j<price.length;j++) 
      		sales2+=product[1][j]*price[j];
      		System.out.println("2�� sales�P����B="+sales2);
      for (int j=0;j<price.length;j++) 
          	sales3+=product[2][j]*price[j];
          	System.out.println("3�� sales�P����B="+sales3);
       for (int i=0;i<product.length;i++)
            pda+=product[i][0]*price[0];
             System.out.println("���~A�P����B="+pda);
        for (int i=0;i<product.length;i++)
            pdb+=product[i][1]*price[1];
             System.out.println("���~B�P����B="+pdb);
         for (int i=0;i<product.length;i++)
              pdc+=product[i][2]*price[2];
              System.out.println("���~C�P����B="+pdc);
         for (int i=0;i<product.length;i++)
              pdd+=product[i][3]*price[3];
              System.out.println("���~D�P����B="+pdd);             
          for (int i=0;i<product.length;i++)
              pde+=product[i][4]*price[4];
              System.out.println("���~E�P����B="+pde);   
          
          int[] performance={sales1,sales2,sales3};
          int salesmax=0;
          for (int i=0;i<performance.length;i++)
        	  if (performance[i]>=salesmax)
        		  salesmax=performance[i];
        	  System.out.println("���̦n�~�Z���P����~�Z"+salesmax);   
          int[] value={pda,pdb,pdc,pdd,pde}; 
          int productmax=0;
          for (int i=0;i<value.length;i++)
              if (value[i]>=productmax)
            	  productmax=value[i];
            	  System.out.println("���̦n���~���~�Z"+productmax);    
             
             
             
	}// end of main()

}// end of class
