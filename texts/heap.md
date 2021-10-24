## 힙

### 우선순위 큐
- 우선순위의 개념을 큐에 도입한 자료 구조
- 데이터들이 우선순위를 가지고 있고 우선순위가 높은 데이터가 먼저 나간다
- 이용 사례
  - 시뮬레이션 시스템
  - 네트워크 트래픽 제어
  - 운영 체제에서 작업 스케줄링
  
### 힙이란?
- 완전 이진 트리의 일종으로 우선순위 큐를 위하여 만들어진 자료구조이다
- 여러 개의 값들 중 최대값, 최소값을 빠르게 찾아내도록 만들어진 자료구조이다
- 힙은 일종의 반정렬 상태(느슨한 정렬 상태)를 유지한다
- 힙 트리에서는 중복된 값을 허용한다

### 힙의 종류
- 최대힙(max heap)
  - 부모 노드의 키 값이 자식 노드의 키 값보다 크거나 같은 완전 이진 트리
- 최소힙(min heap)
  - 부모 노드의 키 값이 자식 노드의 키 값보다 작거나 같은 완전 이진 트리

![image](https://user-images.githubusercontent.com/67304980/138603805-0b2559bd-429d-4c5f-bf80-f33f35439c46.png)

  
### 힙의 삽입

1. 힙에 새로운 요소가 들어오면, 일단 새로운 노드를 힙의 마지막 노드에 이어서 삽입한다
2. 새로운 노드를 부모 노드들과 교환해서 힙의 성질은 만족시킨다

![image](https://user-images.githubusercontent.com/67304980/138603855-cb8f175f-6f9b-4bd4-b644-7060bf4b5572.png)

![image](https://user-images.githubusercontent.com/67304980/138603866-c48b3800-6a2d-4dab-84e9-f6f1090ca9c4.png)



### 힙의 삭제

1. 최대 힙에서 최댓값은 루트 노드이므로 루트 노드가 삭제된다. 최대 힙(max heap)에서 삭제 연ㅅ나은 최댓값을 가진 요소를 삭제하는 것이다.
2. 삭제도니 루트 노드에는 힙의 마지막 노드를 가져온다
3. 힙을 재구성한다

![image](https://user-images.githubusercontent.com/67304980/138603935-9ee98d74-5417-441f-a5d4-e0281f4c2464.png)

![image](https://user-images.githubusercontent.com/67304980/138603941-2f8289d0-401f-45c7-bcca-814880ab77d8.png)










참조 : https://gmlwjd9405.github.io/2018/05/10/data-structure-heap.html
