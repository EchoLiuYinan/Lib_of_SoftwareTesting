package main.money;

import java.util.ArrayList;
import java.util.LinkedHashMap;


public class MoneyCalculateUtil {
    public LinkedHashMap<Integer , Integer> pocket = new LinkedHashMap();
    // a map contains all bills and coins
    public ArrayList<Boolean> accessable = new ArrayList<>();
    // an array contains whether we can take out the money equals the index

    /***
     *  init the pocket
     */
    public void setPocket()
    {
        pocket.put(50,1);
        pocket.put(20,1);
        pocket.put(5,2);
        pocket.put(1,3);
    }

    /***
     * calculate the sum of all bills and coins
     * @return the number of all my money
     */
    public int getSum()
    {
        int sum = 0;
        for (int bill:pocket.keySet()
             ) {
            sum += (bill*pocket.get(bill));
        }
        return  sum;
    }

    /***
     * to init the 'accessable' array
     */
    public void initAccessable()
    {
        accessable.add(0,true);
        for(int i = 1 ; i <= getSum() ; i++)
        {
            accessable.add( i ,false);
        }
    }

    /***
     * compare if the number is accessable
     */
    public void setAccessable(){
        for (int bill:pocket.keySet())
        {
            for(int j = getSum() ; j >= 0; j--)
            {
                for(int k = 0 ; k <= pocket.get(bill);k++)
                {
                    if(j-bill*k >= 0)
                    {
                        if(accessable.get(j-bill*k) && !accessable.get(j))
                        {
                            accessable.set(j,true);
                        }
                    }
                }
            }
        }

    }

    public boolean canTakeOut(int n)
    {
        if(n <0 || n > getSum())
        {
            return false;
        }
        else
        {
            return accessable.get(n);
        }
    }
}
