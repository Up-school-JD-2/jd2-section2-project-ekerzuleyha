public class Main {
    public static void main(String[] args) {
        ManagementOfPhoneApp management =new ManagementOfPhoneApp();
        //management.addPerson(new Person("züleyha","eker","22222222","zuleyha@gmail.com"));
       // management.addPhone(new Phone("apple","14 pro","11111","128 GB","IOS"));
       // management.addApplication(new Application("wp","12.0","chat application"));
        Person person1= new Person("züleyha","eker","1111","zuleyha@gmal.com");
        Person person2= new Person("rümeysa","eker","1111","zuleyha@gmal.com");
        management.addPerson(person1);
        management.addPerson(person2);
        management.listPersons();

        Phone phone1=new Phone("apple","14 pro","1111111","128gb","ıos");

        management.addPhone(phone1);
        management.listPhone();

        Application app1= new Application("wp","12.0","app");
        management.addAplication(app1);
         management.listApp();

         management.deletePerson(person1);
         management.listPersons();


    }
}
