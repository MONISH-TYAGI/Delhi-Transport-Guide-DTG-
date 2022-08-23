import java.util.*;



import Metro.Stations;
import Bus.Bus;
import DisplayGraphics.DisplayGraphics;
class OOPS{
  public static void showData(Scanner scn)
  {
    int count=0;
    char choice;
    int start=-1,dest=-1;
    int ch1=-1,ch2=-1;
    while(true){
System.out.println("  MetroLines :-");
System.out.println("  1-> Red Line");
System.out.println("  2-> Yellow Line");
System.out.println("  3-> Blue Line");
System.out.println("  4-> Green Line");
System.out.println("  5-> Violet Line");
System.out.println("  6-> Orange Line");
System.out.println("  7-> Pink Line");
System.out.println("  8-> Magenta Line");
System.out.println("  9-> Back");
if(start==-1)
System.out.print("  Enter the MetroLine Number that you want to checkout for your Start Station ");
else
System.out.print("  Enter the MetroLine Number that you want to checkout for your End Station ");
int ch=scn.nextInt();
if(ch==9) return;
if(ch>=1&&ch<=8){
Stations.printLine(ch);
if(count==0)
{
  System.out.print("  Enter your Start Station Index Or Zero for checking other MetroLines ");
  int check=scn.nextInt();
  if(check==0) continue;
  ch1=check;
  start=ch;
  count++;
}else
{
  System.out.print("  Enter your End Station Index Or Zero for checking other MetroLines ");
  int check=scn.nextInt();
  if(check==0) continue;
  ch2=check; 
  dest=ch;
  break;
}
}
else
System.out.println("  Invalid Input. Please enter correct Number of MetroLine");
    }
System.out.print("  Are you Sure? Y(yes):N(No):E(exit) ");
choice=scn.next().charAt(0);
if(choice=='Y'||choice=='y')
{
System.out.println("  ----------------------------------------Metro Route-----------------------------------------------");
Stations.pathThroughIndex(start,ch1-1,dest,ch2-1);
System.out.println("  ----------------------------------------Metro Route-----------------------------------------------");
}
else if(choice=='N'||choice=='n')
{
  showData(scn);
  return ;
}
else if(choice=='E'||choice=='e')
{
  return;
}
else 
{
  System.out.println("  Invalid Input......Choose again");
  showData(scn);
  return;
}
  }
    public static void Metro(Scanner scn){
      int ch;
      while(true){
      System.out.println("  1. View Metro Map");
      System.out.println("  2. Want to Enter Source & Destination Station Name ");
      System.out.println("  3. Choose Source & Destination Station Through MetroLine");
      System.out.println("  4. Back");
      System.out.print("  Enter your Choice ");
    
 ch=scn.nextInt();
 scn.nextLine();
 switch(ch)
 {
  case 1:DisplayGraphics.main(new String[0]);
  break;  
  case 2:{
    System.out.print("  Enter Start Station Name - ");
    String src=scn.nextLine();
    System.out.print("  Enter Destination Station Name - ");
    String dest=scn.nextLine();
    System.out.println("  ----------------------------------------Metro Route-----------------------------------------------"); 
    Stations.run(src.toUpperCase(),dest.toUpperCase());
    System.out.println("  ----------------------------------------Metro Route-----------------------------------------------");
  }
  break;
  case 3:showData(scn);
  break;
  case 4:return ;
 }
      }
    };
    public static void Bus(){
      Scanner scn=new Scanner(System.in);  
      while(true){
    try{

      System.out.println("  Enter 1 for Finding Bus Between Two Stops");
      System.out.println("  Enter 2 for Searching Bus Route through its Bus Number");
      System.out.println("  Enter 0 for Exit");
      System.out.print("  Enter your choice ");
      String str=scn.nextLine();
      str=str.trim();
     int  ch=Integer.parseInt(str);
      //  scn.nextLine();
      // System.out.println(ch);
      if(ch==1){
      System.out.print("  Enter your Start Stop Name or Zero for Back - ");
      String src=scn.nextLine();
      if(src.equals("0")==true)
      {  Bus();
        return ;}
 System.out.print("  Enter your Destination Stop Name or Zero for Back - ");
      String dest=scn.nextLine();
      if(dest.equals("0")==true){  Bus();
      return ;}
      System.out.println("  ---------------------------------------BUS ROUTE----------------------------------");
Bus.main(new String[]{src,dest});
      System.out.println("  ---------------------------------------BUS ROUTE----------------------------------");
      }else if(ch==2)
      {
        System.out.print("  Enter Bus Number or Zero for Back ");
        String busNumber=scn.nextLine();
        busNumber=busNumber.trim();
        // System.out.println(busNumber);
        if(busNumber.equals("0"))
       { Bus();
        return ;}
        System.out.println("  ---------------------------------------BUS ROUTE----------------------------------");
        Bus.main(new String[]{busNumber});
        System.out.println("  ---------------------------------------BUS ROUTE----------------------------------");
      }
      else if(ch==0) return ;
    }   catch(Exception e){
      System.out.println("  Invalid Input here");
    }finally{
    // Bus();3
    // return ;3
    }
  }
  
    };
    public static void Info(){
      System.out.println();
      System.out.println();
     
      System.out.println("  DTG-> DELHI TRANSPORT GUIDE");
      System.out.println("  DTG shows you AVAILABLE Bus Services & Metro Services DETAILS(Path,Time,Fair) between Start Stop to the End Stop of your journey.");
      System.out.println("  It also always shows you shortest Path to save your precious Time & Money.");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
    }
    public static void main(String args[])
    {
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
    Scanner scn = new Scanner(System.in) ;
    while(true){
    System.out.println("  -------------WELCOME TO DTG (DELHI TRANSPORT GUIDE)------------------");
    System.out.println("  1. METRO GUIDE"); 
    System.out.println("  2. BUS GUIDE");
    System.out.println("  3. Info");
    System.out.println("  4. Exit");
    System.out.println("  -----------------------------------------------------------------------");
    System.out.print("  Enter your choice ");
    int ch=scn.nextInt();
      switch(ch)
    {
      case 1:Metro(scn);
      break;
      case 2:Bus();
      break;
      case 3:{Info(); return; }
      
      case 4:{
        System.out.println("  Thanks for Using");
        System.out.println("-----------------------------------------------------------");
        return ;
      }
      default:System.out.println("  Invalid Input... Please enter your choice again");
    }
  }
   

    }  
}



