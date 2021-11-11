## 그래프
- Vertex(정점)과 edge(간선)로 구성된 자료구조

![image](https://user-images.githubusercontent.com/67304980/140488566-85375c47-aa66-416c-a727-071812bf38cf.png)

#### 그래프의 예시
- 네비게이션 길찾기
- 게임 내 캐릭터 이동
- 지식 그래프

### 그래프의 종류

- 방향 그래프
  - 정점과 간선의 연결관계에 있어 방향성이 포함된 그래프

![image](https://user-images.githubusercontent.com/67304980/140488959-c13bb70f-2e19-4481-a7de-9b965934aad7.png)

- 무방향 그래프
  - 정점과 간선의 연결관계에 있어 방향성이 없는 그래프

![image](https://user-images.githubusercontent.com/67304980/140489060-ea646bec-68ed-45ae-a575-90d2c63eab7b.png)

- 가중치 그래프
  - 간선에 가증치가 적용된 것이다. 지하철이 대표적인 예라고 할 수 있다
  - 방향, 무방향 둘 다 적용될 수 있다

![image](https://user-images.githubusercontent.com/67304980/140489430-4dee5943-13c7-4917-bd1d-32e65584c145.png)


### 그래프 구현 방법

#### 인접행렬
![image](https://user-images.githubusercontent.com/67304980/140489521-162657d5-5b4e-46f3-9575-fece253efd49.png)

- 장점
  - 2차원 배열 안에 모든 정점들의 간선 정보를 담기 때문에 배열의 위치를 확인하면 두 점에 대한 연결 정보를 조회할 때 
O(1)의 시간 복잡도면 가능하다
  - 구현이 비교적 간편하다
- 단점
  - 모든 정점에 대해 간선 정보를 대입해야 하므로 O(n<sup>2</sup>)의 시간복잡도가 소요된다
  - 무조건 2차원 배열이 필요하기에 필요 이상의 공간이 낭비된다

#### 인접리스트
![image](https://user-images.githubusercontent.com/67304980/140490212-9a520a3c-d0dd-4d6a-8e57-9c9a560e4e83.png)

- 장점
  - 정점들의 연결 정보를 탐색할 때 O(n)의 시간이면 가능하다
  - 필요한 만큼의 공간만 사용하기 때문에 공간의 낭비가 적다
- 단점
  - 특정 두 점이 연결되었는지 확인하려면 인접행렬에 비해 시간이 오래 걸린다(배열보다 search 속도 느림)
  - 구현이 비교적 어렵다










