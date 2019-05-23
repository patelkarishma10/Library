package Model;

public abstract class Document implements CheckInable, CheckOutable {

	private int documentId;
	private int publisherId;
	private int stockCount;

	public Document(int documentId, int publisherId, int stockCount) {
		this.documentId = documentId;
		this.publisherId = publisherId;
		this.stockCount = stockCount;
	}

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}

	@Override
	public String toString() {
		return documentId + " " + publisherId + " " + stockCount;
	}

	@Override
	public int checkIn(Document d) {

		return d.setStockCount() + 1;
	}

	@Override
	public void checkOut() {

	}

}
