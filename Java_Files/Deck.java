public class Deck {
    private Card cards[]; //Заменил указатель на оъект
    int capacity;
    int card_flag[]; 
    public Deck(){
        this.cards=new Card[5];
        this.card_flag=new int[5];
        this.capacity = 5;
    for (int i = 0; i < 10; i++)
    {
        this.card_flag[i] = 0;
    }
    }
    public  Deck(int capacity){
        this.cards=new Card[capacity];
        this.card_flag=new int[capacity];
        this.capacity = capacity;
        for (int i = 0; i < capacity; i++)
        {
        this.card_flag[i] = 0;
        }
    }
    int Get_Num_Cards(){
        int num = 0;
        for (int i = 0; i < this.capacity; i++) {
        if (this.card_flag[i] != 0)
            num++;
        }   
        return num;
    }
    void Set_Card_In_Place(Card card_ptr, int place){ //Заменил указатель на оъект
        this.cards[place - 1] = card_ptr;
        this.card_flag[place - 1] = 1;
    }
    Card Get_Card_From_Place(int place){ //Заменил указатель на оъект
        this.card_flag[place - 1] = 0;
        return this.cards[place - 1];
}
    }
