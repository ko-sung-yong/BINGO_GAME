package project;

public class binggo {
    int lastR[] = new int[100];
    int lastR2[] = new int[100];
    int lastR3[] = new int[100]; 
  //1¸íÀÏ¶§ ºù°í °ÔÀÓ// 
     void round(int count, int win, int haysu) {
        int j,k,i,m,n;    
          int random;        
          int matrix[][]=new int[count][count]; 
          int increase=1;
          int ranx=(int)(Math.random()*count);
          int rany=(int)(Math.random()*count);
          for(i=0;i<count;i++) {
             for(j=0;j<count;j++) {
               matrix[i][j]=increase++; 
             }
          }
          for(k=0;k<count;k++) {
             for(i=0;i<count;i++) {
                for(j=0;j<count;j++) {
                   random=matrix[i][j];                
                   matrix[i][j]=matrix[ranx][rany];
                   matrix[ranx][rany]=random;
                } 
                }
             }
          for(k=0;k<count;k++) {
          for(i=0;i<count;i++) {
              for(j=0;j<count;j++) {
                 System.out.print(matrix[i][j]+"\t");
              }
              System.out.println("");
           }   
          
        boolean round = true;
        int randomnum;
        int n1=0;
        int cnt=0;
        while(round) {
           randomnum = (int)(Math.random()*count*count)+1;
           for(i=0;i<count;i++) {
              for(j=0;j<count;j++) {
                 if(matrix[i][j] == randomnum) {
                    System.out.println("#####("+(n1+1)+" round) RandNumber : "+randomnum+" #####");
                    matrix[i][j] = 0;
                    for(m=0;m<count;m++) {
                             for(n=0;n<count;n++) {
                                System.out.print(matrix[m][n]+"\t");
                             }
                             System.out.println("");
                          }
                    
                    int v[]=new int[count]; //°¡·Î
                    int h[]=new int[count]; //¼¼·Î
                    int c[]=new int[2];  //´ë°¢¼± 
                    for(i=0;i<count;i++) {
                    	for(j=0;j<count;j++) {
                    		if(matrix[i][j]==0) {
                    			v[i]++; h[j]++;
                    			if(i==j) {c[0]++;}
                    			if(i+j==count-1) {c[1]++;}
                    			}
                    		} 
                    	}
                    for(k=0;k<v.length;k++) {
                    	if(v[k]==v.length) {cnt++;}
                    	if(h[k]==v.length) {cnt++;	} }
                    if(c[0]==v.length) {cnt++;}
                    if(c[1]==v.length) {cnt++;}                                    
                    System.out.println("*** ÆÀÀÌ¸§ : 1ÆÀ.\t\tLine »ý¼º°³¼ö : "+cnt);
                    if(win <= cnt) {
                       lastR[haysu]= cnt;
                       round = false;
                    }
                    cnt=0;  n1++;
                 } 
                 }
              } 
           }
        }
          }
     
