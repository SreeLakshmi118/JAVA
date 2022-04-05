class Veh  
{  
int veh_Id;  
String veh_name;  
 
Veh(int vid, String n)  
{  
veh_Id = vid;  
veh_name = n;  
}  
void display()  
{  
System.out.print("vehicle Id = "+veh_Id + "  " + " vehicle Name = "+veh_name);  
System.out.println();  
}  
}  
public class Vehicle
{  
public static void main(String args[])  
{  
   
Veh[] obj = new Veh[5] ;  
 
obj[0] = new Veh(23907,"Duke250");  
obj[1] = new Veh(91240,"MT-150");  
obj[2] = new Veh(29823,"RTR");  
obj[3] = new Veh(11908,"V3");  
obj[4] = new Veh(43590,"RC200");  
 
System.out.println("vehicle Object 1:");  
obj[0].display();  
System.out.println("vehicle Object 2:");  
obj[1].display();  
System.out.println("vehicle Object 3:");  
obj[2].display();  
System.out.println("vehicle Object 4:");  
obj[3].display();  
System.out.println("vehicle Object 5:");  
obj[4].display();  
}  
}