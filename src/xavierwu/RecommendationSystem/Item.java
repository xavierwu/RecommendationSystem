package xavierwu.RecommendationSystem;

import java.util.ArrayList;

public class Item {
	private int itemId;
	private ArrayList<Double> attributes;
	private ArrayList<Double> latentFactors;

	// ------ Constructors
	public Item() {
		itemId = 0;
		attributes = new ArrayList<Double>();
	}

	public Item(int itemId, ArrayList<Double> attributes,
			ArrayList<Double> latentFactors) {
		this.itemId = itemId;
		this.attributes = attributes;
		this.latentFactors = latentFactors;
	}

	// ------ About recommendation
	public static double getCosineSimilarity(Item item1, Item item2) {
		int length = Math.min(item1.attributes.size(), item2.attributes.size());
		double innerProduct = 0.0;
		double squareSum1 = 0.0, squareSum2 = 0.0;
		double tmp1, tmp2;
		for (int i = 0; i < length; ++i) {
			tmp1 = item1.attributes.get(i);
			tmp2 = item2.attributes.get(i);
			innerProduct += tmp1 * tmp2;
			squareSum1 += tmp1 * tmp1;
			squareSum2 += tmp2 * tmp2;
		}
		return innerProduct / Math.sqrt(squareSum1 * squareSum2);
	}

	// ------ Getters & setters
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public ArrayList<Double> getAttributes() {
		return attributes;
	}

	public void setAttributes(ArrayList<Double> attributes) {
		this.attributes = attributes;
	}

	public ArrayList<Double> getLatentFactors() {
		return latentFactors;
	}

	public void setLatentFactors(ArrayList<Double> latentFactors) {
		this.latentFactors = latentFactors;
	}
}
