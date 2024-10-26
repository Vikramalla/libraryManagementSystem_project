package libraryManagementSystem_project;

public class titlemismatchexception extends RuntimeException {
     @Override
     public String toString() {
    	 return getClass()+"title not matched with java,sql,python ";
     }
}
