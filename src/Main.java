import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Office f1 = new Office();
        Office f2 = new Office();
        Computer c1 = new Computer();
        Computer c2 = new Computer();
        Employee employee1 = new Employee(326438710L, "employee1");
        Employee employee2 = new Employee(304513013L, "employee2");
        SecurityGuard securityGuard1 = new SecurityGuard(323208736L, "sec");
        SecurityGuard securityGuard2 = new SecurityGuard(323208736L, "sec");
        Courier courier1 = new Courier(54873214L, "courier");

        List<Identifiable> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(securityGuard1);
        list.add(securityGuard2);
        list.add(courier1);

        List<Office> officeList = new ArrayList<>();
        officeList.add(f1);
        officeList.add(f2);

        List<Computer> computerList = new ArrayList<>();
        computerList.add(c1);
        computerList.add(c2);

        List<OfficeSupportEntity> officePeople = new ArrayList<>();

        int of1 = 0;

        for (int i = 0; i< list.size(); i++){
            if (list.get(i) instanceof OfficeSupportEntity){
                ((OfficeSupportEntity) list.get(i)).setOffice(officeList.get(of1));
                ((ComputerSupportable) list.get(i)).setComputer(computerList.get(of1));
                officePeople.add((OfficeSupportEntity) list.get(i));
//                list.remove(i);
                of1++;
            }
        }

        for (int i = 0; i < officePeople.size(); i++){
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getId());
            System.out.println();
        }

//        System.out.println();
        System.out.println("----------------------");
        System.out.println();

        for (int i = 0; i< list.size(); i++){
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getId());
            System.out.println();
        }
        System.out.println();
        System.out.println(securityGuard1.equalTo(securityGuard2));
    }
}
