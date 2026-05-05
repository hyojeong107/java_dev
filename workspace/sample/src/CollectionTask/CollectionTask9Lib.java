package CollectionTask;

/**
 * @packageName : CollectionTask
 * @fileName    : CollectionTask9Lib.java
 * @autor       : TJ
 * @date        : 2024.12.23
 * @description : 나라이름,수도로 구성된 Nation class 작성
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.23 hyojeong
 */
public class CollectionTask9Lib {

	//멤버변수 선언 
	private String country ;
	private String capital ;
	
	//생성자 선언
	public CollectionTask9Lib (String country,String capital) {
				this.country=country; 
				this.capital=capital;  
				}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
}