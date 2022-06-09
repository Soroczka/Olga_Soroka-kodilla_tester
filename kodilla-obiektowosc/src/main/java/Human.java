public class Human {
    private String name;
    private double age;
    private double height;

    public Human(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public double getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public String getName() {
        return this.name;
    }

    public boolean validateIsOlderThan(double age){
        if (this.age > age){
            System.out.println("User is older than "+age);
            return true;
        }else {
            System.out.println("User is younger than " +age);
            return false;
        }

    }

    public boolean validateIsHigherThan(double height){
        if(this.height > height){
            System.out.println("User is higher than "+height +" cm");
            return true;
        } else {
            System.out.println("User is smaller than "+height+" cm");
            return false;
        }
    }



}
