package FirstTask.app;



	import FirstTask.app.Controller;
	import FirstTask.app.Service;
	import FirstTask.app.View;
	import dao.HashMapStorageImpl;

	public class main {
	    public static void main(String[] args) {
	        // 저장 방식을 HashMap 또는 DB로 변경할 수 있음
	       Service phoneBookService = new Service(new HashMapStorageImpl());
	        View view = new View();
	        Controller controller = new Controller(Service, view);

	        controller.run();  // 프로그램 실행
	    }
	}

	

