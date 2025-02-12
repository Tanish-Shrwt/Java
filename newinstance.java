public class newinstance {
    public static void main(String[] args) {
        try {
            // Creating an obj of the outer class NewInstanceObj
            newinstance outerClass = new newinstance();
            Class<?> c = Class.forName("newinstance$Student");


            Student s = (Student) c.getDeclaredConstructor(newinstance.class).newInstance(outerClass);

            
            s.name = "Tanish";
            s.roll_no = 55;

           
            System.out.println("Student Details: ");
            s.display();

        } 
        catch (Exception e)
         {
            e.printStackTrace();
        }
    }
    class Student
     {
        String name;
        int roll_no;

        //methodd
        void display() {
            System.out.println("Name: " + name);
            System.out.println("RollNo: " + roll_no);
        }
    }
}


