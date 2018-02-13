package cn.jin.utils;

import java.util.ArrayList;

public class Utils {
	public static int total = 0;  
    public static void swap(String[] str, int i, int j)  
    {  
        String temp = new String();  
        temp = str[i];  
        str[i] = str[j];  
        str[j] = temp;  
    }  
    //全排列算法
    public static void arrange (String[] str, int st, int len, ArrayList<String> al)  
    {  
        if (st == len - 1)  
        {  StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len; i ++)  
            {  //将单个字母存入StringBuilder
//                System.out.print(str[i]+ "  ");  
                sb.append(str[i]);
            }  
            //将StringBuilder存入一个String[]
//            System.out.println(); 
            al.add(sb.toString());
            total++;  
        }  
        else  
        {  
            for (int i = st; i < len; i ++)  
            {  
                swap(str, st, i);  
                arrange(str, st + 1, len,al);  
                swap(str, st, i);  
            }  
        }  
          
    }  
    public static ArrayList<String>  getSiR(String str){
//    	String[] str1 = new String[6];
//    	str1[0] = str.substring(0, 1);
//    	str1[1] = str.substring(1, 2);
//    	str1[2] = str.substring(2, 3);
//    	str1[3] = str.substring(3, 4);
//    	str1[4] = str.substring(4, 5);
//    	str1[5] = str.substring(5, 6);
    	
    	ArrayList<String> sir = new ArrayList<String>();
    	for (int i = 0; i < 6; i++) {
			sir.add(str.substring(0, i+1));
		}
    	return sir;
    } 
//    public static ArrayList<String>  getTriangleSiR(String str){
//    	
//    	ArrayList<String> sir = new ArrayList<String>();
//    	for (int i = 0; i < 6; i++) {
//			sir.add(str.substring(0, i)+str.substring(i,i+1));
//		}
//    	return sir;
//    } 
    public static int  getSubtract(String str,String symbol){
    	
    	String sir =str.substring(0, str.indexOf(symbol));
    	String triSir =str.substring(0, str.indexOf(symbol)+1);
    	
    	int former=0;
    	int later =0;
    	if(triSir.contains("d")&&triSir.contains("e")){
    		if((triSir.contains("a")&&triSir.contains("b"))||(triSir.contains("c")&&triSir.contains("b"))||(triSir.contains("a")&&triSir.contains("c"))){
    			former = 2;
    		}else if(!triSir.contains("a")&&!triSir.contains("b")&&!triSir.contains("c")){
    			former = 0;
    		}else{
    			former =1;
    		}
    	}
    	if((triSir.contains("d")&&!triSir.contains("e"))||(triSir.contains("e")&&!triSir.contains("d"))){
    		if(triSir.contains("a")||triSir.contains("b")||triSir.contains("c")){
    			former =1;
    		}else{
    			former = 0;
    		}
    	}
//    	String sir = str.substring(0, str.length()-1);
    	if(sir.contains("d")&&sir.contains("e")){
    		if((sir.contains("a")&&sir.contains("b"))||(sir.contains("c")&&sir.contains("b"))||(sir.contains("a")&&sir.contains("c"))){
    			later = 2;
    		}else if(!sir.contains("a")&&!sir.contains("b")&&!sir.contains("c")){
    			later = 0;
    		}else{
    			later =1;
    		}
    	}
    	if((sir.contains("d")&&!sir.contains("e"))||(sir.contains("e")&&!sir.contains("d"))){
    		if(sir.contains("a")||sir.contains("b")||sir.contains("c")){
    			later =1;
    		}else{
    			later = 0;
    		}
    	}
    	return former -later;
    	
    }
}
