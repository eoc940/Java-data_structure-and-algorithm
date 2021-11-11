## List

- 선형적인 자료구조
- 데이터를 일렬로 늘여 놓은 형태
- 순서가 있다

#### 종류
- ArrayList
- LinkedList
  - Single Linked List
  - Double Linked List

## ArrayList
- 배열 기반의 리스트
- 메모리 공간을 연속적으로 사용

![image](https://user-images.githubusercontent.com/67304980/137726816-6cf6c827-91ea-4fd9-8883-0b32608ce8bc.png)

#### 추가

![image](https://user-images.githubusercontent.com/67304980/137726934-2a0fad66-f1ba-4681-95fc-7537e2a6d1ce.png)

![image](https://user-images.githubusercontent.com/67304980/137726954-4dcf72a2-6a1d-4e51-bec2-bdad184e8b13.png)

#### 삽입

![image](https://user-images.githubusercontent.com/67304980/137726997-3032a00c-a6ec-4fc4-81f3-fb5d58497209.png)

![image](https://user-images.githubusercontent.com/67304980/137727028-d54334b2-5b7b-4f82-98aa-738df5f4fc4c.png)

![image](https://user-images.githubusercontent.com/67304980/137727061-14ddfb80-8492-46de-bdd4-e2f18c9238f9.png)

#### 삭제

![image](https://user-images.githubusercontent.com/67304980/137727103-3b3e11f2-0156-4454-a2ee-dbeed5954e02.png)

![image](https://user-images.githubusercontent.com/67304980/137727125-97b22de2-dc73-48f3-846f-4f19a2a096dc.png)

![image](https://user-images.githubusercontent.com/67304980/137727144-c5a72472-111b-4742-9ae5-21f12afe4fb0.png)

#### 탐색 by index

![image](https://user-images.githubusercontent.com/67304980/137727208-c3baa92d-4eec-4bfd-9634-edbb4980911f.png)


## LinkedList

![image](https://user-images.githubusercontent.com/67304980/137727302-e0f02bef-1d07-477e-a36b-6c580cc4dbed.png)


#### 검색

![image](https://user-images.githubusercontent.com/67304980/137727392-1e89c1e1-a1b5-45b5-a4df-5fd325e8ae95.png)

![image](https://user-images.githubusercontent.com/67304980/137727429-7acbedbe-47cc-4dd3-a7c0-3150e37d4682.png)

![image](https://user-images.githubusercontent.com/67304980/137727449-013361a0-0044-4e9d-aa20-2bc0abe5f012.png)

![image](https://user-images.githubusercontent.com/67304980/137727468-a2b5643c-0c2f-4970-9720-48812685e8bd.png)

#### 추가

![image](https://user-images.githubusercontent.com/67304980/137727533-868a352f-dd4f-4abf-adda-cce4dfab665a.png)

![image](https://user-images.githubusercontent.com/67304980/137727560-fd8f0d11-1b5f-49e2-a123-1cdc5e474bc5.png)


#### 삽입

![image](https://user-images.githubusercontent.com/67304980/137727780-1f3db6e4-75b3-4f7c-85ad-732685c58d0b.png)

![image](https://user-images.githubusercontent.com/67304980/137727631-31db2e3c-254c-4d65-b654-e43f80431348.png)

![image](https://user-images.githubusercontent.com/67304980/137727659-b47c8ba7-8e12-43f3-8218-38fbf4cf0c7e.png)

![image](https://user-images.githubusercontent.com/67304980/137727686-8f81e119-c2c8-439f-9e46-954307ee1ce0.png)


#### 삭제

![image](https://user-images.githubusercontent.com/67304980/137727825-9afdc9c7-7f45-4193-96a5-700b9579cd73.png)

![image](https://user-images.githubusercontent.com/67304980/137727871-0049a41d-58bd-4a16-a954-e05060beeda8.png)

![image](https://user-images.githubusercontent.com/67304980/137727919-d128e6fc-d151-4421-897d-e68c3ba7015e.png)

![image](https://user-images.githubusercontent.com/67304980/137727972-8e737a6d-9168-4b79-8cc6-8f5f28fb82bf.png)

### 장점
- 배열의 복사나 재할당없이 데이터 추가 가능
- 유연한 공간

### 단점
- 데이터 접근에 대한 시간이 늘어남

### LinkedList VS Array

![image](https://user-images.githubusercontent.com/67304980/137728157-b9d64378-60c0-46da-baf9-a75f0a2674a7.png)


### LinkedList 구현

![image](https://user-images.githubusercontent.com/67304980/137728327-8a8aa9cc-c682-4a6c-89fe-f7f1bbe039c0.png)

#### add(data)

![image](https://user-images.githubusercontent.com/67304980/137728360-4beef324-24ef-4380-a704-71272954f8bc.png)

![image](https://user-images.githubusercontent.com/67304980/137728394-4a1b21e9-ba96-4491-82f6-279ace430215.png)

![image](https://user-images.githubusercontent.com/67304980/137728512-0686d99f-e415-47ce-9954-283180747f78.png)

![image](https://user-images.githubusercontent.com/67304980/137728540-9b93611c-707c-4fd1-9d03-e1a8261cc43c.png)

#### insert(0, data)

![image](https://user-images.githubusercontent.com/67304980/137728586-3fc5bc94-8f53-4a41-b78c-b17fa3cd8a40.png)

![image](https://user-images.githubusercontent.com/67304980/137728609-64448c60-ea46-418e-a82c-737ec92ff666.png)

![image](https://user-images.githubusercontent.com/67304980/137728646-33111c90-3606-4618-bd60-be71583fc842.png)

![image](https://user-images.githubusercontent.com/67304980/137728669-c9877ae3-13e0-444e-8cb5-b0a0459c6524.png)

![image](https://user-images.githubusercontent.com/67304980/137728695-3409e62a-59dd-43a2-8fa6-78dc79285e8b.png)

![image](https://user-images.githubusercontent.com/67304980/137728774-753219c4-5d48-4e94-947d-04b3f65c679a.png)

![image](https://user-images.githubusercontent.com/67304980/137728801-1d14e3f5-9ab0-4e8d-9edd-0862d3901b90.png)

![image](https://user-images.githubusercontent.com/67304980/137728844-d4c948b4-f6fe-4af8-af80-7e28d6b626d4.png)

#### delete(data)

![image](https://user-images.githubusercontent.com/67304980/137728955-fcd57dba-0224-472b-9d79-06e87a83177a.png)

![image](https://user-images.githubusercontent.com/67304980/137729000-336550a6-51f0-4f2a-bb26-01272b09fe25.png)

![image](https://user-images.githubusercontent.com/67304980/137729019-ed5cb77e-67e1-46ba-ab5d-25680709be94.png)


## DoubleLinkedList

![image](https://user-images.githubusercontent.com/67304980/137729118-3b96fec7-10d5-43ba-bdf5-3860f6378c49.png)

![image](https://user-images.githubusercontent.com/67304980/137729157-5883cb97-16c8-44d1-b4c5-08babad7e2fa.png)

![image](https://user-images.githubusercontent.com/67304980/137729184-a0d66369-1125-4043-aff0-0dd5f91b3e61.png)

![image](https://user-images.githubusercontent.com/67304980/137729212-220977d3-afe9-4ac8-9fca-70ac3a309e05.png)


#### 추가

![image](https://user-images.githubusercontent.com/67304980/137729277-0c295a09-7a60-418d-a419-32bbf91b5f09.png)

![image](https://user-images.githubusercontent.com/67304980/137729287-9555ff42-6f37-4e93-83f7-500a4df49661.png)


#### 검색 by index

![image](https://user-images.githubusercontent.com/67304980/137729325-581df557-cc84-4a91-9f42-cafd7bb9cf4d.png)

![image](https://user-images.githubusercontent.com/67304980/137729348-bf2f6907-1af1-448d-ab06-aecbe8cbce39.png)

![image](https://user-images.githubusercontent.com/67304980/137729369-65e8b462-ae38-4b4e-8dce-e5d47bade64a.png)

![image](https://user-images.githubusercontent.com/67304980/137729407-9bf5bd2d-0d5a-4a07-903d-b5feeb8711bd.png)

![image](https://user-images.githubusercontent.com/67304980/137729449-8b42599f-099d-4853-9c86-0453c52f7939.png)


#### 삽입 by index

![image](https://user-images.githubusercontent.com/67304980/137729697-5df4afd0-4f28-4aaf-8aec-bcf8013607a8.png)

![image](https://user-images.githubusercontent.com/67304980/137729805-4eaf5bae-20e9-44d2-bee9-220a70ae0b84.png)

![image](https://user-images.githubusercontent.com/67304980/137729829-f03deb7d-95db-46f9-ad0b-a5ffa4243cd0.png)

![image](https://user-images.githubusercontent.com/67304980/137729861-a8e36f1e-499a-4f51-b5a3-4fe271e95f62.png)

![image](https://user-images.githubusercontent.com/67304980/137729894-6060b84d-4ec8-409a-85f8-1fd3ca5051e2.png)

![image](https://user-images.githubusercontent.com/67304980/137729924-dd07ade5-18da-4616-9eb7-c1667667584b.png)


#### 삭제 by index

![image](https://user-images.githubusercontent.com/67304980/137730004-1f1298bc-f199-40d7-bc35-127a4c30c2aa.png)

![image](https://user-images.githubusercontent.com/67304980/137730302-dc5e2ab5-3a45-465f-a20a-ff7ed5a0822f.png)

![image](https://user-images.githubusercontent.com/67304980/137730347-bc4f0dc7-35a8-4c78-bdd9-5e7726b27d98.png)

![image](https://user-images.githubusercontent.com/67304980/137730104-39f1136c-f08c-48a3-8c0b-4802820bf4a3.png)



#### [나의 정리]
> 배열(Array)과 연결리스트(LinkedList)에 대해 알아보자. 배열은 같은 자료형을 가진 변수를 하나로 나타낸 것으로 연속된 메모리 공간으로 이루어져 있다. 따라서 지역성을 갖고 있으며 인덱스를 이용하여 표현하는 특징이 있다. 배열은 인덱스를 통한 검색이 용이(random access)하며 연속적이므로 메모리 관리가 편하다. 하지만 한 데이터를 삭제하더라도 배열은 연속해야 하므로 공간이 남게 되고 이는 메모리 낭비로 이어진다. 또한 배열은 정적이므로 배열의 크기를 컴파일 이전에 정해주어야 한다. 컴파일 이후 배열의 크기를 변동할 수 없다. 반면 연결리스트는 순서가 있는 데이터의 집합이며 불연속적으로 메모리 공간을 차지한다. 동적이기 때문에 고정된 크기를 가지지 않으며 인덱스로 접근하지 않고 포인터를 통한(주소값) 접근을 한다. 리스트는 포인터를 통하여 다음 데이터의 위치를 가리키고 있으므로 삽입과 삭제가 용이하다. 메모리 상에서 연속적이지 않고 동적으로 크기가 정해져 있지 않으므로 낭비되는 부분이 없이 메모리 관리의 편리성이 있다. 하지만 인덱스를 통해 접근하지 않기 때문에 검색 성능이 좋지 않고 포인터를 통해 다음 데이터를 가리키므로 추가적인 메모리 공간이 요구된다.







