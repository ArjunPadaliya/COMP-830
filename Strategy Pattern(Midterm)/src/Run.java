import java.util.ArrayList;

public class Run {
	
	public static void main(String[] args)
	{
		BookInformation obj1 = new BookInformation("J.K. Rowling", "Harry Potter", 2001, "Summary1");
		BookInformation obj2 = new BookInformation("Jeff Kinney", "The Meltdown", 2002, "Summary2");
		BookInformation obj3 = new BookInformation("Craig Smith", "The Wonkey Donkey", 2003, "Summary3");
		BookInformation obj4 = new BookInformation("Stephen King", "Elevation", 2004, "Summary4");		
		BookInformation obj5 = new BookInformation("Justin Timberlake", "Hindsight", 2004, "Summary5");		
		
		ArrayList<BookInformation> bookObjects = new ArrayList<BookInformation>();
		bookObjects.add(obj1);
		bookObjects.add(obj2);
		bookObjects.add(obj3);
		bookObjects.add(obj4);
		bookObjects.add(obj5);
		
		
		BookLibrarian sortBook = new BookLibrarian();
		
		sortBook.setSortMethod("author", bookObjects);
		
		System.out.println("\n\n");
		
		sortBook.setSortMethod("title", bookObjects);
		System.out.println("\n\n");
		
		sortBook.setSortMethod("yearPub", bookObjects);
		
		
	}

}
