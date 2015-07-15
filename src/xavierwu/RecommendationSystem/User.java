package xavierwu.RecommendationSystem;

import java.util.ArrayList;

public class User {
	private int userId;
	private ArrayList<Double> attributes;
	private ArrayList<Double> latentFactors;

	// ------ Constructors
	public User() {
		userId = 0;
		attributes = new ArrayList<Double>();
		latentFactors = new ArrayList<Double>();
	}

	public User(int userId, ArrayList<Double> attributes,
			ArrayList<Double> latentFactors) {
		this.userId = userId;
		this.attributes = attributes;
		this.latentFactors = latentFactors;
	}

	// ------ About recommendation
	public static double getCosineSimilarity(User user1, User user2) {
		int length = Math.min(user1.attributes.size(), user2.attributes.size());
		double innerProduct = 0.0;
		double squareSum1 = 0.0, squareSum2 = 0.0;
		double tmp1, tmp2;
		for (int i = 0; i < length; ++i) {
			tmp1 = user1.attributes.get(i);
			tmp2 = user2.attributes.get(i);
			innerProduct += tmp1 * tmp2;
			squareSum1 += tmp1 * tmp1;
			squareSum2 += tmp2 * tmp2;
		}
		return innerProduct / Math.sqrt(squareSum1 * squareSum2);
	}

	// ------ Getters & setters
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
