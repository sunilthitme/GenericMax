package com.bridglabz.generic;

public class Generic {
public static void main(String[] args) {
	compare();
}
public static Integer compare(){
	Value<Integer>v=new Value(4,3,2);	
	  if (v.value2.compareTo(v.value1) > 0 && v.value2.compareTo(v.value3) > 0) {
          v.max = v.value2;
	  }
      else if (v.value3.compareTo(v.value2) > 0 && v.value3.compareTo(v.value1) > 0) {
         v. max = v.value3;
      }
      else {
    	  v. max = v.value1;
      }
         System.out.print("max of "+"value1 "+"value2 "+"value3 is :: "+v.max);
      return v.max;
 
	
}
}
class Value<V>{
	V value1,value2,value3,max;
	public Value(V value1,V value2,V value3) {
		this.value1=value1;
		this.value2=value2;
		this.value3=value3;
		
	}
}