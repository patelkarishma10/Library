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
		Book story = new Book(1, 139408, 3, "Story", "anAuthor");
		Map trailMap = new Map(2, 190943, 5, "london", "trail");
		Newspaper theNews = new Newspaper(3, 394857, 1, "It's sunny", 55);
		CustomerManager cml = new CustomerManager();
		Library list1 = new Library();

	}
}
