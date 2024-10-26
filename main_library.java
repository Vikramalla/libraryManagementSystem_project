package libraryManagementSystem_project;

import java.util.Scanner;

public class main_library {
       public static void main(String[] args) {
    	   Library l=new Library();
		   Scanner sc=new Scanner(System.in);
		   boolean isstart=true;
		   while(isstart) {
			   System.out.println("1 add book");
			   System.out.println("2 diplaybook");
			   System.out.println("3 searchbookbasedonid");
			   System.out.println("4 searchbookbasedonauthor");
			   System.out.println("5 updatebooks");
			   System.out.println("6 removebookbyid");
			   System.out.println("7 exit");
			   System.out.println("enter your choice:");
			int choice=sc.nextInt();
			switch(choice){
			case 1:
			{
				System.out.println("enter the book title:");
				String title=sc.next();
				System.out.println("enter the book id:");
				int id=sc.nextInt();
				System.out.println("enter the book cost:");
				int cost=sc.nextInt();
				System.out.println("enter the book pages:");
				int noofpages=sc.nextInt();
				System.out.println("enter the book author:");
				String author=sc.next();
				l.addBook(new Book(title,id,cost,noofpages,author));
			}
			break;
			case 2:
			{
				l.displayBook();
			}
			break;
			case 3:
			{
				System.out.println("enter the book id:");
				int id=sc.nextInt();
				l.searchBookBasedOnId(id);
			}
			break;
			case 4:
			{
				System.out.println("enter the book author:");
				String author=sc.next();
				l.searchBookBasedOnAuthor(author);
			}
			break;
			case 5:
			{
				System.out.println("enter the book title:");
				String title=sc.next();
				l.updateBook(title);
			}
			break;
			case 6:
			{
				System.out.println("enter the book id:");
				int id=sc.nextInt();
				l.removeBookById(id);
			}
			break;
			case 7:
			{
				isstart=false;
				System.out.println("Thank you.");
			}
			break;
			default:System.out.println("enter valid choice.");
			}
		}
		
	}
}
