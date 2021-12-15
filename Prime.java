import java.util.ArrayList;

/**
 * Finds the largest prime number below ten million. 
 *
 * @author (Julia Tran)
 * @version (11/10/2021)
 */
public class Prime
{
    ArrayList<String> n = new ArrayList<String>();

    /**
     * Constructor for objects of class Prime
     */
    public Prime()
    {
        //input should be ten million
        
        for (int i = 0; i < 10000000; i++)
        {
            n.add("true");
        }
        
        for(int i = 0; i < n.size(); i++)
        {
                if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) 
                {
                    n.set(i, "false");
                }
        }
        
        for (int i = n.size()-1; i > 0; i--)
        {
            if (n.get(i) == "true")
            {
                System.out.println("The largest prime below 10000000" + " is " + i);
                break;
            }
            
        }
    }
}