 //2¸íÀÏ¶§ ºù°í °ÔÀÓ//   
     void round2(int count, int win, int haysu) {
             int j,k,i,m,n,l,p,q,g;    
             int random;
             int matrix[][]=new int[count][count];
             int matrix2[][]=new int[count][count];
             int increase=1;
             int increase2=1;
             int ranx=(int)(Math.random()*count);
             int rany=(int)(Math.random()*count);
             for(i=0;i<count;i++) {
                for(j=0;j<count;j++) {
                  matrix[i][j]=increase++; 
                  matrix2[i][j]=increase2++;
                }
             }
             for(k=0;k<count;k++) {
                for(i=0;i<count;i++) {
                   for(j=0;j<count;j++) {
                      random=matrix[i][j];                
                      matrix[i][j]=matrix[ranx][rany];
                      matrix[ranx][rany]=random;
                   }
                   }
                }
             
             for(n=0;n<count-1;n++) {
                for(k=0;k<count;k++) {
                   for(i=0;i<count;i++) {
                      for(j=0;j<count;j++) {
                         random=matrix2[i][j];                
                         matrix2[i][j]=matrix2[ranx][rany];
                         matrix2[ranx][rany]=random;
                      } 
                      }
                   }
                }
             
             for(k=0;k<count;k++) {
             for(i=0;i<count;i++) {
                   for(j=0;j<count;j++) {
                      System.out.print(matrix[i][j]+"\t");
                   }
                   for(m=0;m<count;m++) {
                      System.out.print("\t"+matrix2[i][m]);
                   }
                   System.out.println("");
                }
             
            boolean round = true;
            int randomnum;
            int n1=0;
            int cnt=0,cut=0;            
            while(round) {
               randomnum = (int)(Math.random()*count*count)+1;
               for(i=0;i<count;i++) {
                  for(j=0;j<count;j++) {
                     for(k=0;k<count;k++) {
                        for(g=0;g<count;g++) {
                     if(matrix[i][j] == randomnum && matrix2[k][g] == randomnum) {
                        matrix[i][j] = 0;
                        matrix2[k][g] = 0;
                        System.out.println("#####("+(n1+1)+" round) RandNumber : "+randomnum+" #####");
                        for(m=0;m<count;m++) {
                              for(n=0;n<count;n++) {
                                 System.out.print(matrix[m][n]+"\t");
                              }
                              for(l=0;l<count;l++) {
                                 System.out.print("\t"+matrix2[m][l]);
                              }
                              System.out.println("");}
                        
                        int v[]=new int[count]; //°¡·Î
                        int h[]=new int[count]; //¼¼·Î
                        int c[]=new int[2];  //´ë°¢¼± 
                        for(m=0;m<count;m++) {
                        	for(n=0;n<count;n++) {
                        		if(matrix[m][n]==0) {
                        			v[m]++; h[n]++;
                        			if(m==n) {c[0]++;}
                        			if(m+n==count-1) {c[1]++;}}} }
                        for(p=0;p<v.length;p++) {
                        	if(v[p]==v.length) {cnt++;}
                        	if(h[p]==v.length) {cnt++;	} }
                        if(c[0]==v.length) {cnt++;}
                        if(c[1]==v.length) {cnt++;}                          
                        
                        int v1[]=new int[count]; //°¡·Î
                        int h1[]=new int[count]; //¼¼·Î
                        int c1[]=new int[2];  //´ë°¢¼± 
                        for(m=0;m<count;m++) {
                        	for(l=0;l<count;l++) {
                        		if(matrix2[m][l]==0) {
                        			v1[m]++; h1[l]++;
                        			if(m==l) {c1[0]++;}
                        			if(m+l==count-1) {c1[1]++;}}} }
                        for(q=0;q<v1.length;q++) {
                        	if(v1[q]==v1.length) {cut++;}
                        	if(h1[q]==v1.length) {cut++;	} }
                        if(c1[0]==v1.length) {cut++;}
                        if(c1[1]==v1.length) {cut++;}                  
             
                       System.out.println("*** ÆÀÀÌ¸§ : 1ÆÀ.\t\tLine »ý¼º°³¼ö : "+cnt);
                       System.out.println("*** ÆÀÀÌ¸§ : 2ÆÀ.\t\tLine »ý¼º°³¼ö : "+cut);
                       if(win <= cnt || win <= cut) {
                          lastR[haysu] = cnt;
                          lastR2[haysu] = cut;
                          round = false;
                       }
                       n1++;
                       cnt=0;   cut=0;  
                     }
                     }
                        }
                     } 
                  }
               }  
            }
             }
 //3¸íÀÏ¶§ ºù°í °ÔÀÓ//
     void round3(int count, int win, int haysu) {  
        int j,k,i,m,n,l,p,q,g,a,b,t;    
          int random;
          int matrix[][]=new int[count][count];
          int matrix2[][]=new int[count][count];
          int matrix3[][]=new int[count][count];
          int increase=1;
          int increase2=1;
          int increase3=1;
          int ranx=(int)(Math.random()*count);
          int rany=(int)(Math.random()*count);
          for(i=0;i<count;i++) {
             for(j=0;j<count;j++) {
               matrix[i][j]=increase++; 
               matrix2[i][j]=increase2++;
               matrix3[i][j]=increase3++;
             }}
          for(k=0;k<count;k++) {
             for(i=0;i<count;i++) {
                for(j=0;j<count;j++) {
                   random=matrix[i][j];                
                   matrix[i][j]=matrix[ranx][rany];
                   matrix[ranx][rany]=random;
                }
                }
             }
          for(n=0;n<count-1;n++) {
             for(k=0;k<count;k++) {
                for(i=0;i<count;i++) {
                   for(j=0;j<count;j++) {
                      random=matrix2[i][j];                
                      matrix2[i][j]=matrix2[ranx][rany];
                      matrix2[ranx][rany]=random;
                   } 
                   }
                } 
             }
         for(n=0;n<count-2;n++) {
            for(k=0;k<count;k++) {
               for(i=0;i<count;i++) {
                  for(j=0;j<count;j++) {
                     random=matrix3[j][i];                
                     matrix3[j][i]=matrix3[ranx][rany];
                     matrix3[ranx][rany]=random;
                  } 
                  }
               } 
            }
         
         for(k=0;k<count;k++) {
         for(i=0;i<count;i++) {
                for(j=0;j<count;j++) {
                   System.out.print(matrix[i][j]+"\t");  }
                for(m=0;m<count;m++) {System.out.print("\t"+matrix2[i][m]);  }
                System.out.print("\t");
                for(m=0;m<count;m++) {System.out.print("\t"+matrix3[i][m]); }
                System.out.println(""); }
         
            boolean round = true;
            int randomnum;
            int n1=0;
            int cnt=0,cut=0,thu=0;
            while(round) {
               randomnum = (int)(Math.random()*count*count)+1;
               for(i=0;i<count;i++) {
                  for(j=0;j<count;j++) {
                     for(k=0;k<count;k++) {
                        for(g=0;g<count;g++) {
                           for(a=0;a<count;a++) {
                              for(b=0;b<count;b++) {
                     if(matrix[i][j] == randomnum && matrix2[k][g] == randomnum && matrix3[a][b] == randomnum) {
                        matrix[i][j] = 0;   matrix2[k][g] = 0;   matrix3[a][b] = 0;
                        System.out.println("#####("+(n1+1)+" round) RandNumber : "+randomnum+" #####");
                        for(m=0;m<count;m++) {
                              for(n=0;n<count;n++) {System.out.print(matrix[m][n]+"\t"); }
                              for(l=0;l<count;l++) { System.out.print("\t"+matrix2[m][l]); }
                              System.out.print("\t");
                              for(l=0;l<count;l++) {  System.out.print("\t"+matrix3[m][l]);  }
                              System.out.println("");
                           }
                      
                        int v[]=new int[count]; //°¡·Î
                        int h[]=new int[count]; //¼¼·Î
                        int c[]=new int[2];  //´ë°¢¼± 
                        for(i=0;i<count;i++) {
                        	for(j=0;j<count;j++) {
                        		if(matrix[i][j]==0) {
                        			v[i]++; h[j]++;
                        			if(i==j) {c[0]++;}
                        			if(i+j==count-1) {c[1]++;}
                        			}
                        		} 
                        	}
                        for(p=0;p<v.length;p++) {
                        	if(v[p]==v.length) {cnt++;}
                        	if(h[p]==v.length) {cnt++;}
                        	}
                        if(c[0]==v.length) {cnt++;}
                        if(c[1]==v.length) {cnt++;}                           
                        
                        int v1[]=new int[count]; //°¡·Î
                        int h1[]=new int[count]; //¼¼·Î
                        int c1[]=new int[2];  //´ë°¢¼± 
                        for(k=0;k<count;k++) {
                        	for(g=0;g<count;g++) {
                        		if(matrix2[k][g]==0) {
                        			v1[k]++; h1[g]++;
                        			if(k==g) {c1[0]++;}
                        			if(k+g==count-1) {c1[1]++;}
                        			}
                        		}
                        	}
                        for(q=0;q<v1.length;q++) {
                        	if(v1[q]==v1.length) {cut++;}
                        	if(h1[q]==v1.length) {cut++;} 
                        	}
                        if(c1[0]==v1.length) {cut++;}
                        if(c1[1]==v1.length) {cut++;}                       
                        
                        int v2[]=new int[count];
                        int h2[]=new int[count];
                        
                        int c2[]=new int[2];
                        for(a=0;a<count;a++) {
                        	for(b=0;b<count;b++) {
                        		if(matrix3[a][b]==0) {
                        			v2[a]++; h2[b]++;
                        			if(a==b) {c2[0]++;}
                        			if(a+b==count-1) {c2[1]++;}
                        			}
                        		}  
                        	}
                        for(t=0;t<v2.length;t++) {
                        	if(v2[t]==v2.length) {thu++;}
                        	if(h2[t]==v2.length) {thu++;}
                        	}
                        	if(c2[0]==v2.length) {thu++;}
                        	if(c2[1]==v2.length) {thu++;} 
                       System.out.println("*** ÆÀÀÌ¸§ : 1ÆÀ.\t\tLine »ý¼º°³¼ö : "+cnt);
                       System.out.println("*** ÆÀÀÌ¸§ : 2ÆÀ.\t\tLine »ý¼º°³¼ö : "+cut);
                       System.out.println("*** ÆÀÀÌ¸§ : 3ÆÀ.\t\tLine »ý¼º°³¼ö : "+thu);
                       if(win <= cnt || win <= cut || win <= thu) {
                          lastR[haysu] = cnt;
                          lastR2[haysu] = cut;
                          lastR3[haysu] = thu;
                          round = false;
                          }
                       n1++;
                       cnt=0; cut=0;   thu=0;   
                     } 
                     } 
                              }
                           }
                        } 
                     } 
                  } 
               }
            } 
         }
     
