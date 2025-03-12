package com.akib.day1_task;

import java.util.*;
class VectorDemo1 
{
public static void main(String args[]) 
{
Vector obj = new Vector(4,2);//capacity 4 and increment by 2 index  
obj.addElement(new Integer(3));
obj.addElement(new Integer(2));
obj.addElement(new Integer(5));

System.out.println(obj.capacity());
}
}

//Answer: 4 - capacity  if we add beyond the capacity then it will increment by 2 indices