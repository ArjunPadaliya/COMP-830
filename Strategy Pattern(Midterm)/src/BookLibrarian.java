import java.util.ArrayList;
import java.util.Collections;

public class BookLibrarian {
	
	public void setSortMethod(String type, ArrayList bookObjects)
	{
		if (type == "author")
		{
			Collections.sort(bookObjects, BookInformation.compareAuthor);
			for(int i=0; i<bookObjects.size(); i++)
			{
				System.out.printf("Object : %s\tTitle : %s\t\tAuthor : %s\tYearPub : %d\tSummary : %s\n",bookObjects.get(i), ((BookInformation) bookObjects.get(i)).getBookTitle(), ((BookInformation) bookObjects.get(i)).getBookAuthor(), ((BookInformation) bookObjects.get(i)).getBookYearPub(), ((BookInformation) bookObjects.get(i)).getBookSummary());
			}
		}
		
		if (type == "title")
		{
			Collections.sort(bookObjects, BookInformation.compareTitle);
			for(int i=0; i<bookObjects.size(); i++)
			{
				System.out.printf("Object : %s\tTitle : %s\tAuthor : %s\tYearPub : %d\tSummary : %s\n",bookObjects.get(i), ((BookInformation) bookObjects.get(i)).getBookTitle(), ((BookInformation) bookObjects.get(i)).getBookAuthor(), ((BookInformation) bookObjects.get(i)).getBookYearPub(), ((BookInformation) bookObjects.get(i)).getBookSummary());
			}
		}
		
		if (type == "yearPub")
		{
			Collections.sort(bookObjects, BookInformation.compareYearPub);
			for(int i=0; i<bookObjects.size(); i++)
			{
				System.out.printf("Object : %s\tTitle : %s\tAuthor : %s\tYearPub : %d\tSummary : %s\n",bookObjects.get(i), ((BookInformation) bookObjects.get(i)).getBookTitle(), ((BookInformation) bookObjects.get(i)).getBookAuthor(), ((BookInformation) bookObjects.get(i)).getBookYearPub(), ((BookInformation) bookObjects.get(i)).getBookSummary());
			}
		}
		
	}

}
