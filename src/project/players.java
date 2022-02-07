package project;

public class players {

	void game(int number, int count, int haysu, int win) {
        binggo Aplayer=new binggo();
        int i;   
        for(i=0;i<haysu;i++) {
        System.out.println("========================= "+(i+1)+"번째 게임 =========================");
           if(number==1) {   
        	   System.out.println("##### 초기값 숫자만 생성 #####");               
              Aplayer.round(count, win, i);  
               }            
           if(number==2) {       
        	   System.out.println("##### 초기값 숫자만 생성 #####");               
              Aplayer.round2(count, win, i);
              }           
           if(number==3) {  
        	   System.out.println("##### 초기값 숫자만 생성 #####");               
              Aplayer.round3(count, win,i);
           }
           }        
        System.out.println("==================================================");
        System.out.println("######### (최종결과) 각 라운드별 생성한 Line 수 #########");
        Aplayer.lastline(count, number, haysu);
    }
	   }
	 
	 
	 
	 
	 
	 
	 
	 
	 

