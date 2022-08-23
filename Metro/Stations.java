package Metro;
import java.util.*;
import Metro.Custom;
public class Stations {
    
 static  HashSet<String> blueline;
   static   HashSet<String> yellowline;
   static    HashSet<String>violetline;
   static   HashSet<String> redline;
   static   HashSet<String> greenline;
   static   HashSet<String> orangeline;
   static   HashSet<String> pinkline;
   static   HashSet<String> magentaline;
   static  String[] blueLineStation={
    "Dwarka Sector - 21",
    "Dwarka Sector - 8",
    "Dwarka Sector - 9",
    "Dwarka Sector - 10",
    "Dwarka Sector - 11",
    "Dwarka Sector - 12",
    "Dwarka Sector - 13",
    "Dwarka Sector - 14",
    "Dwarka",
    "Dwaraka Mor",
    "Nawada",
    "Uttam Nagar West",
    "Uttam Nagar East",
    "Janak Puri West",
    "Janak Puri East",
    "Tilak Nagar",
    "Subash Nagar",
    "Tagore Garden",
    "Rajouri Garden",
    "Ramesh Nagar",
    "Moti Nagar",
    "Kirti Nagar",
    "Shadipur",
    "Patel Nagar",
    "Rajendra Place",
    "Karol Bagh",
    "Jhandewalan",
    "RK Ashram Marg",
    "Rajiv Chowk",
    "Barakhamba",
    "Mandi House",
    "Pragati Maidan",
    "Indraprastha",
    "Yamuna Bank",
    "Akshardham",
    "Mayur Vihar-I",
    "Mayur Vihar Ext",
    "New Ashok Nagar",
    "Noida Sect 15",
    "Noida Sect 16",
    "Noida Sect 18",
    "Botanical Garden",
    "Golf Course",
    "Noida City Centre",
    "Noida Sec-34",
    "Noida Sec-52",
    "Noida Sec-61",
    "Noida Sec-59",
    "Noida Sec-62",
    "Noida Electronic City",
    "Yamuna Bank",
    "Laxmi Nagar",
    "Nirman Vihar",
    "Preet Vihar",
    "Karkarduma",
    "Anand Vihar",
    "Kaushambi",
    "Vaishali"
};

static    String []yellowLineStation={
"Samaypur Badli",
"Rohini Sector 18-19",
"Haiderpur Badli Mor",
"Jahangirpuri",
"Adarsh Nagar",
"Azadpur",
"Model Town",
"GTB Nagar",
"Vishwavidyalaya",
"Vidhan Sabha",
"Civil Lines",
"Kashmere Gate",
"Chandni Chowk",
"Chawri Bazar",
"New Delhi",
"Rajiv Chowk",
"Patel Chowk",
"Central Secretariat",
"Udyog Bhawan",
"Lok Kalyan Marg",
"Jorbagh",
"INA",
"AIIMS",
"Green Park",
"Hauz Khas",
"Malviya Nagar",
"Saket",
"Qutab Minar",
"Chhattarpur",
"Sultanpur",
"Ghitorni",
"Arjan Garh",
"Gurudronacharya",
"Sikanderpur",
"MG Road",
"IFFCO Chowk",
"Huda City Centre"
};

static    String[]violetLineStation={
"Kashmere Gate",
"Lal Quila",
"Jama Masjid ",
"Delhi Gate",
"ITO",
"Mandi House",
"Janpath",
"Central Secretariat",
"Khan Market",
"Jawahar Lal Nehru Stadium",
"Jangpura",
"Lajpat Nagar",
"Moolchand",
"Kailash Colony",
"Nehru Place",
"Kalkaji Mandir",
"Govind Puri",
"Harkesh Nagar Okhla",
"Jasola-Apollo",
"Sarita Vihar",
"Mohan Estate",
"Tughlakabad Station",
"Badarpur Border",
"Sarai",
"NHPC Chowk",
"Mewala Maharajpur",
"Sector-28",
"Badkal Mor",
"Old Faridabad",
"Neelam Chowk Ajronda",
"Bata Chowk",
"Escorts Mujesar",
"Sant Surdas (Sihi)",
"Raja Nahar Singh"
};

static   String []redLineStation={
"Shaheed Sthal", "Hindon", "Arthala", "Mohan Nagar", "Shyam Park" ,"Major Mohit Sharma", "Raj Bagh" ,
"Shahid Nagar",
"Dilshad Garden",
"Jhilmil",
"Mansrover park",
"Shahdara",
"Welcome",
"Seelam Pur",
"Shastri Park",
"Kashmere Gate",
"Tis Hazari",
"Pul Bangash",
"Pratap Nagar",
"Shastri Nagar",
"Inderlok",
"Kanhaiya Nagar",
"Keshav Puram",
"Netaji Subash Place",
"Kohat Enclave",
"Pitampura",
"Rohini East",
"Rohini West",
"Rithala"
};

static   String []greenLineStation={
"Inderlok",
"Ashok Park Main",
"Punjabi Bagh",
"Shivaji Park",
"Madipur",
"Paschim Vihar (East)",
"Paschim Vihar (West)",
"Peera Garhi",
"Udyog Nagar",
"Maharaja Surajmal Stadium",
"Nangloi",
"Nangloi Railway Station",
"Rajdhani Park",
"Mundka",
"Mundka Industrial Area (M.I.A)",
"Ghevra Metro station",
"Tikri Kalan",
"Tikri Border",
"Pandit Shree Ram Sharma",
"Bahadurgarh City",
"Brigadier Hoshiyar Singh",
"Ashok Park Main",
"Satguru Ram Singh Marg",
"Kirti Nagar"
};

static  String []orangeLineStation={
"Dwarka Sector - 21",
"IGI Airport",
"Delhi Aerocity",
"Dhaula Kuan",
"Shivaji Stadium",
"New Delhi"
};

static  String []pinkLineStation={
"Majlis Park",
"Azadpur",
"Shalimar Bagh",
"Netaji Subash Place",
"Shakurpur",
"Punjabi Bagh West",
"ESI Hospital",
"Rajouri Garden",
"Mayapuri",
"Naraina Vihar",
"Delhi Cantonment",
"Durgabai Deshmukh South Campus",
"Sir Vishweshwaraiah Moti Bagh",
"Bhikaji Cama Place",
"Sarojini Nagar",
"INA",
"South Extension",
"Lajpat Nagar",
"Vinobapuri",
"Ashram",
"Hazrat Nizamuddin",
"Mayur Vihar-I",
"Mayur Vihar Pocket 1",
"Trilokpuri Sanjay Lake",
"East Vinod Nagar - Mayur Vihar-II",
"Mandawali - West Vinod Nagar",
"IP Extension",
"Anand Vihar",
"Karkarduma",
"Karkarduma Court",
"Krishna Nagar",
"East Azad Nagar",
"Welcome",
"Jafrabad",
"Maujpur - Babarpur",
"Gokulpuri",
"Johri Enclave",
"Shiv Vihar"
};

static String []magentaLineStation={
"Botanical Garden",
"Okhla Bird Sanctuary",
"Kalindi Kunj",
"Jasola Vihar Shaheen Bagh",
"Okhla Vihar",
"Jamia Millia Islamia",
"Sukhdev Vihar",
"NSIC Okhla",
"Kalkaji Mandir",
"Nehru Enclave",
"Greater Kailash",
"Chirag Delhi",
"Panchsheel Park",
"Hauz Khas",
"I.I.T",
"R.K.Puram",
"Munirka",
"Vasant Vihar",
"Shankar Vihar",
"Terminal 1- IGI Airport",
"Sadar Bazar Contonment",
"Palam",
"Dashrath Puri",
"Dabri Mor - Janakpuri South",
"Janak Puri West"
};
    public static class Pair 
    {
        String curr;
        String Transport;
        Integer metroLine;
        Integer busRouteNo;
        int dist;
        int stations;
        int Stops;
        int time;
        String parent;
        Pair(Pair obj)
        {
            this.curr=obj.curr;
            this.Transport=obj.Transport;
            this.metroLine=obj.metroLine;
            this.busRouteNo=obj.busRouteNo;
            this.dist=obj.dist;
            // this.price=obj.price;
            this.Stops=obj.Stops;
            this.parent=obj.parent;
            this.time=obj.time;
        }
        public Pair(String src,String parent,String Transport,Integer metroLine,Integer busRouteNo,int dist,int Stops,int time,int stations)
        {
            this.curr=src;
            this.Transport=Transport;
            this.metroLine=metroLine;
            this.busRouteNo=busRouteNo;
            this.dist=dist;
            // this.price=price;
            this.Stops=Stops;
            this.parent=parent;
            this.time=time;
            this.stations=stations;
        }
        // public int compareTo(Pair other){
        //     return (this.dist-other.dist);
        // }
 }
static Pair One;
static Pair Two;
   public static class Graph{
    class distanceComparator implements Comparator<Pair>{
        public int compare(Pair o1,Pair o2)
        {
            return o1.dist-o2.dist;
        }
         }
         class stopsComparator implements Comparator<Pair>{
            public int compare(Pair o1,Pair o2)
            {
                return o1.Stops-o2.Stops;
            }
             }
      static  HashMap<String,ArrayList<Pair>> adj;
        public Graph()
        {
            adj=new HashMap<>();
        }
        public void addEdge(String src,Pair obj)
        {
             Pair dest=new Pair(obj);
             dest.curr=src;
             if(adj.containsKey(src)==false)
             adj.put(src,new ArrayList<>());
            adj.get(src).add(obj);
            if(adj.containsKey(obj.curr)==false)
             adj.put(obj.curr,new ArrayList<>());
            adj.get(obj.curr).add(dest);
        }
        public void printData(){
            // for(String stop:adj.keySet())
            {
                String stop="Ashok Park Main";
               for(Pair obj:adj.get(stop))
System.out.println("curr-"+stop+" Dest-"+obj.curr+" Transport-"+obj.Transport+" MetroRouteLine-"+obj.metroLine+" distance-"+obj.dist+" Stops-"+obj.Stops);
            }
        }
    class Route{
        String stop;
        int metroLine;
        int noOfStops;
        Route(String stop,int metroLine,int noOfStops)
        {
            this.stop=stop;
            this.metroLine=metroLine;
            this.noOfStops=noOfStops;
        }
    }
    public String findLineColor(int index)
    {
        
        switch(index)
        {
            case 1:return "Red Line";
            case 2:return "Yellow Line";
             case 3:return "Blue Line";
             case 4:return "Green Line";
           case 5:return "Violet Line";
           case 6:return "Orange Line";
             case 7:return "Pink Line";
            case 8:return "Magenta Line";
           default:return "invalid"; 
        }
    }
        /**
         * @param src
         * @param dest
         */
     
