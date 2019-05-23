package Model;

public class Book extends Document {

	private String title;
	private String author;

	public Book(int documentId, int publisherId, int stockCount, String title, String author) {
		super(documentId, publisherId, stockCount);
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return super.toString() + " " + title + " " + author;
	}

}
