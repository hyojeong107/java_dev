package customer;

public class CustomerTest {
	
	public static void main(String[]args) {
		CustomerDAO customerDao = new CustomerDAO();
		customerDao.select();
	}

}
