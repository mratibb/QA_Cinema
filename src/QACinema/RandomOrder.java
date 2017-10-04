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
public class RandomOrder {
	
	public int RandomOrdNum (int OrderNo) {
		//To generate a randon order number
		int num1;
		num1 = 66325 + (int) (Math.random() * 4238);
		OrderNo += num1 + 66325;
		return OrderNo;
	}
}
