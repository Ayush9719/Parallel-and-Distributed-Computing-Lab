/*MyClient.java*/
import java.rmi.*;  
public class MyClient{  
public static void main(String args[]){  
try{  
Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/adder");  
System.out.println("001 Ayush Sharma 5000");
System.out.println("002 Sanchay Gupta 20000");
System.out.println("003 Dhruv Dixit 1000");
}catch(Exception e){}  
}
}
