package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class BuildingController {

    public static void main(String[] args) {

        Apartment uvaResidence = new Apartment("UVA Dorm", "1234 Emmett St.",
                                            1.5f, 2, 463);

        House ashburnResidence = new House("Home", "12345 Croson Ln.", 4f, 3, 3);

        Townhouse richmondResidence = new Townhouse("Richmond Home", "1234 Richmond Rd.",
                                            2.5f, 3, 1, 'B');

        Restaurant favoriteRestaurant = new Restaurant("Peter Chang", "2345 Emmet St.", "Chinese", 5f);

        Building[] buildings = {uvaResidence, ashburnResidence, richmondResidence, favoriteRestaurant};

        for(Building building : buildings){
            System.out.println(building.toString());
        }

    }

}
