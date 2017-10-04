/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QACinema;

/**
 *
 * @author Ratib
 */
public class totalPrice {
	int stnd, oap, stud, chld;
	
	private int total;
	public int totalP (int total) {
	setPrices();
	MainQA obj1 = new MainQA();
	MainQA obj2 = new MainQA();
	MainQA obj3 = new MainQA();
	MainQA obj4 = new MainQA();
	
	this.total = (stnd * (obj1.getOapNo()) + (oap * (obj2.getOapNo())) + (stud * (obj3.getSdntNo())) + (chld * (obj4.getChldNo())));
	return total;
	}
	
	public int getTotal() {
	return total;
	}
	
	public void setPrices(){
		MainQA CurrPrices = new MainQA();
		if (CurrPrices.getSelectedDay().equals("Wednesday")) {
		stnd = 6;
		oap = 4;
		stud = 4;
		chld = 2;
		}
		else {
		stnd = 8; 
		oap = 6;
		stud = 6;
		chld = 4;
		}
	}
	
	
}
