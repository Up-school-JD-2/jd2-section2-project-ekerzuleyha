import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice = 0;

        ManagementOfPhoneApp manager = new ManagementOfPhoneApp();


        System.out.println("Giriş yapabilmek için telefon ekleyiniz.");

        System.out.println("--------------------------------");

        System.out.print("Eklenecek telefonun markasını giriniz: ");
        String marka = input.nextLine();
        //input.nextLine();

        System.out.print("Eklenecek telefonun modelini giriniz: ");
        String model = input.nextLine();

        System.out.print("Eklenecek telefonun seri numarasını giriniz: ");

        String numara = input.nextLine();

        System.out.print("Eklenecek telefonun depolama alanını giriniz: ");
        String depolamaAlanı = input.nextLine();

        System.out.print("Eklenecek telefonun işletim sistemini giriniz: ");
        String sistem = input.nextLine();


        Phone phone = new Phone(marka, model, numara, depolamaAlanı, sistem);
        manager.addPhone(phone);

        System.out.println("--------------------------------");
        printMenu();


        do {
            System.out.print("Seçiminiz: ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("--------------------------------");

                    System.out.print("Eklenecek kişinin ismini giriniz: ");
                    String isim=input.nextLine();
                    input.nextLine();

                    System.out.print("Eklenecek kişinin soyismini giriniz: ");
                    String soyisim = input.nextLine();

                    System.out.print("Eklenecek kişinin telefon numarasını giriniz: ");

                    String telno = input.nextLine();

                    System.out.print("Eklenecek kişinin mailini giriniz: ");
                    String mail = input.nextLine();


                    Person person=new Person(isim,soyisim,telno,mail);
                    manager.addPerson(person);


                    System.out.println("--------------------------------");
                    break;

                }
                case 2 -> {
                    System.out.println("--------------------------------");

                    System.out.print("Eklenecek uygulamanın adını giriniz: ");
                    String ad=input.nextLine();
                    input.nextLine();

                    System.out.print("Eklenecek uygulamanın versiyonunu giriniz: ");
                    String version = input.nextLine();

                    System.out.print("Eklenecek uygulamanın açıklamasını giriniz: ");

                    String aciklama = input.nextLine();

                    Application app =new Application(ad,version,aciklama);
                    manager.addApp(app);


                    System.out.println("--------------------------------");
                    break;


                }
                case 3 -> {
                    input.nextLine();
                    System.out.println("Silinecek kişinin adını giriniz;");
                    String ad = input.nextLine();

                    manager.deletePerson(ad);


                    break;
                }

                case 4 -> {
                    input.nextLine();
                    manager.listPersons();

                    break;
                }
                case 5 -> {
                    input.nextLine();

                    break;
                }
                case 6 -> {
                    input.nextLine();

                    break;
                }


                case -1 -> {
                    System.out.println("İyi günler");
                }
                default -> printMenu();
            }
        } while (choice != -1);




}





























        /*ManagementOfPhoneApp management =new ManagementOfPhoneApp();
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

          /*manager.addPerson(new Person("züleyha","eker","11111","@gmail"));
        manager.listPersons();

        manager.addApp(new Application("wp","12.0","uygulama"));
        manager.listApp();

        manager.addPhone(new Phone("samsung","a54","222222","124gb","android"));
        manager.listPhone();*/



    private static void printMenu() {
        System.out.println("##### Menu #####");
        System.out.println("1: Kişi ekleme");
        System.out.println("2: Uygulama ekleme");
        System.out.println("3: Kişi Silme");
        System.out.println("4: Kişileri listeleme");
        /*System.out.println("5: Filmleri Listeleme");
        System.out.println("6: Film Arama");
        System.out.println("7: Film Silme");
        System.out.println("8: Film Ekleme");*/
        System.out.println("-1: Çıkış \n\n");


    }
}
