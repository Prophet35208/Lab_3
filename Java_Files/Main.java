import java.util.Scanner;
public class Main {
     public static void main(String[] args){
        Scanner in = new Scanner(System.in); 
    // Создадим колоду вместимостью 5 карт
    System.out.printf("Создадим колоду вместимостью 5 карт\n");
    Deck my_deck=new Deck(5);
    // Можем так же создать колоду через консольный диалог
    System.out.printf("Можем так же создать колоду через консольный диалог\n");
    int buf;
    Deck you_deck;
    System.out.printf("Введите кол-ва карт в колоде: ");
    buf=in.nextInt();
    you_deck = new Deck(buf);
    //Сразу удалим её, т.к. она нам не нужна
    System.out.printf("Сразу удалим её, т.к. она нам не нужна\n");
    you_deck=null;
    System.out.printf("\nВаша колода была создана и после удалена\n");
    System.out.printf("\n");
    // Посмотрим кол-во карт в колоде (не макс. их кол-во)
    System.out.printf("Посмотрим кол-во карт в колоде (не макс. их кол-во)\n");
    int num;
    num=my_deck.Get_Num_Cards();
    System.out.printf("Кол-во кард в колоде: %d\n", num);
    // Добавим карту 5 в позицию 1, и карту 2 в позицию 4. 
    System.out.printf("Добавим карту 5 в позицию 1, и карту 2 в позицию 4\n");
    Card first_card,second_card;
    first_card=new Card(5);
    second_card=new Card(2);
    my_deck.Set_Card_In_Place(first_card,1);
    my_deck.Set_Card_In_Place(second_card, 4);
    num = my_deck.Get_Num_Cards();
    System.out.printf("Кол-во кард в колоде теперь: %d\n", num);
    System.out.printf("\n");
    // Теперь создадим игрока №1 с его игровой рукой. Пока что она пустая
    System.out.printf("Теперь создадим игрока №1 с его игровой рукой. Пока что она пустая\n");
    Player my_player;
    my_player=new Player(1);
    // Получим карту в руку из колоды (из позиции колоды №4) в руку нашего игрока (в позицию руки №1)
    System.out.printf("Получим карту в руку из колоды (из позиции колоды №4) в руку нашего игрока (в позицию руки №1)\n");
    my_player.hand.Set_Card_In_Place_Of_Hand(my_deck.Get_Card_From_Place(4), 1);
    // Так же получим последнюю карту из колоды в нашу руку. Поставим карту в третью позицию руки
    System.out.printf("Так же получим последнюю карту из колоды в нашу руку. Поставим карту в третью позицию руки\n");
    my_player.hand.Set_Card_In_Place_Of_Hand(my_deck.Get_Card_From_Place(1), 3);
    System.out.printf("\n");
    // Теперь создадим коэффициент для подсчёта очков
    System.out.printf("Теперь создадим коэффициент для подсчёта очков\n");
    Coefficient my_coefficient;
    my_coefficient=new Coefficient(25, 2);
    // Можем попробовать создать его разными конструкторами.
    Coefficient coefficient_1, coefficient_2;
    coefficient_1=new Coefficient();
    coefficient_2=new Coefficient(2);
    System.out.printf("Hard coefficient = %d, Soft coefficient = %d\n", my_coefficient.Get_Hard_Coefficient(), my_coefficient.Get_Soft_Coefficient());
    System.out.printf("\n");
    System.out.printf("\n");
    //Так же покажем работу с динамическим массивом объектов класса и с массивом динамических объектов класса
    // Массив динамических объектов класса
    // Создадим три карты со стоимостью 3 и узнаем их суммарную стоимость. После этого удалим
    System.out.printf("Так же покажем работу с динамическим массивом объектов класса и с массивом динамических объектов класса\n");
    System.out.printf("\n");
    System.out.printf("Массив динамических объектов класса\n");
    System.out.printf("Создадим три карты\n");
    Card mas_cards[]=new Card[3];
    int sum=0;
    for (int i = 0; i < 3; i++)
    {
        mas_cards[i] = new Card(3);
    }
    for (int i = 0; i < 3; i++)
    {
        sum += mas_cards[i].Get_Cost();
    }
    System.out.printf("Суммарная стоимость трёх новосозданных карт: %d\n", sum);
    for (int i = 0; i < 3; i++)
    {
        mas_cards[i]=null;
    }
    System.out.printf("Работа с динамическим массивом объектов класса указана в комментариях\n");
    // Работа с динамическим массивом объектов класса.
    Card arr[] = new Card[10];// Конструкто по умолчанию делает все карты стоимостью 1
    for (int i = 0; i < 10; ++i)
        arr[i]=new Card();
    for (int i = 0; i < 10; ++i) {// Теперь стоимость установим в 3.
        arr[i].Set_Cost(3);
    }
    // Теперь удалим массив
    arr=null;
    System.out.printf("\n");
    // Воспользуемся созданным коэффициентом для того, чтобы подсчитать кол-во баллов на руке нашего игрока
    System.out.printf("Воспользуемся ранее созданным коэффициентом для того, чтобы подсчитать кол-во баллов на руке нашего игрока\n");
    int points;
    points = my_player.Get_Sum_Points(my_coefficient);
    System.out.printf("Кол-во баллов на руке нашего игрока: %d\n", points);
    System.out.printf("Введите что-нибудь, чтобы выйти\n");
    in.next();
    in.close();
}}
