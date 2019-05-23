package Model;

public class Book extends Document {

	private String title;
	private String Author;

	public Book(int documentId, int publisherId, int stockCount, String title, String author) {
		super(documentId, publisherId, stockCount);
		this.title = title;
		Author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

}
