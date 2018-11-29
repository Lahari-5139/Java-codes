class student
{
    int rollno;
    String name;
    student(int r,String n) // constructor with arguments.....parameterised constructor
    {
        this.rollno = r;
        this.name = n;
    }
}

class main 
{
    public static void main(String args[])
    {
        student s = new student(10,"lahari");
    }    
}