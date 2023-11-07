package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Itinerary {
  
	  public static void main(String[] args)
	  {
	          HashMap<String,String> dataset = new HashMap<>();
	          dataset.put("Chennai", "Banglore");
	          dataset.put("Goa", "Chennai");
	          dataset.put("Delhi", "Goa");
	          dataset.put("Bombay", "Delhi");
	        
	          iter(dataset);
	  }

	  static void iter(Map <String,String> dataset)
	  {String start = null;

	          HashMap<String, String> rev = new HashMap<>();
	          for(Map.Entry<String, String> entry : dataset.entrySet())
	  {
	  rev.put(entry.getValue(), entry.getKey());
	  }

	   
	  for(Map.Entry<String,String> entry : dataset.entrySet())
	  {
	     if(!rev.containsKey(entry.getKey()))
	  {
	  start = entry.getKey();
	  break;
	  }
	  }

	  if(start == null)
	  return;
	  String to = dataset.get(start);


	  while( to != null)
	  {

	  System.out.println( start +"->"+ to+ " , ");
	   start = to;
	  to = dataset.get(to);}



	  }
	  }
	  