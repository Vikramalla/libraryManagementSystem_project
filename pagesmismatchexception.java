package libraryManagementSystem_project;

public class pagesmismatchexception extends RuntimeException {
	@Override
    public String toString() {
   	 return getClass()+"pages not matched with range 500-3000";
    }
}