  public  ArrayList<ArrayList<String>> ShortestPath(String src,String dest)
        {
            boolean flag=false;
       HashMap<String,Route>parent=new HashMap<>();
       HashSet<String> vis=new HashSet<>();
       for(String stop:adj.keySet()){
       parent.put(stop,null);
    //    parent.put(stop,null);
       }
       Custom.PriorityQueue<Pair> pq=new Custom.PriorityQueue<>(new distanceComparator());
pq.add(new Pair(src,"-","Metro",-1,null,0,0,0,0));
while(pq.size()>0)
{
    Pair obj=pq.remove();
    if(vis.contains(obj.curr)==true) continue;
  //  System.out.println("stop-> "+obj.curr+" and parent is "+obj.parent);
    vis.add(obj.curr);
    parent.put(obj.curr,new Route(obj.parent,obj.metroLine,obj.Stops));
    if(obj.curr.equals(dest)==true)
    {
        flag=true;
       One=obj;
  
    }
    for(Pair nbr:adj.get(obj.curr))
    {
        if(nbr==null) continue;
        if(obj.metroLine==nbr.metroLine)
        pq.add(new Pair(nbr.curr,obj.curr,"Metro",nbr.metroLine,null,obj.dist+nbr.dist,obj.Stops,obj.time+nbr.time,obj.stations+1));
        else
        pq.add(new Pair(nbr.curr,obj.curr,"Metro",nbr.metroLine,null,obj.dist+nbr.dist,obj.Stops+1,obj.time+nbr.time,obj.stations+1));
    }


}
if(flag==false) return new ArrayList<>();
return printPath(parent,dest,src);
}

