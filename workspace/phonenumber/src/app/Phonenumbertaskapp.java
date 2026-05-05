package app;

	
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.InputMismatchException;
	import java.util.Scanner;

	import PhoneNumberTask;
	import ReadWrite;

	public class Phonenumbertaskapp {
		
		//해시맵을 사용하여 저장하는 클래스

		public static void main(String[] args) {

			// 해시맵 선언 : hashmap
			HashMap<String, PhoneNumberTask> hashmap = new HashMap<String, PhoneNumberTask>();

			ReadWrite rw = new ReadWrite();

			// 스캐너 선언
			Scanner scanner = new Scanner(System.in);

			// 전체 메뉴에서 5.종료 누르면 프로그램 종료 시킬 boolean (while)
			Boolean casefive = true;

			// 전체메뉴 선택 숫자 변수 선언: inputnumber
			int inputnumber;

//			파일을 읽고,읽은 파일을 바탕으로 hashmap 저장되어
			// hashmap에 hasmap 넣기 hashmap.putAll(hashmap)
			hashmap.putAll(rw.readFile());

			// while문 시작
			while (casefive) {

				// 전체 메뉴 출력
				System.out.println("다음 메뉴 중 하나를 선택하세요");
				System.out.println("=====================");
				System.out.println("1.회원 추가");
				System.out.println("2.회원 목록 보기");
				System.out.println("3.회원 정보 수정");
				System.out.println("4.회원 삭제");
				System.out.println("5.종료");
				System.out.print("숫자를 입력 하세요>");

				// 예외처리
				try {

					// 사용자에게 문자열로 입력 받아서 Integer.parseInt 로 숫자로 변환
					inputnumber = Integer.parseInt(scanner.next()); // 입력받은 숫자 inputnumber에 저장
					scanner.nextLine(); // 버퍼 비우기

					// 예외처리: 메뉴 번호 선택 시 1~5만(1보다 작을 때, 5보다 클 때)
					if (inputnumber < 1 || inputnumber > 5) {
						System.out.println("1~5 사이의 수를 입력해주세요.");
						continue; // 다시 while문으로 돌아가서 inputnumber 입력 받음
					}
					// 예외처리: 숫자가 아니라 문자로 입력했을 경우
				} catch (NumberFormatException e) {
					System.out.println("숫자로 입력해주세요.");
					continue; // 다시 while문으로 돌아가서 inputnumber 입력 받음
				}

				// obj값 초기화
				PhoneNumberTask obj = null;

				// 전체 메뉴 출력에서 입력받은 번호로 switch문

				switch (inputnumber) {

				// case:1 ==> 회원추가
				case 1:
					memberAdd(scanner, hashmap);
					break;

				// case:2 ==> 회원목록보기
				case 2:
					// hashmap.size=해시맵에 저장된 오브젝트의 개수(저장된 회원수) 만큼 나온다.
					System.out.println("총 " + hashmap.size() + "회원이 저장되어 있습니다.");

					// for문으로 회원 목록 출력

					for (String key : hashmap.keySet()) { // 향상된 for문 사용해서 오브젝트 하나씩 다 꺼내기 반복
						// hashmap.keySet으로 해시맵의 모든 키 리턴

						// key 값에 해당하는 object꺼내기 => keyvalue에 저장
						PhoneNumberTask keyvalue = hashmap.get(key);

						// 출력
						System.out.println("이름: " + keyvalue.getName() + ", 전화번호: " + keyvalue.getPhonenumber() + ", 주소: "
								+ keyvalue.getAdress() + ", 구분: " + keyvalue.getCategorize());
						System.out.println("==============================================");
					}

					break;

				// case:3 ==> 회원정보 수정
				case 3:
					int count = 1; // 동일인물 검색시 해시맵에 같은 이름으로 저장되어 있는 obj 출력 할 때 순서를 나타낼 카운트 변수

					// 동명이인시 수정할 회원번호 입력 받을 변수 선언
					int selectedIndex;

					// 수정 할 회원의 이름 검색
					System.out.println("수정 할 이름을 검색하세요: ");

					// 수정할 회원의 이름 키보드로 입력받음=> searchname에 저장
					String searchname = scanner.nextLine();

					// 검색해서 출력 한 결과를 저장 할 ArrayList 생성. 변수 선언: arrsearchresult
					ArrayList<PhoneNumberTask> arrsearchresult = new ArrayList<>();

					// 이름으로 검색된 회원의 정보 모두 출력
					for (String key1 : hashmap.keySet()) { // keyset으로 key를 추출해서

						obj = hashmap.get(key1); // get써서 key1에 해당하는 값 obj에 저장

						// obj의 getName과 사용자에게 입력받은 searchname이 같으면 출력
						if (obj.getName().equals(searchname)) {

							System.out.println(count + " 이름: " + obj.getName() + ", 전화번호: " + obj.getPhonenumber()
									+ ", 주소: " + obj.getAdress() + ", 구분: " + obj.getCategorize());

							// 출력된 결과를 add로 arrsearchresult에 추가
							arrsearchresult.add(obj);
							count++; // 동일이름 출력시 구분해줄 숫자 count, for문을 반복하므로 1씩 증가하여서 count++

						}
					}

					// 예외처리: 검색된 회원이 목록에 없을 경우 종료
					if (arrsearchresult.isEmpty()) {
						System.out.println("수정할 회원이 없습니다.");
						break; // case 나가는 break => 다시 전체 메뉴 출력
					} else {
						try {
							while (true) {
								System.out.println("수정 할 회원의 번호를 입력하세요: ");

								// 사용자에게 수정할 회원의 번호 입력 받음
								selectedIndex = scanner.nextInt();
								scanner.nextLine(); // 버퍼 비움

								// 예외처리: 수정할 회원의 번호 입력 시,
								// arrsearchresult에 저장되어 있는 obj의 수보다 사용자가 입력한 수가 크거나, 입력 숫자가 1보다 크면
								if (selectedIndex > arrsearchresult.size() || selectedIndex < 1) {
									System.out.println("범위 내의 수를 입력해주세요.");
									continue; // while문으로 돌아간다.
								} else {
									// arrsearchresult는 어레이리스트로 인덱스가 0부터 시작하기 때문에 사용자가 선택한 숫자 번호보다 -1인 인덱스에 해당하는 값을
									// 가져온다.
									// 가져온 값을 selectedMember에 저장한다.
									PhoneNumberTask selectedMember = arrsearchresult.get(selectedIndex - 1);

									// selectedMember 객체에서 Phonenumber를 가져와서 지운다.
									hashmap.remove(selectedMember.getPhonenumber());
									break;
								}

							} // 수정할 회원의 번호를 숫자로 입력하지 않고 문자로 입력했을 경우
						} catch (NumberFormatException e) {
							System.out.println("숫자로 입력해주세요.");
							continue; // 다시 while문으로 돌아가 수정 할 회원의 번호를 입력 받음.
						}

					}

					System.out.println("===수정 할 정보를 입력 하세요===");

					memberAdd(scanner, hashmap); // 회원추가 메소드로 수정 할 정보를 입력 받아서 hashmap에 추가한다.
					System.out.println("수정이 완료 되었습니다.");

					break;

				// case:4 ==> 회원삭제
				case 4:
					// 삭제 할 회원의 목록 저장 할 deletearrat 선언
					ArrayList<String> deletearray = new ArrayList<>();

					// 동명이인 존재 시 출력 할 때 객체를 구분해줄 변수 선언 : i
					int i = 1;

					System.out.println("삭제할 회원의 이름을 입력하세요: ");

					// 사용자에게 삭제하고 싶은 회원의 이름 입력 받아서 deletename에 저장
					String deletename = scanner.nextLine();

					// 사용자에게 삭제 할 회원의 번호 입력 받을 변수 deletenumber 초기화
					int deletenumber;

					// 이름으로 검색해서 출력하기
					for (String key : hashmap.keySet()) {
						// key에 해당하는 value 가져와서 obj1에 저장
						PhoneNumberTask obj1 = hashmap.get(key);

						// 사용자에게 입력받은 삭제하고 하는 deletename과 객체에서 getName한 값이 같으면 출력
						if (obj1.getName().equals(deletename)) {
							// 검색된 회원 정보 출력
							System.out.println(i + " 이름: " + obj1.getName() + ", 전화번호: " + obj1.getPhonenumber() + ", 주소: "
									+ obj1.getAdress() + ", 구분: " + obj1.getCategorize());
							// deletearray에 삭제 할 회원의 key(전화번호)를 추가한다.
							deletearray.add(key);
							// 위에 case:3 회원수정에서는 arrsearchresult.add(obj); 어레이리스트에 obj라는 오브젝트를 추가 했는데
							// case:4 회원삭제에서는 어레이리스트에 key를 저장 한 이유 : 회원 수정 할 때는 수정 대상 회원의 전체 데이터를 가져와야 하고 ,
							// 회원 삭제시에는 hashmap의 key만 있어도 되기 때문이다.
							i++;

						}
					}

					// 예외처리: 검색된 회원이 없으면 종료

					if (deletearray.isEmpty()) {
						System.out.println("삭제할 회원이 없습니다.");
						break; // case 나가는 break
					} else {
						while (true) {

							// 삭제할 회원의 번호 선택
							System.out.println("삭제할 회원의 번호를 입력하세요: ");
							try {
								// 사용자에게 삭제 할 회원의 번호 입력 받아서 deletenumber에 저장
								deletenumber = scanner.nextInt();
								scanner.nextLine(); // 버퍼 비우기

								// 예외처리: deletearray List에 저장되어 있는 값의 개수보다 사용자가 입력한 숫자가 크거나, 1보다 작으면
								if (deletenumber > deletearray.size() || deletenumber < 1) {
									System.out.println("범위 내의 수를 입력해주세요.");
									continue; // while문으로 돌아가서 다시 삭제할 회원의 번호를 입력 받음.
								} else {
									break;
								}

							} catch (NumberFormatException e) {
								// 문자로 입력했을 경우
								System.out.println("숫자로 입력해주세요.");
								continue; // while문으로 돌아가서 다시 삭제할 회원의 번호를 입력 받음.
							} catch (InputMismatchException e) {
								System.out.println("다시 입력하세요");
								continue;
							}
						}

						// 삭제 실행
						// deletearray에 저장되어 있던 값을 가져와 deletekey에 저장한다.
						String deleteKey = deletearray.get(deletenumber - 1);

						// hashmap에서 deletekey로 value를 삭제 한다.
						hashmap.remove(deleteKey);
						System.out.println("삭제가 완료되었습니다!");
						break; // 삭제 완료 되면 break => case문 나가는 break
					}
				case 5:
					System.out.println("프로그램을 종료 합니다.");

					// 프로그램 종료시 파일을 저장하는 코드
					rw.writeFile(hashmap);

					// 맨 위의 while문을 돌리는 casefive=true; 를 false 처리
					casefive = false;
					break;

				// default:잘못입력 했을 때 다시 전체메뉴 출력으로 돌아가야함
				default:
					System.out.println("잘못입력했습니다.(1~5)까지 숫자 중 하나를 입력하세요");

				}// switch문 닫음
			} // while 닫음
			scanner.close();

		} // main 닫음

		// 회원정보 입력 메소드 case:1 과 case:3(회원정보수정)에서 사용됨.
		private static void memberAdd(Scanner scanner, HashMap<String, PhoneNumberTask> hashmap) {

			// 회원정보 변수 선언(초기화)
			String inputname = null;
			String inputphonenumber = null;
			String inputaddress = null;
			String inputcategorize = null;

			// 전화번호가 유효한지 아닌지 확인하기 위한 변수: checknumber
			boolean checknumber = true;

			System.out.println("회원의 정보를 입력하세요");

			System.out.println("이름: ");
			// 사용자에게 입력 받은 이름 inputname에 저장
			inputname = scanner.nextLine();

			while (true) { // 옳은 형태의 전화번호를 입력 받는 무한 루프 while문

				System.out.println("전화번호: ");
				try {
					// 숫자 입력 받음
					inputphonenumber = scanner.nextLine();

					// 전화번호 중복 체크
					if (hashmap.containsKey(inputphonenumber)) { // containskey로 해시맵에 중복된 inputphonenumber가 있는지 체크
						System.out.println("전화번호가 중복 되었습니다.");
						continue; // 다시 while문으로 돌아가서 전화번호 입력 받음
					}
					checknumber = true; // 초기화

					//예외처리
					//입력받은 전화번호를 문자 하나씩 저장 할 문자 배열 선언하는 코드, 배열 이름: ch
					char[] ch = new char[inputphonenumber.length()];

					//for문 사용해서 string으로 입력받은 inputphonenumber의 값을 charAt을 사용해서 ch배열에 한글자씩 저장한다.
					for (int i = 0; i < inputphonenumber.length(); i++) {
						// abcde 라는 문자가 있으면 ch[0]= a, ch[1]=b .....
						//charAt: string으로 저장된 문자열 중에서 한글자만 선택해서 char타입으로 변환해주는 것
						ch[i] = inputphonenumber.charAt(i);
					}
					for (int i = 0; i < inputphonenumber.length(); i++) {
						if (Character.isDigit(ch[i]) == false) {
							checknumber = false;
						}
					}
					if (checknumber == false) {
						System.out.println("숫자만 입력하세요");
						continue;
					} else {
//					제약조건 2. 길이가 10~11자리여야함
						if (inputphonenumber.length() < 10 || inputphonenumber.length() > 11) {
							System.out.println("전화번호는 10자리에서 11자리 사이여야합니다.");
							continue;
						}
					}

					break;
				} catch (NumberFormatException e) {
					System.out.println("숫자로 입력해주세요.");
					continue;
				}
			}
			System.out.println("주소: ");
			inputaddress = scanner.nextLine();

			// 예외처리: 회원추가시 구분에서 "친구","가족","기타"만 받을 수 있게 , 그 외에는 예외처리
			while (true) { // 옳은 형태로 구분 입력 받을 때까지 무한반복하는 while문
				System.out.println("구분: ");
				inputcategorize = scanner.nextLine();
				// 친구 가족 기타 만 받을수 있게 <=친구 또는 가족 또는 기타가 아닌 경우
				if (inputcategorize.equals("친구") || inputcategorize.equals("가족") || inputcategorize.equals("기타")) {
					break;
				} else {
					System.out.println("친구 가족 기타 중에서 입력하세요.");
					continue; // 다시 while문으로 돌아감
				}
			}

			// 위에서 입력받은 정보로 obj라는 object 생성한다.
			PhoneNumberTask obj = new PhoneNumberTask(inputname, inputphonenumber, inputaddress, inputcategorize);
			obj.setName(inputname);
			obj.setPhonenumber(inputphonenumber);
			obj.setAdress(inputaddress);
			obj.setCategorize(inputcategorize);

			// object생성 후 해시맵에 저장
			hashmap.put(inputphonenumber, obj);// * key: 전화번호 - value: new된 object

		}// 메소드 닫음
	}



	// class 닫음

}
