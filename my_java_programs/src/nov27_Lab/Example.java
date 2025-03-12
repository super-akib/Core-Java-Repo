package nov27_Lab;

public class Example {
int a=10;
{
System.out.print("SB ");
}
{
System.out.print("NSB");
}
Example(){
System.out.print( "Const ");
System.out.print(this.a);
}
public static void main(String[] args) {
System.out.print(new Example().a);
new Example();
}

}