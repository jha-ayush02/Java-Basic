package College;

import java.util.HashMap;

public class MajorityElementInArray
{
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n= 10;
        int p=0;
        int a[]={1,1,2,1,4,1,1,7,1,8};
        for(int i:a)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int s=n/2;

        for(int i:a)
        {
            int k=map.get(i);
            if(k>=s)
            {
                System.out.println("The repeating element is: "+i);
                break;
            }
        }

    }
}
