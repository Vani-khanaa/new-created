
package fundamentalsosd;


public class Main {

    public static void main(String[] args) 
    {
        NewStudent[] list = new NewStudent[3];        // array of ojects
        // create obj3cts for 3 studentsn and then store and print value....
        NewStudent s1 = new NewStudent();
          NewStudent s2 = new NewStudent();
            NewStudent s3 = new NewStudent();
            
            s1.setName("Vani");
            s1.setAge(18);
            s2.setName("Aarti");
            s2.setAge(28);
             s3.setName("Ananya");
            s3.setAge(8);
            list[0] = s1;
             list[1] = s2;
              list[2] = s3;
        for(int i =0;i<list.length;i++)
        {
            System.out.println(list[i].getName() + "\n"+list[i].getAge());
        }
    }
}
// THIS IS THE ARRAY OF OBJECT WITH THE HELP OF THIS WE HAVE STORED BOTH THE STRING AND INTEGER IN AN ARRAY