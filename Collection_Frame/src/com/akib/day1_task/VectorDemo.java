package com.akib.day1_task;

import java.util.*;
class VectorDemo{
public static void main(String args[]){
Vector obj = new Vector(4,2);
obj.addElement(new Integer(3));
obj.addElement(new Integer(2));
obj.addElement(new Integer(5));
System.out.println(obj.elementAt(1));
}
}
// Answer: 2