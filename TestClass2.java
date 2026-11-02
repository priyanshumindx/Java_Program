interface TestInterface
{
    final int a = 10;
    static void display()
    {
        System.out.println("hello");
    }
}


class TestClass2 implements TestInterface
{
    
    public static void main (String[] args)
    {
        TestInterface.display();
    }
}