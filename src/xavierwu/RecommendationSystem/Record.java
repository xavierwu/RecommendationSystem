package xavierwu.RecommendationSystem;

import java.util.ArrayList;

public class Record {
	private int recordId;
	private User user;
	private Item item;
	private ArrayList<Double> attributes;

	// ------ Constructors
	public Record() {
		recordId = 0;
		user = new User();
		item = new Item();
		attributes = new ArrayList<Double>();
	}

	public Record(int recordId, User user, Item item,
			ArrayList<Double> attributes) {
		this.recordId = recordId;
		this.user = user;
		this.item = item;
		this.attributes = attributes;
	}

	// ------ About recommendation
	public static double getPreference(User user, Item item) {
		double preference = 0.0;
		ArrayList<Double> uLatentFactor = user.getLatentFactors();
		ArrayList<Double> iLatentFactor = item.getLatentFactors();
		int length = Math.min(uLatentFactor.size(), iLatentFactor.size());
		for (int i = 0; i < length; ++i)
			preference += uLatentFactor.get(i) * iLatentFactor.get(i);
		return preference;
	}

	// ------ Getters & setters
	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public ArrayList<Double> getAttributes() {
		return attributes;
	}

	public void setAttributes(ArrayList<Double> attributes) {
		this.attributes = attributes;
	}

}
