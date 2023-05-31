import java.util.Scanner;

class xyloemorpholem
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        int Fl=0;
        int MN=0;
        Fl=n%10;
        n/=10;
        while(n>10)
        {
            int rem=n%10;
            MN=MN+rem;
            n/=10;
        }
        Fl=Fl+n;
        if(Fl==MN)
        {
            System.out.println("xyloem");
        }
        else 
        {
            System.out.println("pholem");

        }
        }
    }
    
