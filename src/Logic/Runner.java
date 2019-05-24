package Logic;

import Model.Book;
import Model.Customer;
import Model.CustomerManager;
import Model.Library;
import Model.Map;
import Model.Newspaper;

public class Runner {
	public static void main(String[] args) {
		Customer K = new Customer(1, "K");

		Book story = new Book(1, 139408, 3, "Story", "anuthor");
		Map trailMap = new Map(2, 190943, 5, "london", "trail");
		Newspaper theNews = new Newspaper(3, 394857, 1, "It's sunny", 55);
		Book story2 = new Book(4, 139409, 2, "Story2", "anAuthor2");
		Map roadMap = new Map(5, 190942, 6, "manchester", "road");
		Newspaper theNews2 = new Newspaper(7, 394857, 1, "It's rainy", 54);
		story.setAuthor("anAuthor");

		CustomerManager cml = new CustomerManager();
		Library list1 = new Library();

		list1.addItemToDocList(story);
		list1.addItemToDocList(trailMap);
		list1.addItemToDocList(theNews);
		list1.addItemToDocList(story2);
		list1.addItemToDocList(roadMap);
		list1.addItemToDocList(theNews2);

		System.out.println(list1.getDocumentList());
		// list1.updateItemInList(story, 1);
		// System.out.println(list1.getDocumentList());
		System.out.println(story);
		list1.checkIn(story);
		System.out.println(story);

	}
}
