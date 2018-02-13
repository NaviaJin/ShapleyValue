package cn.jin.test;

import java.util.ArrayList;
import java.util.List;

import cn.jin.utils.Utils;

public class Test {

	public static void main(String[] args) {
		//abc绿，de红色，f白色
		 String str[] = {"a","b","c","d","e","f"};  
		 ArrayList<String> al = new ArrayList<String>();
         Utils.arrange(str, 0, str.length, al);
         
         int a = 0;
         int b = 0;
         int c = 0;
         int d = 0;
         int e = 0;
         int f = 0;
         for (String string : al) {
			System.out.println("我是一种可能：："+string+"哈哈");
			a=a+Utils.getSubtract(string, "a");
			b=b+Utils.getSubtract(string, "b");
			c=c+Utils.getSubtract(string, "c");
			d=d+Utils.getSubtract(string, "d");
			e=e+Utils.getSubtract(string, "e");
			f=f+Utils.getSubtract(string, "f");
			//里面存了所有的triSir
//			ArrayList<String> sir = Utils.getSiR(string);
////			System.out.println();
//			for (String string2 : sir) {
//				System.out.print("我是triSir：："+string2+"嘿嘿");
////				Utils.getSubtract(string2);
//			}
//			System.out.println();
			
		}
         System.err.println(Utils.total);
         System.out.println(a+"::"+b+"::"+c+"::"+d+"::"+e+"::"+f);
         
	}
//	public static int total = 0;  
//    public static void swap(String[] str, int i, int j)  
//    {  
//        String temp = new String();  
//        temp = str[i];  
//        str[i] = str[j];  
//        str[j] = temp;  
//    }  
//    public static void arrange (String[] str, int st, int len)  
//    {  
//        if (st == len - 1)  
//        {  
//            for (int i = 0; i < len; i ++)  
//            {  
//                System.out.print(str[i]+ "  ");  
//            }  
//            System.out.println();  
//            total++;  
//        }  
//        else  
//        {  
//            for (int i = st; i < len; i ++)  
//            {  
//                swap(str, st, i);  
//                arrange(str, st + 1, len);  
//                swap(str, st, i);  
//            }  
//        }  
//          
//    }  
   

}
