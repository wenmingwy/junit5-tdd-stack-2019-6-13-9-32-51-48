class BaseClass {
    protected String name;
    public void setName (String name) { this.name = name; }
    public String getName() { return name; }
}

class DerivedClass extends BaseClass {
    @Override
    public void setName (String name) { this.name = name + " is so cute"; }
}

class App {
    public static void main(String[] args) {
        BaseClass instance = new DerivedClass();
        instance.setName("Bob")
        System.out.println(instance.getName());
    }
}