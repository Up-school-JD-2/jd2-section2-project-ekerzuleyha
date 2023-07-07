import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class ManagementOfPhoneApp {
    //public List<Application> applications =new ArrayList<>();
    //private Map<String, Application> applications;
    //public List<Person> persons = new ArrayList<>();
   // private Map<String, Person> persons;
   // public List<Phone> phones =new ArrayList<>();
    //private Map <String, Phone > phones;

    private Map<String ,Application> apps;
    private Map<String ,Person> persons;
    private Map <String,Phone> phones;



    public ManagementOfPhoneApp(){
        apps= new HashMap<>();
        persons =new HashMap<>();
        phones=new HashMap<>();

    }
    public void addPerson(Person person){
        persons.put(person.getName(),person);
        System.out.println("kullanıcı eklendi.");
        listPersons();

    }

    public void deletePerson(String name){
        persons.remove(name);
        System.out.println("Kullanıcı silindi. ");
        //listPersons();

    }

    public void addApp(Application app){
        apps.put(app.getName(),app);
        System.out.println("uygulama eklendi");
        listApp();
    }

    public void addPhone(Phone phone){
        phones.put(phone.getBrand(),phone);
        System.out.println("telefon eklendi");
        listPhone();
    }





    public void listPersons(){
        for (Person person : persons.values()){
            System.out.println(person);
        }

    }


    public void listApp(){
        for (Application app : apps.values()){
            System.out.println(app);
        }

    }

    public void listPhone(){
        for (Phone phone : phones.values()){
            System.out.println(phone);
        }

    }


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


   /* public void addPhone(Phone phone){
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

    }*/



}
