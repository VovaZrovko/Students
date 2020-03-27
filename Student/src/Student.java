public class Student {
    private String name;
    private double rating;

    public Student() {
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;

    }

    void Setname(String name) {
        this.name = name;
    }

    void Setrating(double rating) {
        this.rating = rating;
    }

    String Getname() {
        return this.name;
    }

    double Getrating() {
        return this.rating;
    }

    boolean betterStudent(Student a) {
        if (this.rating > a.rating)
            return true;
        else
            return false;
    }

    public String toString()
    {
        return "name - " + name + " rating " + rating;
    }

    public void changeRating(double rate){
        Setrating(rate);
    }
}
