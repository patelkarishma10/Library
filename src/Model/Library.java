package Model;

import java.util.ArrayList;

public class Library implements CheckInable, CheckOutable {

	private ArrayList<Document> documentList = new ArrayList<Document>();

	public ArrayList<Document> getDocumentList() {
		return documentList;
	}

	public void setDocumentList(ArrayList<Document> documentList) {
		this.documentList = documentList;
	}

	public void addItemToDocList(Document d) {
		getDocumentList().add(d);
	}

	public void deleteItemInList(Document d) {
		getDocumentList().remove(d);
	}

	@Override
	public void checkIn(Document d) {
		d.setStockCount(d.getStockCount() + 1);
	}

	@Override
	public void checkOut(Document d) {
		d.setStockCount(d.getStockCount() - 1);
	}

}
