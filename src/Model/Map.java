package Model;

public class Map extends Document {

	private String location;
	private String mapType;

	public Map(int documentId, int publisherId, int stockCount, String location, String mapType) {
		super(documentId, publisherId, stockCount);
		this.location = location;
		this.mapType = mapType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMapType() {
		return mapType;
	}

	public void setMapType(String mapType) {
		this.mapType = mapType;
	}

}
