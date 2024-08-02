import java.util.Scanner;
public class tictactoe
{
    public static void main(String args[])
    {
        String[][] mark = {{"1","2","3"},
                            {"4","5","6"},
                            {"7","8","9"}};
        int i,j;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        String[] marks = {"X","O"};
        boolean flag2 = true;
        String m1,m2;
        do
        {
            System.out.println("Select mark for player 1(X/O): ");
            m1 = sc.nextLine();
            System.out.println("Select mark for player 2(X/O): ");
            m2 = sc.nextLine();
            for(i=0;i<2;i++)
            {
                if(m1.equalsIgnoreCase(marks[i]) == true)
                {
                    m1 = marks[i];
                    flag2 = false;
                }
                else if(m2.equalsIgnoreCase(marks[i]) == true)
                {   
                    m2 = marks[i];
                    flag2 = false;
                }
                else
                {
                    System.out.println("Please select only from 'X' and 'O'");
                    flag2 = true;
                    break;
                }
            }
        }while(flag2 == true);
        String[] m = {m1,m2};

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(mark[i][j]+" | ");
            }
            System.out.println("\n-----------");
        }

        System.out.println("Player 1:" +m1);
        System.out.println("Player 2:" +m2);

        System.out.println("\nInstructions:\n1.Player 1 will start first.\n2.Player 2 second.\n3.Take turns alternatively.");

        int k =0;
        while(flag == false)
        {
            System.out.println("Select mark as per above mentioned numbers: ");
            try
            {
                String n = sc.nextLine();
                if(Integer.parseInt(n) < 1 || Integer.parseInt(n) > 9)
                {
                    System.out.println("Please enter number from 1 to 9");
                    k=k-1;
                    continue;
                }
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        if(n.equals(mark[i][j]))
                        {
                            if(k%2==0)
                            {
                                mark[i][j] = m[0];
                            }
                            else
                            {
                                mark[i][j] = m[1];
                            }
                        }
                        System.out.print(mark[i][j]);
                        System.out.print(" | ");
                    }
                    System.out.println("\n---------- ");
                }   
                for(i=0;i<3;i++)
                {
                    for(int l=0;l<2;l++)
                    {
                        if((((mark[i][0]).equals(m[l])) && ((mark[i][1]).equals(m[l])) && ((mark[i][2]).equals(m[l])))||(((mark[0][i]).equals(m[l])) && ((mark[1][i]).equals(m[l])) && ((mark[2][i]).equals(m[l]))) || (((mark[0][0]).equals(m[l])) && ((mark[1][1]).equals(m[l])) && ((mark[2][2]).equals(m[l])))||(((mark[0][2]).equals(m[l])) && ((mark[1][1]).equals(m[l])) && ((mark[2][0]).equals(m[l]))))
                        {
                            System.out.println("Player "+(l+1)+" ("+m[l]+") wins!");
                            i=3;
                            k=9;
                            flag = true;
                            break;
                        }
                    }
                }
                if(k==8 && flag == false)
                {
                    System.out.println("It's a tie!");
                }
                k++;
            }           
            
            catch(Exception e)
            {
                System.out.println("Error: " +e.getMessage());
                break;
            }
        }
        sc.close();
    }   
}