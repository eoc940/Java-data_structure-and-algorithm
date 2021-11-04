## 정렬

### 선택 정렬(Selection Sort)
- 인덱스가 정해져 있고 첫번째 인덱스부터 해당 인덱스에 리스트에서 가장 작은 값을 집어넣으면 된다. 그 다음 두 번째 자리에 그 다음 작은 값을 선택해 집어 넣는다. 인덱스가 끝까지 갈때까지 반복한다.

![image](https://user-images.githubusercontent.com/67304980/140302878-16e083fb-ac4b-4704-a2ed-aad3c360d1df.png)
- j는 8부터 탐색하면서 가장 작은 인덱스인 1이라는 값이 있는 자리를 찾는다. minIndex는 2가 된다. 두 값을 스왑하고 i를 1 증가시킨다

![image](https://user-images.githubusercontent.com/67304980/140303053-cd00acf1-ad3f-4092-83b9-4acf1ffb7f3f.png)
- 위와 같은 방식으로 계속하면

![image](https://user-images.githubusercontent.com/67304980/140303092-ba9b8a5b-b464-40c7-8985-e464a1b8629d.png)

- 정렬이 완료된다

### 버블 정렬(Bubble Sort)
- 인접한 두 값을 비교해서 조건에 맞게 스왑하는 식의 정렬이다. 인덱스 0과 1번값 비교하고 정렬, 1과 2 인덱스 값 비교 정렬..... n-1과 n 인덱스 값 비교 이런식으로 정렬을 수행한다. 그러면 맨 마지막 인덱스의 값은 최대값이 들어가는 것을 보장할 수 있다. 그러면 0번 인덱스부터 n-1번 인덱스까지 과정을 반복하면 n-1인덱스의 값에는 두 번째의 최대값이 들어가게 된다. 이런 방식으로 정렬하는 것이다

![image](https://user-images.githubusercontent.com/67304980/140303532-c6e177bb-02d3-4451-9ef7-95f9bca0a2d5.png)

![image](https://user-images.githubusercontent.com/67304980/140303639-c334b8d7-6b2f-476e-ae3a-f4ea0c4e9f9f.png)

- 9(최댓값)이 맨 뒤로 가게 된다

### 삽입 정렬(Insertion Sort)
- 배열의 한 원소인 key라는 값을 우선 갖고 있고, 그 key를 알맞은 자리에 삽입하면 된다. key보다 큰 값은 하나하나씩 밀어버리고 key보다 작거나 같은 값을 만났을 때 그 뒷자리에 삽입하는 것이다

![image](https://user-images.githubusercontent.com/67304980/140304220-3c5affa0-f34c-4ddb-a7a1-58c2d5d9a4b5.png)

- 인덱스 1부터 시작한다. 인덱스가 0이면 그 이전의 것과 비교할 게 없기 때문이다. 8보다 작거나 같은 원소가 발견되지 않았으므로 맨 앞에 삽입한다

![image](https://user-images.githubusercontent.com/67304980/140304404-0ba502a3-b739-44e2-a1b1-f7667da680ad.png)

- 그 다음 key는 1이 된다. 1은 맨 앞에 위치하게 되는데 이미 정렬이 끝난 8,9는 한칸씩 뒤로 밀리게 된다

![image](https://user-images.githubusercontent.com/67304980/140304537-d17bc301-97ce-410c-93b3-5a99ed757f01.png)

- 이러한 방식으로 지속하면 1 2 3 8 9 이렇게 정렬된다


### 복잡도

선택 정렬과 버블 정렬은 항상 n^2의 시간복잡도를 갖지만 삽입정렬은 조금 다르다. 삽입 정렬은 평균적으로 n^2이지만 만약 정렬된 원소들로 구성된 배열이 입력으로 들어오면 n^2의 시간 복잡도를 갖는다. for 루프 안의 반복문이 1회만 실시되고 만다. 바로 현재 키보다 작은 원소를 만나기 때문이다

정렬 알고리즘 | 최적의 경우 | 평균적인 경우 | 최악의 경우
-------------- | ----------- | --------------| ---------
선택 정렬 | n^2 | n^2 | n^2
버블 정렬 | n^2 | n^2 | n^2
삽입 정렬 | n | n^2 | n^2

버블 정렬은 하나의 배열만 사용하므로 공간복잡도는 n이다. 

### Merge Sort
- 하나의 리스트를 두 개의 균등한 리스트로 분할하고 부분 리스트를 합치면서 정렬하여 전체가 정렬되게 하는 방법

![image](https://user-images.githubusercontent.com/67304980/138600401-dcf7c72a-72e1-4768-a1ed-4857c382d5aa.png)

![image](https://user-images.githubusercontent.com/67304980/138600416-b278c6e7-5038-44e8-892c-c2e96285edeb.png)

- 시간복잡도 : O(NlogN)

![image](https://user-images.githubusercontent.com/67304980/138600444-dd8866a0-5861-4173-abbe-3b979baeb7a2.png)

![image](https://user-images.githubusercontent.com/67304980/138600450-6adfc915-a92f-45cb-a218-2c4d4879f86a.png)

![image](https://user-images.githubusercontent.com/67304980/138600464-c6ca8519-c136-4923-8b85-fb98b162df06.png)


### Quick Sort

- 시간복잡도 O(NlogN)
  - 참조 지역성
  - 한번 결정된 pivot 값은 이후의 연산에서 제외

- 추가적인 메모리 공간 사용 X
- 불안정 정렬
- Divide and conquer

![image](https://user-images.githubusercontent.com/67304980/138600534-46289657-3712-4758-8a89-2e343b72031d.png)

![image](https://user-images.githubusercontent.com/67304980/138600540-4007c78c-54e5-41de-a3fb-369c2820723a.png)

![image](https://user-images.githubusercontent.com/67304980/138600553-d899261c-c4a8-4c1b-b6c5-6c4591f1cdcf.png)

![image](https://user-images.githubusercontent.com/67304980/138600562-e3096842-3142-4c83-bbcc-c07c4fc613a0.png)

![image](https://user-images.githubusercontent.com/67304980/138600576-b9bdfd92-32e0-4b6a-830e-dda6c65ed65c.png)

![image](https://user-images.githubusercontent.com/67304980/138600592-77668465-c509-43f3-a07e-dee8684abcf4.png)

![image](https://user-images.githubusercontent.com/67304980/138600597-7fa6bcfd-8936-497d-90a0-c87826428c74.png)


- 시간복잡도는 평균 O(NlogN)이지만, 정렬된 리스트에 pivot이 양 극단의 인덱스로 주어진다면 O(N<sup>2</sup>)이다

![image](https://user-images.githubusercontent.com/67304980/138600845-00b9294a-b243-474e-99a6-35fc395ae11b.png)

![image](https://user-images.githubusercontent.com/67304980/138600849-3891c64a-1c0d-4fa8-b26a-f48d6948d417.png)

![image](https://user-images.githubusercontent.com/67304980/138600852-e2479d71-f1c4-49a2-b052-2ba648094140.png)

![image](https://user-images.githubusercontent.com/67304980/138600859-6dcff3d2-2915-4213-a276-ea07dc5fbf41.png)

![image](https://user-images.githubusercontent.com/67304980/138600866-b4a9696f-50b6-4037-9350-86204f83122e.png)



### Heap Sort
- 힙은 최댓값 및 최솟값을 찾아내는 연산을 빠르게 하기 위해 고안된 완전이진트리를 기본으로 한 자료구조이다
- 크기가 n인 완전이진트리는 크기가 n인 배열을 만드는 것과 같다. 순서 조건만 만족시키면 힙의 구조처럼 사용 가능하다

![image](https://user-images.githubusercontent.com/67304980/140308329-8a8307ce-1ae5-4624-80fe-067f88e62fea.png)

힙으로 만들면

![image](https://user-images.githubusercontent.com/67304980/140308443-4688062f-3a86-4a4d-bede-87f630c30de2.png)

![image](https://user-images.githubusercontent.com/67304980/140308459-0e1c684d-dcc4-4001-8354-0879a4e89dbc.png)

오름차순 정렬시 최대힙을 만들고, 내림차순 정렬시 최소힙을 만들면 된다.
루트 노드를 지우는 방식으로 정렬을 진행하면 된다. 

![image](https://user-images.githubusercontent.com/67304980/140308558-817dca81-c23d-4bfc-bdad-5703f61cc6de.png)

루트 노드와 마지막 노드를 바꿔준다. 그러면 배열에서 최대값이 배열의 맨 마지막으로 가게 된다. 이 15는 정렬이 끝난 것이다. 그 다음부터 뒤에서부터 채워나간다고 생각하면 된다. 

![image](https://user-images.githubusercontent.com/67304980/140308670-767e9882-7fe2-4d7a-a0c3-f5e403dd536c.png)

2는 루트 노드이면 안되므로 힙의 자료구조를 따라 리프 노드까지 이동했다. 그 다음 루트 노드에 있는 14라는 값을 인덱스 14번지에 있는 4와 값을 바꾸고 14를 인덱스 14번지 리스트에 넣어준다. 루트 노드의 4는 힙 자료구조에 따라 제자리를 찾아간다. 이런 방식을 계속 하다 보면 정렬이 완료된다

![image](https://user-images.githubusercontent.com/67304980/140309054-fcca101e-7e4d-4dbe-9de0-c98d52bf97ce.png)

## 퀵, 병합, 힙 정렬 세부사항 비교

### 퀵 정렬
- 구동방식
  - 퀵 정렬은 기준값(pivot)을 중심으로 자료를 왼쪽 부분집합과 오른쪽 부분집합으로 분할한다. 왼쪽 부분집합으로 기준값보다 작은 원소를 이동시키고, 오른쪽 부분집합으로 기준값보다 큰 원소를 이동시킨다. 퀵 정렬은 분할과 정복이라는 작업을 반복하여 수행한다
- 시간복잡도
  - 최선 : 피벗에 의한 원소들의 부분집합이 정확히 n/2개로 2등분 될 경우 nlogn
  - 최악 : 피벗에 의한 원소들의 부분집합이 1개와 n-1개로 분할된다면 n^2
- 활용케이스
  - 메모리가 부족하고(병합정렬은 메모리 부족 시 사용 불가), 배열이 이미 정렬/역정렬 되어있을 가능성 없고(퀵소트 최악의 경우), 동일한 요소의 자리가 바뀌어도 상관 없는 경우(not stable하므로). 퀵 정렬 최악의 경우는 피벗이 항상 유일한 최소 원소이거나 최대 원소일 경우이다. 퀵정렬은 not stable하므로 자리가 바뀌어서는 안 될 경우 in place 정렬을 사용해야 한다

### 힙 정렬
- 구동방식
  - 모든 노드가 힙 속성을 만족하도록 재귀적으로 트리 구조를 만들어 정렬을 완성
- 시간복잡도
  - 이상적인 경우에 퀵정렬과 비교했을 때 똑같이 nlogn이 나오긴 하지만 수행 시간은 퀵정렬보다 평균적으로 느리다. 즉, 데이터의 상태에 따라서 다른 정렬법들에 비해서 조금 느린 편이다. 또한, 안정성(stable)을 보장받지 못한다는 단점이 있다
- 활용케이스
  - 메모리가 부족하고(병합정렬 사용 불가), 배열이 이미 정렬/역정렬되어있을 가능성이 있고(퀵정렬 사용 불가), 같은 원소의 원래 위치가 바뀌어도 상관 없는 경우(힙정렬은 불안정 정렬임) 메모리 측면에서 효율적이다. 또한 항상 nlogn을 보장할 수 있는 것이 좋다. 하지만 단순히 속도만 비교하면 퀵 정렬이 평균적으로 더 빠르다

### 병합 정렬
- 구동방식
  - 리스트를 잘게 쪼갠 뒤 둘씩 크기를 비교해 정렬하고 분리된 리스트를 재귀적으로 합쳐서 정렬을 완성, 분할된 리스트를 저장해둘 공간이 필요해 메모리 소모량이 큰 편이다
- 시간복잡도
  - 분할과정은 매번 반씩 감소하므로 밑이 2인 logn만큼 반복하야 크기가 1인 배열로 분할할 수 있다
- 활용케이스
  - 배열이 이미 정렬되어있을 가능성이 있으며, 메모리가 충분한 경우. 퀵정렬과 달리 피벗이 없으므로 성능 저하 없이 nlogn이다. 병합 정렬은 순차적인 비교를 통해 정렬하므로 linkedlist의 정렬에 효율적이다. 병합정렬은 추가 메모리를 요구하므로, 메모리 효율이 중요한 경우 퀵정렬이 나을 것이다.

#### 복잡도
   항목  | 퀵정렬 | 병합정렬 | 힙정렬
----- | ------ | --------- | -------
특징 | 불안정, 제자리, 피벗 있는 분할정복 | 안정, 제자리, 원본크기 메모리 필요 | 불안정, 제자리, 트리
평균 | nlogn | nlogn | nlogn
최악 | n^2 | nlogn | nlogn
최선 | nlogn | nlogn | nlogn
공간복잡도 | n | n | n

- in place : 입력리스트 내부에서 정렬이 이뤄진다. 반대는 별도 저장공간을 필요로 하는 경우다. 제자리성이라고도 한다
- stable : 같은 원소의 자리가 정렬 이후 바뀌지 않는다(예를 들어 중복 값이 있을 때 중복 값들끼리 순서가 바뀌지 않는다)

- stable 알고리즘 : 삽입정렬, 병합정렬, 버블정렬
- unstable 알고리즘 : 선택정렬, 힙정렬, 쉘정렬, 퀵정렬

- in place 알고리즘 : 삽입정렬, 선택정렬, 버블정렬, 쉘정렬, 힙정렬, 퀵정렬(정의에 따라 not in place라고 볼 수도 있으나 흔히 in place라고 본다)
- not in place 알고리즘 : 병합정렬, counting sort, radix sort, bucket sort


