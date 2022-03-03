class Coffeee
{
    protected void order()
    {
        System.out.println("Coffee");
    }
}

public class Cappuccino extends Coffeee
{
    public static void main(String args[])
    {
        Cappuccino c = new Cappuccino();
        c.order();
    }
}