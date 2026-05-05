package customer;


// DTO
public class customerDTO {
@Override
	public String toString() {
		return "[customer_id=" + customer_id + ", first_name=" + first_name + ", address=" + address + "]";
	}



	// 한명 고객의 정보(고객번호,고객명,주소)를 저장하는 class
	// 컬럼명과 동일하게 변수명 설정해야 한다.
	private int customer_id;
	private String first_name;
	private String address;
	
	
	
	//생성자 
	//오브젝트 생성 할 때 데이터를 저장 
	//getter : 데이터를 입력 할 때 넣어주는 역할
	//setter : 데이터를 수정 할 때 사용하는 역할 
	public customerDTO(int customer_id, String first_name, String address) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.address = address;
}



	public int getCustomer_id() {
		return customer_id;
	}


	

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}



	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
}