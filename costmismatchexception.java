package libraryManagementSystem_project;

public class costmismatchexception extends RuntimeException {
	@Override
    public String toString() {
   	 return getClass()+"cost not in range of 300 to 2000";
    }
}
