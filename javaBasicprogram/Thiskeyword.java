package javaBasicprogram;
class Rectangle
{
    int length;
    int breadth;
    
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
      //  System.out.println("length is :"+this.length);
       // System.out.println("breadth is :" +this.breadth);
    }
     void display()
    {
        System.out.println("length is :"+this.length);
        System.out.println("breadth is :" +this.breadth);
    }

    
}


public class Thiskeyword {
    public static void main(String[] args)
    {
    Rectangle r1=new  Rectangle(10,5);
    r1.display();
 //  System.out.println(r1.display());
    
    }
   
    
}

