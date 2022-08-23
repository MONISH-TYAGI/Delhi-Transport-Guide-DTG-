package Bus;
import java.util.*;


public class Bus extends buses{
    static HashMap<String,String[]> obj;
  
    public static class Pair 
    {
        String curr;
        String Transport;
        Integer metroLine;
        String busRouteNo;
        int dist;
        // int price;
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
        public Pair(String src,String parent,String Transport,Integer metroLine,String busRouteNo,int dist,int Stops,int time)
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
        }
        // public int compareTo(Pair other){
        //     return (this.dist-other.dist);
        // }
 }

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
        public static void addEdge(String src,Pair obj)
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
        String busRouteNo;
        int noOfStops;
        Route(String stop,String busRouteNo,int noOfStops)
        {
            this.stop=stop;
            this.busRouteNo=busRouteNo;
            this.noOfStops=noOfStops;
        }
    }
    public String findLineColor(String index)
    {
        return (""+index+"");
   
    }
        /**
         * @param src
         * @param dest
         */
        public int findPrice(int distance)
        {
             if(distance>0&&distance<=4)return 10;
            else if(distance>4&&distance<=8) return 15;
            else if(distance>8&&distance<=12) return 20;
            else if(distance>12) return 25;
            return 0;
        }


 public  ArrayList<ArrayList<String>> ShortestPath2(String src,String dest)
 {
    src=src.toUpperCase();
    dest=dest.toUpperCase();
    boolean flag=false;
HashMap<String,Route>parent=new HashMap<>();
HashMap<String,ArrayList<String>> vis=new HashMap<>();
for(String stop:adj.keySet()){
parent.put(stop,null);
   vis.put(stop,new ArrayList<>());
}
PriorityQueue<Pair> pq=new PriorityQueue<>(new stopsComparator());
pq.add(new Pair(src,"-","Metro",-1,"#",0,0,0));
while(pq.size()>0)
{
Pair obj=pq.remove();
if(vis.get(obj.curr).contains(obj.busRouteNo)==true) continue;

vis.get(obj.curr).add(obj.busRouteNo);
if(parent.get(obj.curr)==null||parent.get(obj.curr).noOfStops>obj.Stops)
parent.put(obj.curr,new Route(obj.parent,obj.busRouteNo,obj.Stops));
if(obj.curr.equals(dest)==true)
{
    flag=true;

 break;
}
for(Pair nbr:adj.get(obj.curr))
{
    if(nbr==null)continue;
    if(obj.busRouteNo.equals(nbr.busRouteNo)==true)
       pq.add(new Pair(nbr.curr,obj.curr,"Metro",nbr.metroLine,nbr.busRouteNo,obj.dist+nbr.dist,obj.Stops,obj.time+nbr.time));
       else
       pq.add(new Pair(nbr.curr,obj.curr,"Metro",nbr.metroLine,nbr.busRouteNo,obj.dist+nbr.dist,obj.Stops+1,obj.time+nbr.time));
}


}

if(flag==false)
{
    
    return new ArrayList<>();
}
return printPath(parent,dest,src);
}


