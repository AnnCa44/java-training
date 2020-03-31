public class ObjectTraining {

    // Add the following private attributes :
    // - name (String)
    // - age (int)
    // - wilder (boolean)
    
    private String name;
    private int age;
    private boolean wilder;



    // Add a Constructor with name and age arguments (in this order)
    // This constructor must initialize name and age attributes
    public ObjectTraining(String name, int age) {
        this.name = name;
        this.age = age;
        this.wilder = wilder;
    }


    // Add getter method for name attribute
    public String getName() {
        return this.getName();
    }
    
    // Add setter method for name attribute
    public void setName(String name) {
        this.name = name;
    }

    
    // Add getter method for age attribute
    public int getAge() {
        return this.getAge();
    }

    // Add setter method for age attribute
    public void setAge(int age) {
        this.age = age;
    }

    // Add getter method for wilder attribute
    public boolean isWilder() {
        return this.wilder;
    }

    // Add setter method for wilder attribute
    public void setWilder(boolean wilder) {
        this.wilder = wilder;
    }

    // Create a method 'whoAmI' that returns "My name is {name} and I'm {age}"
    // where you replace {name} and {age} with attributes values
    public String whoAmI(){
        return "My name is " + this.getName() + "and I'm " + this.getAge();
    }


    // Do not remove this empty constructor !
    public ObjectTraining() {
    }
}
