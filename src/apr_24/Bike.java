package apr_24;

public class Bike extends Vehicle//Demo1
{ 
public static String start() 
{ 
return "Bike started"; 
} 
public static void main(String[] args) 
{ 
Bike b = new Bike(); 
Vehicle v = new Bike();
System.out.println(b.start()+" "+v.start()); 
} 
} 
class Vehicle//demo2
{ 
public static String start()
{ 
return "vehicle started";   
} 
} 