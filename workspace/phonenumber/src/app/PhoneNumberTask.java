package app;


	import java.io.Serializable;

	public class PhoneNumberTask implements Serializable {

	// 이름,주소,폰번호,구분(가족or친구or기타) class 만들기 

		// 멤버 변수 선언
		private String name; // 이름
		private String phonenumber; // 전화번호
		private String address; // 주소
		private String categorize; // 구분

		// 생성자 선언
		public PhoneNumberTask(String name, String phonenumber, String adress, String categorize) {
			this.name = name;
			this.phonenumber = phonenumber;
			this.address = adress;
			this.categorize = categorize;
		}

		// get-set 메소드
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}

		public String getAdress() {
			return address;
		}

		public void setAdress(String adress) {
			this.address = adress;
		}

		public String getCategorize() {
			return categorize;
		}

		public void setCategorize(String categorize) {
			this.categorize = categorize;
		}

		// get-set 메소드

		// tostring 오버라이드

	} // class 닫음


}
