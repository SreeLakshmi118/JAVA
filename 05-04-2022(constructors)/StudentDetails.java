class Student{
	int std_id;
	int m1,m2,m3;
	String std_name;
	Student(){
		std_id =1;
		std_name = "Sree";
		m1 = 89;
		m2 = 49;
		m3 = 39;
    }
	Student( int id,String name,int mark1,int mark2, int mark3){
		std_id=id;
		std_name=name;
		m1=mark1;
		m2=mark2;
		m3=mark3;
	}
	Student(int mark1,int mark2,int mark3){
        std_id=3;
        std_name="Sreekutty";
        m1=mark1;
        m2=mark3;
        m3=mark3;	
	}
      void display(){
		      int sum=m1+m2+m3;
		      double avg=sum/3.0;
		     System.out.println(	"\nStudent Details");
		     System.out.println(	"------------------------");
			 System.out.println(	"Student Id:\t"+std_id);
			 System.out.println(	"Student Name:\t"+std_name);
			 System.out.println(	"Mark 1:\t"  +m1);
			 System.out.println(	"Mark 2:\t"  +m2);
			 System.out.println(	"Mark 3:\t"  +m3);
			 System.out.println(	"Total Marks:\t" +sum);
			 System.out.println(	"Average of Marks:\t" +avg);
			
			
	  }
			
   }
public class StudentDetails{
		public static void main(String args[]){
			Student obj1 = new Student();
			Student obj2 = new Student(2,"lekshmi",22,33,44);	
            Student obj3= new Student(88,99,100);
			
		     obj1.display();
			 obj2.display();
			 obj3.display();
			 
    }
        }