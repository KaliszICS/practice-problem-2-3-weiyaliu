import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

   // function 1 circle area

   //zero
   @Test
   void circleAreaTest1() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }
   
   //positive nummber
   @Test
   void circleAreaTest2() {
      assertEquals (12.566370614359172, PracticeProblem.circleArea(2));
   }

   //negative number
   @Test
   void circleAreaTest3() {
      assertEquals (28.274333882308138, PracticeProblem.circleArea(-3));
   }

   // decimal
   @Test 
   void circleAreaTest4() {
      assertEquals(478.8283183070884, PracticeProblem.circleArea(12.3456789));
   }

   // larrge nummber
   @Test 
   void circleAreaTest5() {
      assertEquals (3.1415926535897934E8, PracticeProblem.circleArea(10000));
   }

   //function 2 converting minutes to hours

   //positive 
   @Test
   void minutesToHoursTest1() {
      assertEquals ("1 hours and 30 minutes", PracticeProblem.minutesToHours(90));
   }

   //zero
    @Test
   void minutesToHoursTest2() {
      assertEquals ("0 hours and 0 minutes",PracticeProblem.minutesToHours(0));
   }

   //small numbers
    @Test
   void minutesToHoursTest3() {
      assertEquals ("0 hours and 30 minutes",PracticeProblem.minutesToHours(30));
   }
   
   // bigg numbers
   @Test
   void minutesToHoursTest4() {
      assertEquals ("166 hours and 40 minutes",PracticeProblem.minutesToHours(10000));
   }

   //odd number 
    @Test
   void minutesToHoursTest5() {
      assertEquals ("2 hours and 3 minutes",PracticeProblem.minutesToHours(123));
   }

   //function 3 calculating simple interest

   // normal numbers 
   @Test
   void simpleInterestTest1() {
      assertEquals (10.0,PracticeProblem.simpleInterest(100, 10, 1));
   }  

   // small number
   @Test
   void simpleInterestTest2() {
      assertEquals (0.06,PracticeProblem.simpleInterest(1, 2, 3));
   }  

   // big numbers
   @Test
   void simpleInterestTest3() {
      assertEquals (1200000.0,PracticeProblem.simpleInterest(10000, 60, 200));
   }  

   // zero years
   @Test
   void simpleInterestTes4() {
      assertEquals (0.0,PracticeProblem.simpleInterest(100, 10, 0));
   }  

   //zero principl
   @Test
   void simpleInterestTest5() {
      assertEquals (0.0,PracticeProblem.simpleInterest(0, 10, 1));
   }  


   //function 4 hypotenuse of a right triangle
   
   // normal normal
   @Test
   void hypotenuseTest1() {
      assertEquals (9.219544457292887,PracticeProblem.hypotenuse(6,7));
   }  

   // small numbers
   @Test
   void hypotenuseTest2() {
      assertEquals (1.118033988749895,PracticeProblem.hypotenuse(0.5,1));
   }  

   //big numbers
   @Test
   void hypotenuseTest3() {
      assertEquals (14088.631800142979,PracticeProblem.hypotenuse(12345,6789));
   }  

   // one side zero
    @Test
   void hypotenuseTest4() {
      assertEquals (8.0,PracticeProblem.hypotenuse(0,8));
   }  

   // both sides zero
   @Test
   void hypotenuseTest5() {
      assertEquals (0.0,PracticeProblem.hypotenuse(0,0));
   }  

}