 public  ArrayList<ArrayList<String>> ShortestPath2(String src,String dest)
 {
    boolean flag=false;
HashMap<String,Route>parent=new HashMap<>();
HashMap<String,ArrayList<Integer>> vis=new HashMap<>();
for(String stop:adj.keySet()){
parent.put(stop,null);
   vis.put(stop,new ArrayList<>());
}
Custom.PriorityQueue<Pair> pq=new Custom.PriorityQueue<>(new stopsComparator());
pq.add(new Pair(src,"-","Metro",-1,null,0,0,0,0));
while(pq.size()>0)
{
Pair obj=pq.remove();
if(vis.get(obj.curr).contains(obj.metroLine)==true) continue;
//  System.out.println("stop-> "+obj.curr+" and parent is "+obj.parent);
vis.get(obj.curr).add(obj.metroLine);
if(parent.get(obj.curr)==null||parent.get(obj.curr).noOfStops>obj.Stops)
parent.put(obj.curr,new Route(obj.parent,obj.metroLine,obj.Stops));
if(obj.curr.equals(dest)==true)
{
    Two=obj;
    flag=true;

}
for(Pair nbr:adj.get(obj.curr))
{
    if(nbr==null)continue;
    if(obj.metroLine==nbr.metroLine)
       pq.add(new Pair(nbr.curr,obj.curr,"Metro",nbr.metroLine,null,obj.dist+nbr.dist,obj.Stops,obj.time+nbr.time,obj.stations+1));
       else
       pq.add(new Pair(nbr.curr,obj.curr,"Metro",nbr.metroLine,null,obj.dist+nbr.dist,obj.Stops+1,obj.time+nbr.time,obj.stations+1));
}


}
if(flag==false)return new ArrayList<>();
return printPath(parent,dest,src);
}


public  ArrayList<ArrayList<String>>  printPath(HashMap<String,Route>parent,String dest,String src){
    ArrayList<ArrayList<String>> path=new ArrayList<>();
    ArrayList<String> subpath=new ArrayList<>();
        Route Stop=parent.get(dest);
       int prev=Stop.metroLine;
        
        subpath.add(dest);
        
        dest=Stop.stop;
    while(dest.equals(src)==false)
    {
        Route Stopover=parent.get(dest);
        if(Stopover.metroLine!=prev)
        {
            subpath.add(dest);
            String lineColor=findLineColor(prev);
        subpath.add(lineColor);
        Collections.reverse(subpath);
            path.add(subpath);
            subpath=new ArrayList<>();
            // subpath.add(findLineColor(Stopover.metroLine));
        }
        subpath.add(dest);
         prev=Stopover.metroLine;
        dest=Stopover.stop;
        
    }
    if(subpath.size()!=0)
    {
        subpath.add(src);
        String lineColor=findLineColor(prev);
        subpath.add(lineColor);
        Collections.reverse(subpath);
    path.add(subpath);
    }
    Collections.reverse(path);
    return path;
    // for(int i=0;i<path.size();i++)
    // {
    //  ArrayList<String> Obj=path.get(i);
    //         // Collections.reverse(Obj);
    //         if(i!=path.size()-1)
    //         Obj.add("change");
    //         System.out.println(Obj);
    // }
 }

