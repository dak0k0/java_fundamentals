package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class Restaurant extends Building{

    float rating;
    String cuisine;

    public Restaurant(String name, String address, String cuisine, float rating){
        super(name, address);
        this.cuisine = cuisine;
        this.rating = rating;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "rating=" + rating +
                ", cuisine='" + cuisine + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
