package Model;

public class Newspaper extends Document {
	private String headline;
	private int issueNumber;

	public Newspaper(int documentId, int publisherId, int stockCount, String headline, int issueNumber) {
		super(documentId, publisherId, stockCount);
		this.headline = headline;
		this.issueNumber = issueNumber;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	@Override
	public String toString() {
		return super.toString() + " " + headline + " " + issueNumber;
	}

}
