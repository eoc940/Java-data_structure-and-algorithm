## 빅오 표기법

- 점근 표기법의 특징
  - 가장 큰 영향력이 있는 항만 표시
    - O(N<sup>3</sup> + N<sup>2</sup> + N) -> O(N<sup>3</sup>)
  - 상수항은 무시
    - O(2N + 1) -> O(N)

- Big-O의 특징
  - O(1) < O(logN) < O(N) < O(NlogN) < O(N<sup>2</sup>) < O(2<sup>N</sup>)

  ![image](https://user-images.githubusercontent.com/67304980/136235881-a64d2128-2e21-4dc3-8cd8-4fc6f94b0576.png)


### 공간 복잡도
- 데이터 관리에 필요한 공간
- 데이터 양의 변화에 따른 공간의 변화
- 예상 소요 공간 측정

### 시간 복잡도
- 데이터 처리에 소요되는 시간
- 데이터 양의 변화에 따른 소요 시간의 변화
- 예상 처리 시간을 측정
  - 수 만개 혹은 수 억개의 데이터를 처리해야 한다면?
- 지연 장애가 발생했을 때 왜 발생했는지를 찾을 수 있는 근거


### O(1)
- 입력 데이터의 크기와 상관없이 항상 일정한 시간이 걸리는 알고리즘
  - 배열의 Random Access(인덱스의 크기에 상관없이 걸리는 시간이 같음)
  - Hash


### O(N)
- 입력 데이터의 크기에 비례해서 시간이 소요되는 알고리즘

![image](https://user-images.githubusercontent.com/67304980/136236633-70393d23-05a0-4751-b083-600d8f21223d.png)

### O(N<sup>2</sup>)
- 입력 데이터의 제곱에 비례해서 시간이 소요되는 알고리즘

![image](https://user-images.githubusercontent.com/67304980/136236843-03c232b9-1613-48fe-a493-a828008d8374.png)


### O(logN)
- 이진탐색(Binary search)

![image](https://user-images.githubusercontent.com/67304980/136236988-5abcf27c-8596-4887-9685-98c020480f75.png)
![image](https://user-images.githubusercontent.com/67304980/136237008-dbda56ab-9a24-4deb-abb3-415b0328f2a3.png)
![image](https://user-images.githubusercontent.com/67304980/136237041-d9e420e5-d536-42f0-a5b5-cb9a9a0626f5.png)

### O(NlogN)
- Merge sort

![image](https://user-images.githubusercontent.com/67304980/136237122-e09f5554-6f6b-49e8-80aa-107878211dd3.png)








