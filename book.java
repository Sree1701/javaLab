import java.util.Scanner;
class Publisher{
        String publisher;

        void getPublisher(String p){
                publisher=p;
        }
}
class Book extends Publisher{
        String title;
        int price;
        void getBook(String t,int pr){
                title=t;
                price=pr;
        }
}
class Literature extends Book{
        void display(){
                System.out.println("Category: Literature");
                System.out.println("Title:" + title);
                System.out.println("Price:" + price);
                System.out.println("Publisher:" + publisher);
        }
}
class Fiction extends Book{
        void display(){
                System.out.println("Category:Fiction");
                System.out.println("Title:" + title);
                System.out.println("Price:" + price);
                System.out.println("Publisher:" + publisher);
        }
}
public class book{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Literature l = new Literature();
                Fiction f = new Fiction();

                System.out.println("Enter Literature Book Title:");
                String lt = sc.nextLine();

                System.out.println("Enter Literature Book Price:");
                int lp = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Literature Publisher:");
                String lpub = sc.nextLine();

                l.getBook(lt,lp);
                l.getPublisher(lpub);

                System.out.println("Enter Fiction Book Title:");
                String ft = sc.nextLine();

                System.out.println("Enter Fiction Book Price:");
                int fp = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Fiction Publisher:");
                String fpub = sc.nextLine();

                f.getBook(ft,fp);
                f.getPublisher(fpub);

                System.out.println("\nBook Details:");
                l.display();
                f.display();
        }
}
