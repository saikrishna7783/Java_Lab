import java.util.Scanner;

class Book{
    String name,author;
    int price,num_pages;
    Book(String n,String a,int p,int no){
        name=n;
        author=a;import java.util.Scanner;

class Book {
    String name, author;
    int price, num_pages;

    // Book() {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the Book title : ");
    // name = sc.nextLine();
    // System.out.print("Enter the name of Author : ");
    // author = sc.nextLine();
    // System.out.print("Enter the price of the book : ");
    // price = sc.nextInt();
    // System.out.print("Enter the number of pages of the book : ");
    // num_pages = sc.nextInt();
    // sc.close();
    // }

    void assign() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Book title : ");
        name = sc.nextLine();
        System.out.print("Enter the name of Author : ");
        author = sc.nextLine();
        System.out.print("Enter the price of the book : ");
        price = sc.nextInt();
        System.out.print("Enter the number of pages of the book : ");
        num_pages = sc.nextInt();
        sc.close();
    }

    public String toString() {
        return ("------------------------------------------------------------\nBook Title : " + name + "\nAuthor : "
                + author + "\nPrice : " + price + "\nNo of pages : " + num_pages
                + "\n------------------------------------------------------------");
    }
}

class hi {
    public static void main(String args[]) {
        System.out.print("Enter the number of books : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Book b[] = new Book[n];
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("Enter the details of Book " + i + 1 + "\n");
            b[i].assign();
        }
        for (i = 0; i < n; i++) {
            System.out.print("The details of Book " + i + 1 + " are :\n");
            System.out.print(b[i]);
        }
    }
}
        price=p;
        num_pages=no;
    }
    void toString(){
        System.out.println("The name of the book is : "+name);
        System.out.println("The author of the book is : "+author);
        System.out.println("The price of the book is : "+price);
        System.out.println("The number of pages in the book is : "+num_pages);
    }
}

class ex{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books : ");
        int n = sc.nextint();
        for(int i=0;i<n;i++){
            Book Booki = new Book();
        }
    }
}
