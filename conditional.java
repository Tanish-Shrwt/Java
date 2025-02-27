import java.util.*;
public class conditional {
    public static void main(String[] args) {
        System.out.println("enter the marks");
        Scanner src = new Scanner(System.in);


    int marks= src.nextInt();

        if(marks > 100) { System.out.println("kam ker apna");}

       else if(marks==100){System.out.println("topper");}
    
    else if(marks>=90){System.out.println("bdiya number hai");}

    else if(marks>=33){System.out.println("average and pass");}
    else {System.out.println("fail pdhle kuch nhi dhra inn chejo mai");
 }
    }
}
