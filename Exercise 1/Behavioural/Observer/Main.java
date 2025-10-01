public class Main {
    public static void main(String[] args) {
        IceCreamTruck truck = new IceCreamTruck();

        Kid thirumalai = new Thirumalai();
        Kid ganesh = new Ganesh();
        Kid dhinesh = new Dhinesh();

        truck.addKid(thirumalai);
        truck.addKid(ganesh);
        truck.addKid(dhinesh);

        truck.arrive("Vanilla");
        truck.arrive("Chocolate");
    }
}

