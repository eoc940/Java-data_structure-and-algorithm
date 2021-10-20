## 해시

만약 회원정보를 등록해야 한다고 하자. 사진과 이름, 전화번호, 주소를 받았고, 방문할 때마다 얼굴을 보고 방문 정보를 기록한다고 하자.
기록일지는 12칸의 다른 색깔의 수납장에 보관되어 있는데, 사진을 보고 고유의 수납장 색깔을 선택해야 한다. 사진이라는 입력으로
고유의 색깔이라는 출력을 하는 매개체를 hash function이라고 한다. 그러면 최종적으로 고유의 색깔의 수납장에 사진(key)과 
이름,전화번호,주소(value)로 저장된다. 

### 해싱(Hashing)
- 데이터를 빠르게 저장하고 가져오는 기법 중 하나
- 키에 특정 연산을 적용하여 테이블의 주소를 계산

### 해시 테이블
- (Key, Value) 쌍을 저장
- 순서 X

### Hashing - Key
- 키를 기준으로 값을 매핑
- 고유한 값
  - 중복 X
  - 사람 이름? 아이디?

### Hashing - Hash Function
- 임의의 데이터(키)를 특정 값(해시값)으로 매핑시키는 함수

![image](https://user-images.githubusercontent.com/67304980/138029204-19510833-7c13-433c-b01b-843ce4e7e327.png)

- 좋은 해시 함수
  - 키 값을 고르게 분포 시킴
  - 빠른 계산
  - 충돌 최소화

## 해시 충돌(Hash Collision)
- 키 값이 다른데, 해시 함수의 결과값이 동일한 경우

![image](https://user-images.githubusercontent.com/67304980/138029419-bbbf3216-0db0-4f0a-bc4b-d4a9698a2757.png)

#### 비둘기 집 원리
- N+1 개의 물건을 N개의 상자에 넣을 때 적어도 어느 한 상자에는 두 개 이상의 물건이 들어있다

![image](https://user-images.githubusercontent.com/67304980/138029468-f8c6f8bf-7981-48b2-81ff-46e452a1812a.png)

#### Birthday Problem
- 임의의 사람 N명이 모였을 때 그 중에 생일이 같은 두 명이 존재할 확률
- 생일의 가능한 가짓수는 366개(2월 29일 포함)
- 366명이 모여야 생일이 같은 경우가 있을까?
- 실제로는 23명만 나와도 50.7%의 확률로 존재
- 50명인 경우, 97%

### Chaining
- 해쉬 충돌이 일어났을때, value를 해당 해쉬 값에 연쇄적으로 저장

![image](https://user-images.githubusercontent.com/67304980/138029815-1169e7c2-c76b-46fa-bd5c-57e5f132f2da.png)

![image](https://user-images.githubusercontent.com/67304980/138029831-6e3efd27-a68a-4de3-913c-713bcb06c9e0.png)

![image](https://user-images.githubusercontent.com/67304980/138029851-c88fdc52-1b16-4912-a0b3-6f42d5b88e66.png)

![image](https://user-images.githubusercontent.com/67304980/138029872-e220de13-cbdb-4246-a230-2c43fb875ebd.png)


### Open Addressing
- 충돌 발생시 다른 버킷에 데이터를 저장
- 선형 탐색
  - 해시 충돌 시 n칸을 건너뛴 다음 버킷에 저장
  - 계산 단순
  - 검색 시간이 많이 소요(건너뛰며 버킷이 비었는지 유무를 계속 확인)
  - 데이터들이 특정 위치에만 밀집(clustering)

![image](https://user-images.githubusercontent.com/67304980/138030070-38f56d73-1bce-4eec-a10b-74041e4a2689.png)

![image](https://user-images.githubusercontent.com/67304980/138030083-b1a22d80-ecc3-45bb-a464-6bb78fecae8c.png)

- 제곱 탐색
  - N<sup>2</sup>칸(1,4,9,16,...)을 건너뛴 버킷에 데이터를 저장
  - 데이터들이 특정 위치에 밀집하는 문제를 해결
  - 하지만 처음 해시 값이 같아면 여전히..

- 이중 해시
  - 해시 값에 다른 해시 함수를 한번 더 적용
  - Hashfunction1() : 최초의 해시 값을 구함
  - Hashfunction2() : 충돌 발생시 이동 폭을 구함
  - 최초 해시 값이 같더라도 이동 폭이 다르기 때문에 clustering 문제 해결 가능

## 해시 구현

![image](https://user-images.githubusercontent.com/67304980/138031211-26c08249-90d7-4e72-b539-ec290d4a774b.png)

![image](https://user-images.githubusercontent.com/67304980/138031227-cb732ff9-aa7b-47a4-9a8d-51f275e068d4.png)

![image](https://user-images.githubusercontent.com/67304980/138031246-cd095283-a77e-48dc-bfb8-9d6ba49aa24c.png)

![image](https://user-images.githubusercontent.com/67304980/138031267-8671772f-affb-4516-9bf4-7461246fa097.png)

![image](https://user-images.githubusercontent.com/67304980/138031278-272bf0be-70d4-428c-889b-082331c41dc2.png)

![image](https://user-images.githubusercontent.com/67304980/138031290-9dd2c3c2-d190-4639-8c32-d78c73b634b0.png)









