package libraryManagementSystem_project;

import java.util.ArrayList;
import java.util.Iterator;


public class Library {
      private int libid;
      private String location;
      private Book b;
      
      private ArrayList<Book> a=new ArrayList<Book>();
      public void addBook(Book b) {
    	  a.add(b);
    	  System.out.println("book added successfully.");
      }
      public void displayBook() {
    	  if(a.isEmpty()) {
    		  System.out.println("books are not added yet");
    	  }
    	  else {
    		  for(Book b:a) {
    			  b.display();
    		  }
    	  }
    	  
      }
      public void searchBookBasedOnId(int id) {
    	  boolean isFound=false;
    	  if(a.isEmpty()) {
    		  System.out.println("books are not added yet");
    	  }
    	  else {
    		  for(Book b:a) {
    			  if(b.getId()==id) {
    	    		  System.out.println("Book found successfully."+b.getTitle());
    	    		  isFound=true;
    	    	  }
    		  }
    	  }
    	  if(isFound==false) {
    		  throw new idmismatchexception();
    	  }
    	  
      }
      public void searchBookBasedOnAuthor(String author) {
    	  boolean isFound=false;
    	  if(a.isEmpty()) {
    		  System.out.println("books are not added yet");
    	  }
    	  else {
    		  for(Book b:a) {
    			  if(b.getAuthor().equals(author)) {
    	    		  System.out.println("Book found ..."+b.getTitle());
    	    		  isFound=true;
    	    	  }
    		  }
    	  }
    	  if(isFound==false) {
    		  throw new authormismatchexception();
    	  }
      }
      public void updateBook(String title) {
    	  boolean isFound=false;
    	  if(a.isEmpty()) {
    		  System.out.println("books are not added yet");
    	  }
    	  else {
    		  for(Book b:a) {
    			  if(b.getTitle().equals(title)) {
    				  b.setCost(1000);
    	    		  System.out.println("Book found cost updated");
    	    		  isFound=true;
    	    	  }
    		  }
    	  }
    	  if(isFound==false) {
    		  throw new titlemismatchexception();
    	  }
      }
      public void removeBookById(int id) {
    	  Iterator<Book> itr=a.iterator();
    	  boolean isRemoved=false;
    	  if(a.isEmpty()) {
    		  System.out.println("books are not added yet");
    	  }
    	  else {
    		  while(itr.hasNext()) {
    			  Book b=itr.next();
    			  if(b.getId()==id) {
    	    		  a.remove(b);
    	    		  System.out.println("Book removed...");
    	    		  isRemoved=true;
    	    	  }
    		  }
    	  }
    	  if(isRemoved==false) {
    		  throw new idmismatchexception();
    	  }
      }
}

