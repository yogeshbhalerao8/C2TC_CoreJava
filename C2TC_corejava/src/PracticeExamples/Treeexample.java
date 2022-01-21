package PracticeExamples;
import java.util.*;
public class Treeexample {
		 public static void main(String args[])
		 {  
		   TreeMap<Integer,String> map=new TreeMap<Integer,String>();  
		      map.put(100,"Yogesh");    
		      map.put(102,"Yogesh");    
		      map.put(101,"Yogesh");    
		      map.put(103,"Yogesh");    
		      //map.put(null, "Xaviour");
		     map.put(105, null);
		        
		      for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }    
		 }  
		


	}


