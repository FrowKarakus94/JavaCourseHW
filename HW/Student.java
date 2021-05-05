package Odev2;

public class Student extends User{
   String instructor;
   String course;
   
 
   public String getInstructor() {
	   return instructor;
   }
   public String getCourse() {
	   return course;
   }
   public void setInstructor(String instructor) {
	   this.instructor = instructor;
   }
   public void setCourse(String course) {
	   this.course = course;
   }
}
