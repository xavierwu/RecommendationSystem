package xavierwu.RecommendationSystem;

import java.util.ArrayList;

public class Recommender {
	private ArrayList<Record> records;

	// ------ Constructor
	public Recommender() {
		records = new ArrayList<Record>();
	}

	public Recommender(ArrayList<Record> records) {
		this.records = records;
	}

	// ------ About recommendation
	public ArrayList<Item> recommend(User user) {
		// TODO
		ArrayList<Item> recommendedItems = new ArrayList<Item>();
		return recommendedItems;
	}

	public ArrayList<Item> recommendBasedOnContent(User user) {
		// TODO
		ArrayList<Item> recommendedItems = new ArrayList<Item>();
		return recommendedItems;
	}

	public ArrayList<Item> recommendBasedOnItem(User user) {
		// TODO
		ArrayList<Item> recommendedItems = new ArrayList<Item>();
		return recommendedItems;
	}

	public ArrayList<Item> recommendBasedOnUser(User user) {
		// TODO
		ArrayList<Item> recommendedItems = new ArrayList<Item>();
		return recommendedItems;
	}

	// ------ Getters & setters
	public ArrayList<Record> getRecords() {
		return records;
	}

	public void setRecords(ArrayList<Record> records) {
		this.records = records;
	}
}
