package ru.job4j.calculate;
/** 
 * Class Calculate для вывода "Hello World!" 
 * @author Alex Agaev (agaevalex97@gmail.com)
 * @since 20.03.2019
*/
public class Calculate {
	/** 
	* Конструктор, вывод строки в консоль.
	* @param args - args. 
	*/
	public static void main(String[]args) {
		System.out.println("Hello World!");
	}
	
	/**
	 * Method echo.
	 * @param name Your name.
	 * @return Echo plus your name.
	 */
	 public String echo(String name) {
		return "Echo, echo, echo : " + name;
	 }
}