 public  void createGraph(Graph g)
    {
        

   magentaLineStation= Arrays.asList(magentaLineStation).stream().map(String::toUpperCase).toArray(String[]::new);
pinkLineStation= Arrays.asList(pinkLineStation).stream().map(String::toUpperCase).toArray(String[]::new);  
orangeLineStation= Arrays.asList(orangeLineStation).stream().map(String::toUpperCase).toArray(String[]::new);
greenLineStation= Arrays.asList(greenLineStation).stream().map(String::toUpperCase).toArray(String[]::new);
redLineStation= Arrays.asList(redLineStation).stream().map(String::toUpperCase).toArray(String[]::new);
violetLineStation= Arrays.asList(violetLineStation).stream().map(String::toUpperCase).toArray(String[]::new);
blueLineStation= Arrays.asList(blueLineStation).stream().map(String::toUpperCase).toArray(String[]::new);
yellowLineStation= Arrays.asList(yellowLineStation).stream().map(String::toUpperCase).toArray(String[]::new);
  for(int i=0;i<redLineStation.length-1;i++)
       {
        g.addEdge(redLineStation[i], new Pair(redLineStation[i+1],redLineStation[i],"METRO",1,null,2,0,100,0));
       }
       for(int i=0;i<yellowLineStation.length-1;i++)
       {
        g.addEdge(yellowLineStation[i], new Pair(yellowLineStation[i+1],yellowLineStation[i],"METRO",2,null,2,0,100,0));
       }
    for(int i=0;i<blueLineStation.length-1;i++) 
       {
        if(i==49)continue;
        g.addEdge(blueLineStation[i], new Pair(blueLineStation[i+1],blueLineStation[i],"METRO",3,null,2,0,100,0));
       }
       for(int i=0;i<greenLineStation.length-1;i++)
       {
        if(i==20) continue;
        g.addEdge(greenLineStation[i], new Pair(greenLineStation[i+1],greenLineStation[i],"METRO",4,null,2,0,100,0));
       }
       for(int i=0;i<violetLineStation.length-1;i++)
       {
        g.addEdge(violetLineStation[i], new Pair(violetLineStation[i+1],violetLineStation[i],"METRO",5,null,2,0,100,0));
       }
       for(int i=0;i<orangeLineStation.length-1;i++)
       {
        g.addEdge(orangeLineStation[i], new Pair(orangeLineStation[i+1],orangeLineStation[i],"METRO",6,null,2,0,100,0));
       }
       for(int i=0;i<pinkLineStation.length-1;i++)
       {
        g.addEdge(pinkLineStation[i], new Pair(pinkLineStation[i+1],pinkLineStation[i],"METRO",7,null,2,0,100,0));
       }
       for(int i=0;i<magentaLineStation.length-1;i++)
       {
        g.addEdge(magentaLineStation[i], new Pair(magentaLineStation[i+1],magentaLineStation[i],"METRO",8,null,2,0,100,0));
       }
      
       blueline=new HashSet<>();
       for(int i=0;i<58;i++)
       {
           blueline.add(blueLineStation[i].toUpperCase());
       }
   
       
         yellowline=new HashSet<>();
       for(int i=0;i<37;i++)
       {
           yellowline.add(yellowLineStation[i].toUpperCase());
       }
   
         violetline=new HashSet<>();
       for(int i=0;i<34;i++)
       {
           violetline.add(violetLineStation[i].toUpperCase());
       }
   
     redline=new HashSet<>();
       for(int i=0;i<29;i++)
       {
           redline.add(redLineStation[i].toUpperCase());
       }
   
     greenline= new HashSet<>();
       for(int i=0;i<24;i++)
       {
           greenline.add( greenLineStation[i].toUpperCase());
       }
   
    orangeline= new HashSet<>();
       for(int i=0;i<6;i++)
       {
           orangeline.add(orangeLineStation[i].toUpperCase());
   
       }
   
 pinkline = new HashSet<>();
       for(int i=0;i<38;i++)
       {
           pinkline.add(pinkLineStation[i].toUpperCase());
   
       }
   
 magentaline=new HashSet<>();
       for(int i=0;i<25;i++)
       {
           magentaline.add(magentaLineStation[i].toUpperCase());
   
        }

    } 
}
public static boolean check(String str)
{
    boolean flag=false;
    if(blueline.contains(str)!=false){
        flag=true;
    }
     else if(redline.contains(str)!=false){
        flag=true;
    }else  if(yellowline.contains(str)!=false){
        flag=true;
    }else  if(greenline.contains(str)!=false){
        flag=true;
    } else if(pinkline.contains(str)!=false){
        flag=true;
    } else if(magentaline.contains(str)!=false){
        flag=true;
    } else if(violetline.contains(str)!=false){
        flag=true;
    }
    else if(orangeline.contains(str)!=false){
        flag=true;
    }
    return flag;
}
public static int findPrice(int distance)
{
     if(distance>0&&distance<=2)return 10;
    else if(distance>2&&distance<=5) return 20;
    else if(distance>5&&distance<=12) return 30;
    else if(distance>12&&distance<=21) return 40;
    else if(distance>21&&distance<=32) return 50;
    else if(distance>32) return 60;
    return 0;
}
public static void run(String src,String dest)
{
    src=src.trim().toUpperCase();
    dest=dest.trim().toUpperCase();
    Graph g=new Graph();
    g.createGraph(g);
    boolean Src=check(src);
    boolean Dest=check(dest);
    if(Src==false&&Dest==false)
   { System.out.println("  Invalid Start & Destination Station");
   return ;}
    if(Src==false){
    System.out.println("  Invalid Start Station");
    return ;
    }
    if(Dest==false)
    {
    System.out.println("  Invalid Destination Station");
    return ;
    }
    g.ShortestPath(src, dest);
    ArrayList<ArrayList<String>>  path;
    //write code here

ArrayList<ArrayList<String>>shortestPath2=g.ShortestPath2(src.toUpperCase(), dest.toUpperCase());
ArrayList<ArrayList<String>>shortestPath=g.ShortestPath(src.toUpperCase(), dest.toUpperCase());
if(shortestPath.size()==0&&shortestPath2.size()==0)
{
    System.out.println("  Not able to respond Now");
    return ;
}
if(shortestPath.size()<shortestPath2.size())
{
    // System.out.println("  Stations -> "+One.stations);
 int price=findPrice(One.dist);
 System.out.println("  Fair(in Rs) -> "+price);

  System.out.println("  total changes of Lines-> "+One.Stops);
 int time=One.time;
 int hr=time/3600;
 int min=(time/60)%60;
 int sec=(time)%60;
 if(hr>0)
 System.out.println("  Time -> "+hr+" hour "+min+" mins "+sec+" sec ");
 else
 System.out.println("  Time -> "+min+" mins "+sec+" sec "); 
path=shortestPath;
}else
{
    // System.out.println("  Stations -> "+Two.stations);
    int price=findPrice(Two.dist);
    System.out.println("  Fair(in Rs) -> "+price);
   
     System.out.println("  total changes of Lines-> "+Two.Stops);
    int time=Two.time;
    int hr=time/3600;
    int min=(time/60)%60;
    int sec=(time)%60;
    if(hr>0)
    System.out.println("  Time -> "+hr+" hour "+min+" mins "+sec+" sec ");
    else
    System.out.println("  Time -> "+min+" mins "+sec+" sec "); 
path=shortestPath2;
}

 
for(int i=0;i<path.size();i++)
{
ArrayList<String> Obj=path.get(i);
     // Collections.reverse(Obj);
     if(i!=path.size()-1)
     Obj.add("change");
     System.out.println("  "+Obj);
}

}

public static void printLine(int idx)
{
    if(idx==1)
    {
        for(int i=0;i<redLineStation.length;i++)
        System.out.println("  "+(i+1)+". "+redLineStation[i]+" .");
    }
    else if(idx==2)
    {
        for(int i=0;i<yellowLineStation.length;i++)
        System.out.println("  "+(i+1)+". "+yellowLineStation[i]+" .");
    }
    else if(idx==3)
    {
        for(int i=0;i<blueLineStation.length;i++)
        System.out.println("  "+(i+1)+". "+blueLineStation[i]+" .");
    }
    else if(idx==4)
    {
        for(int i=0;i<greenLineStation.length;i++)
        System.out.println("  "+(i+1)+". "+greenLineStation[i]+" .");
    }
    else if(idx==5)
    {
        for(int i=0;i<violetLineStation.length;i++)
        System.out.println("  "+(i+1)+". "+violetLineStation[i]+" .");
    }
    else if(idx==6)
    {
        for(int i=0;i<orangeLineStation.length;i++)
        System.out.println("  "+(i+1)+". "+orangeLineStation[i]+" .");
    }
    else if(idx==7)
    {
        for(int i=0;i<pinkLineStation.length;i++)
        System.out.println("  "+(i+1)+". "+pinkLineStation[i]+" .");
    }
    else if(idx==8)
    {
        for(int i=0;i<magentaLineStation.length;i++)
        System.out.println("  "+(i+1)+". "+magentaLineStation[i]+" .");
    }
    
}
public static void pathThroughIndex(int firstMetroLine,int i,int secondMetroLine,int j)
{
String []firstArr=null;
if(firstMetroLine==1)
firstArr=redLineStation;
else if(firstMetroLine==2)
firstArr=yellowLineStation;
else if(firstMetroLine==3)
firstArr=blueLineStation;
else if(firstMetroLine==4)
firstArr=greenLineStation;
else if(firstMetroLine==5)
firstArr=violetLineStation;
else if(firstMetroLine==6)
firstArr=orangeLineStation;
else if(firstMetroLine==7)
firstArr=pinkLineStation;
else if(firstMetroLine==8)
firstArr=magentaLineStation;
String []secondArr=null;
if(secondMetroLine==1)
secondArr=redLineStation;
else if(secondMetroLine==2)
secondArr=yellowLineStation;
else if(secondMetroLine==3)
secondArr=blueLineStation;
else if(secondMetroLine==4)
secondArr=greenLineStation;
else if(secondMetroLine==5)
secondArr=violetLineStation;
else if(secondMetroLine==6)
secondArr=orangeLineStation;
else if(secondMetroLine==7)
secondArr=pinkLineStation;
else if(secondMetroLine==8)
secondArr=magentaLineStation;
if(firstArr==null||secondArr==null){
System.out.println("  Invalid Choice");
return; }
run(firstArr[i],secondArr[j]);
}
    public static void main(String args[]){
        // System.out.println("hello");
        //write code here
        run("LAXMI NAGAR","Rithala");
//  pathThroughIndex(3, 0, 7, 5);
// printLine(1);

 }
}




