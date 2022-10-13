public class Card 
{ 
	private int cost;
	public  Card(int cost){
		this.cost=cost;
	};
	public  Card(){
		this.cost = 1;
	}
	public  int Get_Cost(){
		return this.cost;
	}
	public  void Set_Cost(int cost){
		this.cost = cost;
	}
};