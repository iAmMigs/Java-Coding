package Java_TX22.Module7.Topic2;

abstract class Person {
    protected int idNo;
    protected String firstName;
    protected String lastName;

    // Abstract methods are methods without implementation (body/definition)
    abstract void displayInfo();

    public void foo(){
        System.out.println("Foo function!!!");
    }
}
