import java.util.*;

public class Calendar {
  
  public static void main(String[] args)
  {
    String location;
    
    String priority;
    
    int prioritynum;
    
    String sDate;
    
    String eDate;
    
    String summary;
    
    String sHour;
      
    String eHour;
    
    String sMinute;
    
    String eMinute;
    
    String sDay;
    
    String eDay;
    
    String sMonth;
    
    String eMonth;
    
    String sYear;
    
    String eYear;
      
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please Enter a start year: example 1997");
    
    sYear = input.nextLine();
    
    System.out.print("Please Enter a end year: example 1997");
    
    eYear = input.nextLine();
    
    System.out.print("Please Enter a start month in numbers: example 01 = January 02 = February");
    
    sMonth = input.nextLine();
    
    System.out.print("Please Enter a end month: example 01 = January 02 = February");
    
    eMonth = input.nextLine();
    
    System.out.println("Please Enter a start day in numbers: ");
    
    sDay = input.nextLine();
    
    System.out.println("Please Enter a end day in numbers: ");
    
    eDay = input.nextLine();
    
    System.out.println("Please Enter Event Location: ");
    
    location = input.nextLine();
    
    System.out.println("Please Enter a Summary of the Event: ");
    
    summary = input.nextLine();
    
    System.out.println("Please Enter Priority Number 1-9: 1 Being the most important and 9 being the least important");
    
    prioritynum = input.nextInt();
    input.nextLine();
    
    System.out.println("Please Enter a Start Hour 00-23");
    
    sHour = input.nextLine();
    
    System.out.println("Please Enter a End Hour 00-23");
    
    eHour = input.nextLine();
    
    System.out.println("Please Enter a Start Minute: 0 - 59");
    
    sMinute = input.nextLine();
    
    System.out.println("Please Enter a End Minute: 0 - 59");
    
    eMinute = input.nextLine();
    
    System.out.println("You have Scheduled to " + summary + " at " + location + " from Year: " + sYear + " Month: "  + sMonth + " Day: " + sDay + " Hour: " + sHour + " Minutes: "  + sMinute); 
    
    System.out.println("" + eYear + " Month: "  + eMonth + " Day: " + eDay + " Hour: " + eHour + " Minutes: "  + eMinute);
    
    System.out.println(prioritynum);
    
    
    sDate = "" + sYear + sMonth + sDay + "T" + sHour + sMinute + "00";
    
    eDate = "" + eYear + eMonth + eDay + "T" + eHour + eMinute + "00";
    
    System.out.println(sDate);
    
    System.out.println(eDate);
      
      
        
      
        
   
      
      
      
  }

}
