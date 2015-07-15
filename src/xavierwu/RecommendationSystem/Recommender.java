package xavierwu.RecommendationSystem;

import java.util.ArrayList;

public class Recommender {
	ArrayList<Double> user;
	ArrayList<Double> item;
	
	Recommender(ArrayList<Double> user, ArrayList<Double> item){
		this.user= user;
		this.item = item;
	}
}
