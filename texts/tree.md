## 트리

### 이진 트리
- 각 노드가 최대 2개(0-2개)의 자식 노드를 가지는 트리
  - 왼쪽 자식노드 / 오른쪽 자식노드

![image](https://user-images.githubusercontent.com/67304980/138602890-c4c1a2ff-7488-4a23-9a0f-a7e1718ae584.png)

- 정 이진 트리(full binary tree), 엄격한(strict) 이진 트리
  - 모든 노드가 2개의 자식을 가지거나 자식이 없을 때

![image](https://user-images.githubusercontent.com/67304980/138602921-54b80cee-3a58-4775-a422-12947ddd1448.png)

- 포화 이진 트리(Perfect Binary tree)
  - 모든 노드가 2개의 자식을 가지고 leaf 노드가 같은 레벨일 때
  - 높이가 h인 포화 이진 트리에서 노드 갯수는 2<sup>k+1</sup> - 1
  - Leaf 노드의 갯수는 2<sup>h</sup>

![image](https://user-images.githubusercontent.com/67304980/138602976-bac1bb76-384f-4e10-82eb-f8901827eb31.png)

- 완전 이진 트리 Complete Binary Tree
  - 마지막 레벨을 제외하고 모든 노드가 채워져야 함
  - 노드는 왼쪽에서 오른쪽으로 채워짐

![image](https://user-images.githubusercontent.com/67304980/138603003-885bc781-43a4-4b29-883b-9abb205df44c.png)

![image](https://user-images.githubusercontent.com/67304980/138603038-4b9f7451-7440-49b1-8092-bf33f1146fa9.png)

- 이진트리는 일차원 배열로 표현 가능

![image](https://user-images.githubusercontent.com/67304980/138603051-4403746b-deb4-41ca-a894-ade61f97b1f4.png)

![image](https://user-images.githubusercontent.com/67304980/138603068-78bdad7d-4bc8-42ff-a411-edc0c89ea35e.png)

- 이진 트리의 응용
  - 힙
  - 이진 탐색 트리(Binary Search Tree)
  - B-tree
  - AVL트리

### 트리 탐색
- 트리 구조에서 각 노드를 한 번씩 방문하는 과정

- 전위 탐색 preorder
  - 1. 루트 노드 방문
  - 2. 왼쪽 서브 트리를 preorder
  - 3. 오른쪽 서브 트리를 preorder

- 중위 탐색 inorder
  - 1. 왼쪽 서브 트리를 inorder
  - 2. 루트 노드 방문
  - 3. 오른쪽 서브 트리를 inorder

- 후위 탐색 postorder
  - 1. 왼쪽 서브 트리를 postorder
  - 2. 오른쪽 서브 트리를 postorder
  - 3. 루트 노드 방문

![image](https://user-images.githubusercontent.com/67304980/138603411-971b4166-f319-40fe-baf4-8bc97a7f0fe9.png)

![image](https://user-images.githubusercontent.com/67304980/138603416-dcd75fa1-d85a-45d1-a7f6-c9cbaa0af90a.png)











