package FirstTask.app;

	import java.util.Scanner;
// view class : 출력만 하는 클래스 
	public class View {
	    private static Scanner scanner;

	    public View() {
	        scanner = new Scanner(System.in);
	    }

	    public static int showmenu() {
	        System.out.println("\n===== 전화번호 관리 프로그램 =====");
	        System.out.println("1. 회원 추가");
	        System.out.println("2. 회원 수정");
	        System.out.println("3. 회원 삭제");
	        System.out.println("4. 회원 목록 보기");
	        System.out.println("5. 종료");
	        System.out.print("메뉴를 선택하세요: ");
	        
	        //숫자 입력 안할 때 발생하는 오류
	        try {
	            return Integer.parseInt(scanner.nextLine());
	        } catch (NumberFormatException e) {
	            System.out.println("숫자로 입력해주세요.");
	            return -1;
	        }
	    }

	    public String getInput(String prompt) {
	        System.out.print(prompt);
	        return scanner.nextLine();
	    }

	    public void displayMessage(String message) {
	        System.out.println(message);
	    }
	}

	

