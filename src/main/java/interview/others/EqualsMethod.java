package others;

public class EqualsMethod {

    public boolean equals(Object obj)
    {
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(getClass()!=obj.getClass())
            return false;
        if (obj instanceof Employee)
        {
            return true;
        }
        return false;
    }
}

class Employee
{

}
