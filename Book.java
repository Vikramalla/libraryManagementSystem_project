package libraryManagementSystem_project;

public class Book {
    private String title; //java ||sql||python
    private int id;       //even
    private int cost;     //300-2000
    private int noofpages; //500-3000
    private String author;//james||scott||alean
    
    public Book() {}

	public Book(String title, int id, int cost, int noofpages, String author) {
		if(validateTitle(title)) {
			this.title = title;
		}
		else {
			throw new titlemismatchexception();
		}
		if(validateId(id)) {
			this.id = id;
		}
		else {
			throw new idmismatchexception();
		}
		if(validateCost(cost)) {
			this.cost = cost;
		}
		else {
			throw new costmismatchexception();
		}
		if(validateNoofpages(noofpages)) {
			this.noofpages = noofpages;
		}
		else {
			throw new pagesmismatchexception();
		}
		if(validateAuthor(author)) {
			this.author = author;
		}
		else {
			throw new authormismatchexception();
		}
		
		
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getNoofpages() {
		return noofpages;
	}

	public void setNoofpages(int noofpages) {
		this.noofpages = noofpages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public boolean validateTitle(String title) {
		if(title.equals("java")||title.equals("sql")||title.equals("python")) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean validateId(int id) {
		if(id%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean validateCost(int cost) {
		if(cost>=300&&cost<=2000) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean validateNoofpages(int noofpages) {
		if(noofpages>=500&&noofpages<=3000) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean validateAuthor(String author) {
		if(author.equals("james")||author.equals("scott")||author.equals("alean")) {
			return true;
		}
		else {
			return false;
		}
	}
    
    public void display() {
    	System.out.println("book title is:"+getTitle());
    	System.out.println("book id is:"+getId());
    	System.out.println("book cost is:"+getCost());
    	System.out.println("book noofpages is:"+getNoofpages());
    	System.out.println("book author is:"+getAuthor());
    }
    
    @Override
    public String toString() {
    	return " book title is:"+title+"\n book id is:"+id+"\n book cost is:"+cost+"\n book noofpages is:"+noofpages+"\n book author is:"+author;
    }
}
