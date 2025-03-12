package com.oop.demo;
class Test
{
int count;
public Test()
{
count = count +1 ;
}
public static void main(String argv[])
{
new Test();
new Test();
Test t = new Test();
System.out.println(t.count);
}
}
