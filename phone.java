import java.util.Scanner;
class phone
{
    bluetooth b1;
    Scanner sc=new Scanner(System.in);
    public void connectBluetooth()
    {
        if(b1==null)
        {
            System.out.println("enter name of bluetooth");
        String name=sc.next();
        b1=new bluetooth(name);
        System.out.println(" " +"bluetooth connected");
            
        }
        else 
        {
            System.out.println("connection already existed");
        }
    }
    public void removeBluetooth()
    {
        if(b1==null)
        {
            System.out.println("first connect the bluetooth");
        }
        else 
        {
            System.out.println(" removed  bluetooth");
            b1=null;
        }
    }
    public void displayBluetooth()
    {
        if(b1==null)
        {
            System.out.println( "no bluetooth nearby");
        }
        else 
        {
            System.out.println(b1.bname);
        }

    }
}