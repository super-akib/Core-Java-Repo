package com.akib.day1_task;

import java.util.*;
class VectorDemo2 
{
public static void main(String args[]) {
Vector obj = new Vector(4,2);
obj.addElement(new Integer(3));
obj.addElement(new Integer(2));
obj.addElement(new Integer(6));
obj.insertElementAt(new Integer(8), 2);
System.out.println(obj);
}
}
//[3,2,8,6]