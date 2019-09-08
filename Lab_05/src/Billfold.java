
public class Billfold {
	
private Card card1;
private Card card2;

public void addCard(Card card){
	if(card1 == null)
		card1 = card;
	else if(card2 == null)
		card2 = card;
}

public String formatCards(){
	return("[" + card1.format() + "|" + card2.format() + "]");
}
}
