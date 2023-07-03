import java.util.*;

public class ManagementOfPhoneApp {
    public List<Application> applications =new ArrayList<>();
    //private Map<String, Application> applications;
    public List<Person> persons = new ArrayList<>();
   // private Map<String, Person> persons;
    public List<Phone> phones =new ArrayList<>();
    //private Map <String, Phone > phones;

    /*public ManagementOfPhoneApp(Map<String, Application> applications, Map<String, Person> persons, Map <String, Phone > phones) {
        applications = new HashMap<>();
        persons =new HashMap<>();
        phones= new HashMap<>();

    }*/

    /*public ManagementOfPhoneApp(List<Application> applications, List<Person> persons, List<Phone> phones) {
        this.applications = applications;
        this.persons = persons;
        this.phones = phones;
    }*/


    public void addPhone(Phone phone){
        phones.add(phone);
    }
    public void deletePhone(Phone phone){
        phones.remove(phone);
    }
    public void UpdatePhone(Phone phone){

    }
    public void addPerson(Person person){
        persons.add(person);
    }
    public void deletePerson(Person person){
        persons.remove(person);
    }
    public void updatePerson(Person person){

    }
    public void addAplication(Application app){
        applications.add(app);
    }
    public void deleteApp(Application app){
        applications.remove(app);
    }
    public void updateApp(Application App){

    }


    public void listPersons(){
        for (Person person : persons){
            System.out.println(person);
        }

    }

    public void listPhone(){
        for (Phone phone : phones){
            System.out.println(phone);
        }

    }


    public void listApp(){
        for (Application app : applications){
            System.out.println(app);
        }

    }




}
