package FirstTask.app;

import FirstTask.lib.PhoneNumberTask;

public class Controller {
    private Service service ;
    private View view;


    public Controller(Service phoneBookService, View view) {
        this.service = service;
        this.view = view;
    }

    public void run() {
        boolean running = true;

        while (running) {
            int choice = 0;
			try {
				choice = View.showmenu();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            switch (choice) {
                case 1:
                    addMember();
                    break;
                case 2:
                    updateMember();
                    break;
                case 3:
                    deleteMember();
                    break;
                case 4:
                    showAllMembers();
                    break;
                case 5:
                    view.displayMessage("프로그램을 종료합니다.");
                    running = false;
                    break;
                default:
                    view.displayMessage("올바른 메뉴를 선택하세요.");
            }
        }
    }
    //멤버 추가
    private void addMember() {
        String name = View.getInput("이름을 입력하세요: ");
        String phoneNumber = View.getInput("전화번호를 입력하세요: ");
        String address = View.getInput("주소를 입력하세요: ");
        String category = View.getInput("구분(친구/가족/기타): ");

        PhoneNumberTask member = new PhoneNumberTask(name, phoneNumber, address, category);
        Service.addMember(member);
        view.displayMessage("회원이 추가되었습니다.");
    }
    //멤버 수정
    private void updateMember() {
        String phoneNumber = view.getInput("수정할 회원의 전화번호를 입력하세요: ");
        PhoneNumberTask existingMember = Service.getAllMembers()
                .stream()
                .filter(m -> m.getPhoneNumber().equals(phoneNumber))
                .findFirst()
                .orElse(null);

        if (existingMember == null) {
            view.displayMessage("해당 전화번호를 가진 회원이 없습니다.");
            return;
        }

        String newName = view.getInput("새로운 이름을 입력하세요: ");
        String newAddress = view.getInput("새로운 주소를 입력하세요: ");
        String newCategory = view.getInput("새로운 구분(친구/가족/기타): ");

        existingMember.setName(newName);
        existingMember.setAdress(newAddress);
        existingMember.setCategorize(newCategory);
        Service.updateMember(existingMember);
        view.displayMessage("회원 정보가 수정되었습니다.");
    }
    //멤버 삭제
    private void deleteMember() {
        String phoneNumber = view.getInput("삭제할 회원의 전화번호를 입력하세요: ");
        Service.deleteMember(phoneNumber);
        view.displayMessage("회원이 삭제되었습니다.");
    }
    //멤버 수정
    private void showAllMembers() {
        for (PhoneNumberTask member : Service.getAllMembers()) {
            view.displayMessage("이름: " + member.getName() +
                                ", 전화번호: " + member.getPhonenumber() +
                                ", 주소: " + member.getAdress() +
                                ", 구분: " + member.getCategorize());
        }
    }
}
