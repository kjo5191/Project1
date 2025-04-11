프로젝트 일정 수준 갱신 될 때 마다 ShoFriend.zip 올리는중.

폴더 이름 양식 : ShoFriend_MMDD_hhmm

해당 폴더 안에 ShoFriend.zip 있으니 압축 풀어서 Import 하시거나 필요한 파일만 가져가서 쓰시면 됩니다.



--- 갱신 관련 내용 ---

0409_10시07분 업로드 : Login, Regi, Info 관련 기본 틀 완료

0409_15시40분 업로드 : Session 관련 작업 Login, Regi, Info와 잘 연동. Customer쪽 구현 완료했으나 Seller쪽 부족함.

0409_17시10분 업로드 : 더 디테일하게 구현된 Regi쪽 작업 추가, Store 관련 DAO, Service 등 기반 추가

0410_11시22분 업로드 : Customer Login 오류 해결(비밀번호가 일치하면 다른 ID가 세션으로 넘어갔음), Info 페이지에서 이름/전화번호/주소 수정 기능, Login 메서드쪽 이름 양식 통일

0410_14시30분 업로드 : Register, Login 관련 Seller, Customer 모두 해결. Seller쪽 Info session 작업 추가.

0410_16시24분 업로드 : Customer Mypage에 [주문 조회] 기능 추가 => order_view.jsp 에서 session의 customer_id를 받아와 equals.order_id 조회 (MySQL 에서 insert문으로 직접 추가해서 테스트 해야함)

0411_10시40분 업로드 : Info관련 Seller쪽 모두 구현

0411_14시49분 업로드 : 상품 구매 버튼 -> Order테이블에 DB값 넘기기 구현 + 마이페이지에서 주문 조회 연동 완료
