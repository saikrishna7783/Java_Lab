import java.util.Scanner;

class Book{
    String name,author;
    int price,num_pages;
    Book(String n,String a,int p,int no){
        name=n;
        author=a;
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
