import java.util.Scanner;
import packs.Coin;
import packs.Players;

public class DriverGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play coin toss game!");
        
        Players p1 = new Players();
        Players p2 = new Players();
        Players p3 = new Players();

        String players[] = {"","",""};
        
        for(int i = 1; i<=3; i++)
        {
            System.out.println("Enter player "+i+" name:");
            players[i-1] = sc.nextLine();
        }

        p1.enterName(players[0]);
        p2.enterName(players[1]);
        p3.enterName(players[2]);
   
        System.out.println("Enter the number of tosses: ");
        int tosses = sc.nextInt();

        Coin c1 = new Coin();
        Coin c2 = new Coin();
        Coin c3 = new Coin();

        int[] count = {0,0,0};

        try {
            int i = 0;
            int j = i;
            while(i<tosses)
            {
                j = i;
                String face1 = c1.getValue();
                String face2 = c2.getValue();
                String face3 = c3.getValue();

                if(face1 == face2 && face2 == face3 && face1 == face3)
                {
                    i = j;
                    continue;
                }
                System.out.print(p1.getName()+":"+face1+" "+p2.getName()+":"+face2+" "+p3.getName()+":"+face3+" ");
                if(face1 != face2 && face1 != face3)
                {
                    System.out.println(p1.getName()+" wins!");
                    count[0]++;
                }
                if(face2 != face1 && face2 != face3)
                {
                    System.out.println(p2.getName()+" wins!");
                    count[1]++;
                }
                if(face3 != face2 && face3 != face1)
                {
                    System.out.println(p3.getName()+" wins!");
                    count[2]++;
                }
                i++;
            }

            System.out.println(p1.getName()+" wins "+count[0]+" times.");
            System.out.println(p2.getName()+" wins "+count[1]+" times.");
            System.out.println(p3.getName()+" wins "+count[2]+" times.");
        
            if(count[0] > count[1] && count[0] > count[2])
            {
                System.out.println(p1.getName()+" wins overall!");
            }
            if(count[1] > count[0] && count[1] > count[2])
            {
                System.out.println(p2.getName()+" wins overall!");
            }
            if(count[2] > count[1] && count[2] > count[0])
            {
                System.out.println(p3.getName()+" wins overall!");
            }
            if((count[0] == count[1]) || (count[1] == count[2]) || (count[2] == count[0]))
            {
                System.out.println("There's one tie!");
            }
            if(count[0] == count[1] && count[0] == count[2])
            {
                System.out.println("There's a tie among all!");
            }
        } 
        catch (Exception e) {
            System.out.println("There's some error! Try again");
        }
        sc.close();
    }    
}
