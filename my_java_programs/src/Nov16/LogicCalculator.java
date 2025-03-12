package Nov16;

 class LogicCalculator {
  public static int calculator(int n1,int n2,char op)
  {
	  int result =0 ;
	  switch(op)
	  {
	    case '+': result = n1 + n2;   break;
	    case  '-': result = n1 - n2;  break;
	    case '/' : result = n1 / n2;  break;
	    case '*' :  result = n1 * n2; break;
	    case '%' :  result = n1 % n2; break;
	    default : System.out.println("Invalid Operator..");
	    break;
	  }
	  return result;
  }
}
