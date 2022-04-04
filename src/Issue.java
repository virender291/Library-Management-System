import java.util.Scanner;

public abstract class Issue {
    String a;
    String b;
   public void  BooksIssue(){
       System.out.println("Enter The Number Of Books To Be Issues ( Upto 2)");
       Scanner s1=new Scanner(System.in);
       int x=s1.nextInt();
       if(x<1 || x>2)
       {
           try {
               throw new Exception("No Of Books To Be Issued At A time Can Not Be More Than 2");
           }catch (Exception e){
               System.out.println(e);
               BooksIssue();
           }}
           else if (x==2) {
           System.out.println("Enter The Book Names You Want To Issue.");
           System.out.println("1:");a=s1.next();
           System.out.println("2:");b=s1.next();
           System.out.println("The Books You Have Issued Are");
           a=a.replaceAll("\\s"," ");
           System.out.println("1:"+a);
           b=b.replaceAll("\\s"," ");
           System.out.println("2:"+b);}
           else{
           System.out.println("\tEnter The Book Name You Want To Issue");
           a=s1.next();
           System.out.println("\tThe Book You Have Issued Is");
           a=a.replaceAll("\\s"," ");
           System.out.println("1:"+a);
       }



       }

       }




