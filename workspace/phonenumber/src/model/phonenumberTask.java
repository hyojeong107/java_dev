package model;

// 이름,전화번호,주소,구분을 저장하기 위한 class 
public class phonenumberTask {
    private String name;
    private String phoneNumber;
    private String address;
    private String category;

    public phonenumberTask(String name, String phoneNumber, String address, String category) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.category = category;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}
