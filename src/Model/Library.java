package Model;

import java.util.ArrayList;

public class Library {

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

}
