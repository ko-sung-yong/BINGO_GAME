package project;

public class players {

	void game(int number, int count, int haysu, int win) {
        binggo Aplayer=new binggo();
        int i;   
        for(i=0;i<haysu;i++) {
        System.out.println("========================= "+(i+1)+"��° ���� =========================");
           if(number==1) {   
        	   System.out.println("##### �ʱⰪ ���ڸ� ���� #####");               
              Aplayer.round(count, win, i);  
               }            
           if(number==2) {       
        	   System.out.println("##### �ʱⰪ ���ڸ� ���� #####");               
              Aplayer.round2(count, win, i);
              }           
           if(number==3) {  
        	   System.out.println("##### �ʱⰪ ���ڸ� ���� #####");               
              Aplayer.round3(count, win,i);
           }
           }        
        System.out.println("==================================================");
        System.out.println("######### (�������) �� ���庰 ������ Line �� #########");
        Aplayer.lastline(count, number, haysu);
    }
	   }
	 
	 
	 
	 
	 
	 
	 
	 
	 

