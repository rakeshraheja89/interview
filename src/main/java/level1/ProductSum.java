package level1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ProductSum {

    public static void main(String arr[]) {
        //Scanner in = new Scanner(System.in);
        List<Object> array = new ArrayList<Object>();
        array.add(5);
        array.add(2);
        array.add(new Object[]{7,-1});
        array.add(3);
        array.add(new Object[]{6,new int[]{13,-8}});
        array.add(4);
        System.out.println(array.toString());
        System.out.println(productSum(array));
    }

    public static int productSum(List<Object> array) {
        // Write your code here.
        int sum=0;
        for (Object object : array)
        {
            if(object instanceof Array)
            {
                productSum((List<Object>) object);
            }
			else
            {
                sum=sum+Integer.parseInt(object.toString());
            }
        }
        return sum;
    }
}
