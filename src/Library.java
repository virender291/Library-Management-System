import java.util.Scanner;

public class Library extends Architecture {
    public void display() {
        System.out.println("What would you like to do.");
        System.out.println("1.Show Books In Library.");
        System.out.println("2.Exit");
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        if (x1 <= 0 || x1 > 2) {
            try {
                throw new Exception("The Choice Should Be Given As Shown On Display");
            } catch (Exception e) {
                System.out.println(e);
                display();
            }
        }
        switch (x1) {
            case 1:
                System.out.println("\t------------------------------");
                System.out.println("\tInformation Regarding Books");
                System.out.println("\t------------------------------");
                System.out.println("What would you like to do.");
                System.out.println("The Categories Of The Books Present Are:");
                System.out.println("a: Computer Science ");
                System.out.println("b: Architecture ");
                System.out.println("c: Zoology ");
                System.out.println("d: Novels ");
                System.out.println("e: Botany ");
                Scanner s1 = new Scanner(System.in);
                String x2 = s1.next();
               /* if (!x2.equals("a") || !x2.equals("b") || !x2.equals("c") || !x2.equals("d") || !x2.equals("e")) {
                    try {
                        throw new Exception("Select From The Choice Given.");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }*/
                switch (x2) {
                    case "a":
                        System.out.println("\t------------------------------");
                        System.out.println("\tWelcome To The Computer Science Section");
                        System.out.println("\t------------------------------");
                        Computer c = new Computer();
                        c.present();
                        c.BooksIssue();
                        break;
                    case "b":
                        System.out.println("\t------------------------------");
                        System.out.println("\tWelcome To The Architecture Section");
                        System.out.println("\t------------------------------");
                        Architecture a = new Architecture();
                        a.present();
                        a.BooksIssue();
                        break;
                    case "c":
                        System.out.println("\t------------------------------");
                        System.out.println("\tWelcome To The Zoology Section");
                        System.out.println("\t------------------------------");
                        Zoology z = new Zoology();
                        z.present();
                        z.BooksIssue();
                        break;
                    case "d":
                        System.out.println("\t------------------------------");
                        System.out.println("\tWelcome To The Novels Section");
                        System.out.println("\t------------------------------");
                        Novels n = new Novels();
                        n.present();
                        n.BooksIssue();
                        break;
                    case "e":
                        System.out.println("\t------------------------------");
                        System.out.println("\tWelcome To The Botany Section");
                        System.out.println("\t------------------------------");
                        Botany b = new Botany();
                        b.present();
                        b.BooksIssue();
                        break;
                default:
                    System.out.println("Please Choose from options provided");
                    break;
                }

        case 2:
        System.out.println("Thank You for coming ");
            System.out.println("Come Again :)");
        break;

        }

    }
}


