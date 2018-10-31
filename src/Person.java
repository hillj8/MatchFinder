public class Person {

    private String name;
    private int taken;
    private int given;

    public Person(String name){
        this.name = name;
        taken = 0;
        given = 0;
    }

    public int getTaken() {
        return taken;
    }

    public String getName() {
        return name;
    }

    public void setTaken(int taken) {
        this.taken = taken;
    }

    public int getGiven() {
        return given;
    }

    public void setGiven(int given) {
        this.given = given;
    }
}