     void lastline(int count, int num, int haysu) {
         int z,x,y,t;
         int awin=0,bwin=0, cwin=0,draw=0;
         if(num == 1) {
           System.out.print("ÆÀÀÌ¸§ : 1ÆÀ.\t\t");
           for(z=0;z<haysu;z++) { System.out.print(lastR[z]+"\t");  }
           System.out.println(""); }        
         if(num == 2) {  System.out.print("ÆÀÀÌ¸§ : 1ÆÀ.\t\t");
         for(z=0;z<haysu;z++) {  System.out.print(lastR[z]+"\t");  }
             System.out.println("");
             System.out.print("ÆÀÀÌ¸§ : 2ÆÀ.\t\t");
             for(x=0;x<haysu;x++) {  System.out.print(lastR2[x]+"\t"); }
             System.out.println("");
             System.out.print("\t \t  ");
             for(t=0;t<haysu;t++) {  
                 if(lastR[t]>lastR2[t]) {
                    System.out.print("\t"+"1ÆÀ win ");
                    awin++;
                 }
                 else if (lastR[t]<lastR2[t]){
                    System.out.print("\t"+"2ÆÀ win");
                    bwin++;
                 }
                 else {
                    System.out.print("\t"+"Draw" );
                    draw++;
                 }
             }
             System.out.println();
             if(awin>bwin) {
                System.out.print("1ÆÀ½Â¸® : "+awin+"\t"+"2ÆÀ½Â¸® : "+bwin+"\t ¹«½ÂºÎ : "+draw+"\nÃÖÁ¾°á°ú : 1 ÆÀ ½Â¸®!!");
             }
             else if(awin<bwin) {
                System.out.print("1ÆÀ½Â¸® : "+awin+"\t"+"2ÆÀ½Â¸® : "+bwin+"\t ¹«½ÂºÎ : "+draw+"\nÃÖÁ¾°á°ú : 2 ÆÀ ½Â¸®!!");               
             }
             else {
                System.out.print("1ÆÀ½Â¸® : "+awin+"\t"+"2ÆÀ½Â¸® : "+bwin+"\t ¹«½ÂºÎ : "+draw+"\nÃÖÁ¾°á°ú : ¹«½ÂºÎ!!");
             }
         } 
         if(num == 3) {
              System.out.print("ÆÀÀÌ¸§ : 1ÆÀ.\t\t");
              for(x=0;x<haysu;x++) {
                    System.out.print(lastR[x]+"\t");
              }
              System.out.println("");
              System.out.print("ÆÀÀÌ¸§ : 2ÆÀ.\t\t");
              for(y=0;y<haysu;y++) { System.out.print(lastR2[y]+"\t"); }
              System.out.println("");
              System.out.print("ÆÀÀÌ¸§ : 3ÆÀ.\t\t");
              for(z=0;z<haysu;z++) { System.out.print(lastR3[z]+"\t"); }
              System.out.println("");
              System.out.print("\t \t  ");
              
              for(t=0;t<haysu;t++) {                
                 if(lastR[t]>lastR2[t] && lastR[t]>lastR3[t]) {
                    System.out.print("\t"+"1ÆÀ win ");
                    awin++;
                 }
                 else if (lastR[t]<lastR2[t]&&lastR2[t]>lastR3[t]){
                    System.out.print("\t"+"2ÆÀ win");
                    bwin++;
                 }
                 else if(lastR3[t]>lastR[t]&&lastR3[t]>lastR2[t]) {
                    System.out.print("\t"+"3ÆÀ win");
                    cwin++;
                 }
                 else {
                    System.out.print("\t"+"Draw" );
                    draw++;
                 }
             }
             System.out.println();
             if(awin>bwin&&awin>cwin) {
                System.out.print("1ÆÀ½Â¸® : "+awin+"\t"+"2ÆÀ½Â¸® : "+bwin+"\t 3ÆÀ½Â¸® : "+cwin+"\t ¹«½ÂºÎ : "+draw+"\nÃÖÁ¾°á°ú : 1ÆÀ½Â¸®!!");
             }
             else if(awin<bwin&&bwin>cwin) {
                System.out.print("1ÆÀ½Â¸® : "+awin+"\t"+"2ÆÀ½Â¸® : "+bwin+"\t 3ÆÀ½Â¸® : "+cwin+"\t ¹«½ÂºÎ : "+draw+"\nÃÖÁ¾°á°ú : 2ÆÀ½Â¸®!!");               
             }
             else if(awin<cwin&&bwin<cwin) {
                System.out.print("1ÆÀ½Â¸® : "+awin+"\t"+"2ÆÀ½Â¸® : "+bwin+"\t 3ÆÀ½Â¸® : "+cwin+"\t ¹«½ÂºÎ : "+draw+"\nÃÖÁ¾°á°ú : 3ÆÀ½Â¸®!!");               
             }
             else {
                System.out.print("1ÆÀ½Â¸® : "+awin+"\t"+"2ÆÀ½Â¸® : "+bwin+"\t 3ÆÀ½Â¸® : "+cwin+"\t ¹«½ÂºÎ : "+draw+"\nÃÖÁ¾°á°ú : ¹«½ÂºÎ!!");
             }
         }
       
    }
}
