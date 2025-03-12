package nov23_Lab;

public class SleepIn {
  public static boolean sleepIn(boolean weekDay, boolean vacation)
  {
	  if(weekDay == true && vacation == true)
		  return true;
	  else if(weekDay == true || vacation== false)
		  return  false;
	  else if(weekDay==false || vacation==true)
		  return true;
	  else
		  return false;
  }
}
