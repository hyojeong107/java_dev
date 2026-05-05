

package customer;

//데이터 베이스 저장방식(DB와 연결)
//DAO 모델 클래스




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @packageName : customer
 * @fileName 	: CustomerDAO.java
 * @author 		: ehapp
 * @date		: 2025.01.17
 * @description	: customer table 고객정보 처리 
 * ==================================================
 * DATE             AUTHOR              NOTE
 * --------------------------------------------------
 * 2025.01.17 JH BANG     최초 생성
 */
public class CustomerDAO {
//	1. 전체 조회
	public ArrayList<customerDTO> select() {
		ArrayList<customerDTO> custList = new ArrayList<>();
//		데이터베이스 연동
//		연동시 URL, ID, PW 저장 => Connection 생성시 사용
//		필요한 변수를 선언
		String url = "jdbc:mysql://localhost:3306/sakila";
		String id = "root";
		String pw = "doitmysql";
		
		Connection con 			= null;
		PreparedStatement pstmt = null;
		ResultSet rs 			= null;
		
		String sql = "select c.customer_id,				"
				   + "       c.first_name ,				"
				   + "       a.address					"
				   + "  from customer c					"
				   + "  join address a					"
				   + "    on c.address_id = a.address_id";
		
//		1. 드라이버 로딩, 생략 가능
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스를 찾을 수 없다");
		}
		try {
//		2. Connection 생성
			con = DriverManager.getConnection(url, id, pw);
			
//		3. PreparedStatement 생성
			pstmt = con.prepareStatement(sql); // select 처리
		
//		4. PreparedStatement 실행 -> 반환 : ResultSet
			rs = pstmt.executeQuery(); // select 일 경우 executeQuery()
			
//		5. ResultSet => ArrayList에 담는다
			while(rs.next()) { // next() 다음행이 있니? 
				// 한행의 한컬럼씩 꺼내서 저장
				int customer_id = rs.getInt("customer_id");
				String first_name = rs.getString("first_name");
				String address = rs.getString("address");
				// DTO 생성
				customerDTO cust = 
						new customerDTO(
								customer_id, 
								first_name, 
								address);
				// DTO를 ArrayList에 추가
				custList.add(cust);
				// 테스트 
				System.out.println(cust.toString());
				
			}
			
		} catch (SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}
		
		
//		6. Connection close()
		
		return custList;
	}

//	2. 추가
//	public int insert(CustomerDTO cust){}
	public void insert() {

//		1. 키보드로 고객 정보를 입력 : CustomerService(클래스 이름)에서 처리 필요
//		Scanner scanner = new Scanner(System.in);
////		int customer_id; // 데이터베이스 이 컬럼 auto_increment : 자동 1씩 증가
//		String first_name 	= null;
////		String address 		= null;
//		System.out.println("이름입력 : ");
//		first_name = scanner.next();
		
		
//		2. 데이터베이스(customer table) insert
//		변수 선언
		String url = "jdbc:mysql://localhost:3306/sakila";
		String id = "root";
		String pw = "doitmysql";
		
		Connection con 			= null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into contact (contact_name, contact_phone, contact_address)"
				   + "            values(?,?,?)						";
		
//		2.1 드라이버 로딩
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
//		2.2 Connection 생성
			con = DriverManager.getConnection(url, id, pw);
			
//		2.3 PreparedStatement 생성
			pstmt = con.prepareStatement(sql);
			
//		2.4 실행 : insert
			pstmt.setString(1,"마크"); // 키보드에서 입력한 값으로 이름
			pstmt.setString(2,"01033334444"); //연락처
			pstmt.setString(3,"기흥"); //주소
			int flag = pstmt.executeUpdate(); // insert, update, delete

//		3. 정상추가시 출력 : VIEW에서 처리 필요
			if(flag == 1) {
				System.out.println("정상추가");
			}else {
				System.out.println("추가 에러");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}


		
	
	}
}

 












