public class HomeAppliancesStore {

    public static String name;
    public static String address;
    public static int employee;

    public void setName (String name){
        this.name = name;
    }
    public String getName () {
        return name;
    }
    public void setAddress (String address){
        this.address = address;
    }
    public String getAddress () {
        return address;
    }
    public void setEmployee ( int employee){
        this.employee = employee;
    }
    public Integer getEmployee () {
        return employee;
    }
    public static void main (String[]args) {

        HomeAppliancesStore Alpha = new HomeAppliancesStore();
        Alpha.setName(args[0]);
        Alpha.setAddress(args[1]);
        Alpha.setEmployee(Integer.parseInt(args[2]));

        System.out.println("Name:" + name + "\tAddress:" + address + "\tEmployee:" + employee + "\n\n");

        System.out.println("***** Fridge *****");
        Fridge ena = new Fridge(123, 123);
        ena.VasikaHaraktiristika();
        Fridge dio = new Fridge();
        dio.IdikaHaraktiristika();

        System.out.println("\n\n***** Washine Machine *****");

        WashineMachine one = new WashineMachine(123, 123);
        one.VasikaHaraktiristika();
        WashineMachine two = new WashineMachine();
        two.IdikaHaraktiristika();

        System.out.println("\n\n*****  Oven  *****");

        Oven first = new Oven(123, 123);
        first.VasikaHaraktiristika();
        Oven second = new Oven();
        second.IdikaHaraktiristika();

        System.out.println("\n\n***** Air-Condition *****");

        AirCondition un = new AirCondition(123, 123);
        un.VasikaHaraktiristika();
        AirCondition deux = new AirCondition();
        deux.IdikaHaraktiristika();

    }
}
