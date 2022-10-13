public class Hand{
	Card cards[]; // Заменл указатель и размер массива
	int current_num_cards;
	int cards_flag[]; // Заменил размер массива

	public Hand(){
		this.cards=new Card[10];
		this.cards_flag=new int[10];
        this.current_num_cards = 0;
	for (int i = 0; i < 3; i++) {
		this.cards_flag[i] = 0;
	}
    }
	public void Set_Card_In_Place_Of_Hand(Card card_ptr, int hand_place){ // Замена
        this.cards[hand_place - 1] = card_ptr;
	this.cards_flag[hand_place - 1] = 1;
    }
	public boolean Check_If_Card_In_Place(int place){
        if (this.cards_flag[place] == 1)
		return true;
	else
		return false;
    }
	public int Get_Cost_From_Card_In_Place(int place){
        return this.cards[place].Get_Cost();
    }
};