public ArrayList<ArrayList<String>> printPath(HashMap<String,Route>parent,String dest,String src){
    ArrayList<ArrayList<String>> path=new ArrayList<>();
    ArrayList<String> subpath=new ArrayList<>();
        Route Stop=parent.get(dest);
       String prev=Stop.busRouteNo;
        
        subpath.add(dest);
        
        dest=Stop.stop;
    while(dest.equals(src)==false)
    {
        Route Stopover=parent.get(dest);
        if(Stopover.busRouteNo.equals(prev)==false)
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
         prev=Stopover.busRouteNo;
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

 }
 
 /**
 * @param g
 */
public  static void createGraph()
    {
        obj=new HashMap<>();
        sevenThree= Arrays.asList(sevenThree).stream().map(String::toUpperCase).toArray(String[]::new);  
      oneOneFourPlusNineNineZero= Arrays.asList(oneOneFourPlusNineNineZero).stream().map(String::toUpperCase).toArray(String[]::new);  
        threeFiveOne= Arrays.asList(threeFiveOne).stream().map(String::toUpperCase).toArray(String[]::new); 
        NineFourThree= Arrays.asList(NineFourThree).stream().map(String::toUpperCase).toArray(String[]::new); 
        obj.put("73",sevenThree);
        obj.put("114+990E",oneOneFourPlusNineNineZero);
        obj.put("351",threeFiveOne);
        obj.put("943",NineFourThree);  
                        for(int i=0;i<sevenThree.length-1;i++)
  {
    addEdge(sevenThree[i],new Pair(sevenThree[i+1],sevenThree[i],"BUS",null,"73",1,0,120));
  }
  for(int i=0;i<oneOneFourPlusNineNineZero.length-1;i++)
  {
    addEdge(oneOneFourPlusNineNineZero[i],new Pair(oneOneFourPlusNineNineZero[i+1],oneOneFourPlusNineNineZero[i],"BUS",null,"114+990E",1,0,120));
  }
  for(int i=0;i<threeFiveOne.length-1;i++)
  {
    addEdge(threeFiveOne[i],new Pair(threeFiveOne[i+1],threeFiveOne[i],"BUS",null,"351",1,0,120));
  }
  for(int i=0;i<NineFourThree.length-1;i++)
  {
addEdge(NineFourThree[i],new Pair(NineFourThree[i+1],NineFourThree[i],"BUS",null,"943",1,0,120));
  }



    } 
    public  ArrayList<ArrayList<String>> ShortestPath(String src,String dest)
    {
        src=src.toUpperCase();
    dest=dest.toUpperCase();
        boolean flag=false;
        HashMap<String,Route>parent=new HashMap<>();
        HashMap<String,ArrayList<String>> vis=new HashMap<>();
        for(String stop:adj.keySet()){
        parent.put(stop,null);
           vis.put(stop,new ArrayList<>());
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>(new distanceComparator());
        pq.add(new Pair(src,"-","Metro",-1,"#",0,0,0));
        while(pq.size()>0)
        {
        Pair obj=pq.remove();
        if(vis.get(obj.curr).contains(obj.busRouteNo)==true) continue;
        //  System.out.println("stop-> "+obj.curr+" and parent is "+obj.parent);
        vis.get(obj.curr).add(obj.busRouteNo);
        if(parent.get(obj.curr)==null||parent.get(obj.curr).noOfStops>obj.Stops)
        parent.put(obj.curr,new Route(obj.parent,obj.busRouteNo,obj.Stops));
        if(obj.curr.equals(dest)==true)
        {
   
        flag=true;
         break;
        }
        for(Pair nbr:adj.get(obj.curr))
        {
            if(nbr!=null&&obj.busRouteNo.equals(nbr.busRouteNo)==true)
               pq.add(new Pair(nbr.curr,obj.curr,"Metro",nbr.metroLine,nbr.busRouteNo,obj.dist+nbr.dist,obj.Stops,obj.time+nbr.time));
               else
               pq.add(new Pair(nbr.curr,obj.curr,"Metro",nbr.metroLine,nbr.busRouteNo,obj.dist+nbr.dist,obj.Stops+1,obj.time+nbr.time));
        }
        }
        if(flag==false)
{
   
    return new ArrayList<>();
}
return printPath(parent,dest,src);
}
public void run(String src,String dest)
{
    ArrayList<ArrayList<String>>  path;
    //write code here
src=src.trim().toUpperCase();
dest=dest.trim().toUpperCase();
// ArrayList<ArrayList<String>>shortestPath2=ShortestPath2(threeFiveOne[3], NineFourThree[0]);
// ArrayList<ArrayList<String>>shortestPath=ShortestPath(threeFiveOne[3], NineFourThree[0]);
ArrayList<ArrayList<String>>shortestPath2=ShortestPath2(src,dest);
ArrayList<ArrayList<String>>shortestPath=ShortestPath2(src,dest);
if(shortestPath.size()==0&&shortestPath2.size()==0)
{
    System.out.println("  Not able to respond Now");
    return ;
}
if(shortestPath.size()<shortestPath2.size())
{
path=shortestPath;
}else
{
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
public static void printLine(String str){
    createGraph();
if(obj.containsKey(str)==true)
{
    String []arr=obj.get(str);
    for(int i=0;i<arr.length;i++)
    {
        System.out.println("  "+(i+1)+" -> "+arr[i]);
    }
}else{
    System.out.println("  Sorry No Data");
}
}

}
public static void main(String args[]){
        // System.out.println("hello");
  Graph g=new Graph();
  g.createGraph();
  if(args.length==1)
   g.printLine(args[0]);
   else
 g.run(args[0],args[1]);


 }
 
}





