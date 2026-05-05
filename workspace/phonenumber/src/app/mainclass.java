package app;


import Dao.datastorage;
import dao.HashMapStorageImpl;
import dao.datastorage;
import model.PhoneNumberTask;
import java.util.Scanner;

public class mainclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        datastorage storage;

        System.out.println("저장 방식을 선택하세요: 1. HashMap, 2. Database");
        int choice = scanner.nextInt();
        scanner.nextLine();

        storage = (choice == 1) ? new HashMapStorageImpl() : new DatabaseStorageImpl();

        storage.addMember(new PhoneNumberTask("홍길동", "01012345678", "서울", "친구"));
        storage.addMember(new PhoneNumberTask("김철수", "01098765432", "부산", "가족"));

        for (PhoneNumberTask member : storage.getAllMembers()) {
            System.out.println(member.getName() + " - " + member.getPhoneNumber());
        }

        scanner.close();
    }
}
