package nit.array_21_02_24;

public class Q30 
{
      public static void main(String[] args)
      {
		String str= "apple";
		char ch[] = str.toCharArray();
		int i,j;
		char temp ='\u0000';
		for(i=0;i<ch.length;i++)
		{
			for(j=i+1;j<ch.length-1;j++)
			{
				if(ch[i]>ch[j])
				{
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		str = new String(ch);
		System.out.println(ch);
	  }
}
