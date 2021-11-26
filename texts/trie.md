## 트라이

- 트라이는 효율적인 문자열 저장 및 탐색이 가능한 자료구조 형태이다
- K-진 트리 구조를 통해 문자열을 저장한다
- 영어사전의 방식을 차용했다. game이라는 단어를 찾는다면 우리는 g를 찾고 순서대로 a, m, e를 찾는데 이를 트리형식으로 구현한 것이다
- 맨 앞의 접두어부터 시작하여 단어 전체를 찾아가는 과정이므로 접두사 트리라고도 한다
- 트라이는 문자열 저장을 위한 공간을 많이 쓰지만 탐색에 매우 효율적이라는 특성을 갖는다
- 최대 문자열 길이 m일때 문자의 개수와 무관하게 시간복잡도는 O(m)
  - 각 문자 하나를 배열의 위치로 지정하여 문자열 하나 찾을 때 O(1)이므로 길이만큼의 시간만 소요한다
  - 만약 문자열 길이가 너무 커서 Map 등을 이용해 동적할당을 해야 하는 경우 O(mlogn)만큼 소요할 수 있다

다음과 같은 문자열 6개가 있는데, 이를 K-진 트리 형태 구조로 표현한다면 어떨까?
["bar", "bag", "bark", "dog", "do", "door"]

![image](https://user-images.githubusercontent.com/67304980/143616880-4aecb764-e39d-45f4-bd03-3e256e5ee4d3.png)

### 트라이 구현

#### 1. 생성자 / 클래스 정의

루트 노드는 아무런 접두사도 포함하지 않고 모든 문자열의 접두사들을 자식 배열로 갖고 있어야 한다. 아래 코드를 참고하면
Trie 클래스의 생성자는 루트 노드의 내용을 정의한다. Node 클래스는 각 Node 정보를 정의한 클래스로 자신의 문자, 연결되는
문자들의 정보를 갖고 있고 문자열이 완성되는가 여부 또한 저장하고 있다

```
public class Trie {

    Node root;
    static final int ALPHABET_SIZE = 26; // a-z는 26개
    public Trie(){
        this.root = new Node();
        this.root.val = ' ';
    }
    
    private static class Node{
        Node[] child = new Node[ALPHABET_SIZE]; // 뒤로 연결되는 문자열 a-z 소문자를 index화하여 저장하는 배열(26개)
        boolean isTerminal = false;  // 현재 노드가 문자 완성이 되는 노드인지 여부
        int childNum = 0;            // 현재 노드에 연결된 문자열의 개수
        char val;                    // 현재 노드의 값
    }
}
```

#### 2. 문자열 삽입

charToInt 메서드는 각 문자열의 1개 단어를 int형 숫자로 변환해주는 메서드이다. insert 메서드는 전체 문자열을 쪼개서
각 노드에 저장하는 메서드이다

```
private int charToInt(char c){
        return c - 'a'; // 여기서는 소문자만 있으므로 'a'를 빼면 된다.
    }

    public void insert(String str){
        int length = str.length();
        Node current = this.root;       // 루트 부터 시작해서 내려감
        for(int i=0; i < length; i++){
            char c = str.charAt(i);      // 전체 문자열의 일부 단어 추출
            int num = this.charToInt(c); // 추출한 단어를 숫자로 변환

            if(current.child[num] == null){     // 기존에 null이면 연결 문자열로 처음 추가되는 것
                current.child[num] = new Node();
                current.child[num].val = c;
                current.childNum++;
            }

            current = current.child[num];       // 자식 노드로 넘어감
        }
        current.isTerminal = true;
    }

```

#### 3. 찾기

단어를 저장했으면 저장되어 있는지 확인할 수 있어야 한다. 이를 find 메서드를 통해 구현한다

```
// 반복문으로 노드를 순환하여 문자열 존재 여부 판단
    public boolean find(tring str){
        int length = str.length();
        Node current = this.root; # 현재 노드 설정
        
        for(int i=0; i < length; i++){
        	char c = str.charAt(i);
            int num = this.charToInt(c);
            if(current.child[num] == null){ // 문자열의 일부를 추출했는데 null 이라면 false 반환
            	return false;
            }
            current = current.child[num];
        }
        return current != null && current.isTerminal; // 문자열의 마지막이라면 true
    }
```

#### 4. 전체 저장된 문자열 내역 print하기

모든 저장된 단어의 내역을 알기 쉽게 프린트할 수 있도록 하는 메서드를 구현할 수 있다.

```
private char intToChar(int i){
        return (char)(i + (int)'a');
    }

    public void printTrie(){ // 사용자가 간편히 호출만 하면 되는 메소드
        this.printTrie(this.root, 0, new StringBuilder());
    }

    // 내부에서 재귀적으로 순환하여 노드에 저장된 값들 추출해 프린트
    private void printTrie(Node node, int idx, StringBuilder sb){
        Node current = node;
        Node[] child = current.child;
        StringBuilder builder = new StringBuilder(sb);

        // 루트 노드에는 저장된 것이 없으므로 그 외의 경우에만 append
        if(!current.equals(this.root)){
            builder.append(intToChar(idx));
        }

        // 완성 노드라면 프린팅하면 된다.
        if(current.isTerminal){
            System.out.println(builder);
        }

        // 연결된 노드들을 순환하기 위해 반복문 사용
        for(int i=0; i < ALPHABET_SIZE; i++){
            // null 이라면 거기에는 저장된 것이 없다는 의미이므로 건너 뜀
            if(current.child[i] == null){
                continue;
            }
            printTrie(child[i], i, builder); // 재귀적으로 순환
        }
    }
```

#### 5. 삭제하기

삭제는 재귀적으로 bottom-up 방식으로 진행된다. 

1) 삭제할 문자가 다른 문자의 접두사인 경우 isTerminal을 false로 변경
2) 삭제할 문자가 Unique하여 다른 문자와 연관이 없는 경우는 관련 모든 노드를 삭제
3) 삭제할 문자의 일부가 전체 삭제 문자의 접두사인 경우는 다른 문자에 영향가지 않는 곳까지만 삭제

```
// 사용자가 호출 시 사용하는 메소드
    public void delete(String str){
        delete(this.root, str, 0);
    }

    // 내부적으로 재귀를 통해 삭제를 진행하는 메소드
    private void delete(Node current, String str, int idx){
        int leng = str.length();

        // 자식이 없는데 string의 length의 끝까지 오지 않았다면 예외 발생
        // 끝까지 갔는데 해당 노드가 terminal가 아니었다면 해당 단어를 저장하지 않은 것이므로 예외 발생
        if((current.childNum == 0 && idx != leng) || (idx == leng && !current.isTerminal)) {
            throw new NoSuchElementException("Value " + str + " does not exist in Trie!");
        }

        // 문자열의 마지막에 다다른 경우
        if(idx == leng){
            current.isTerminal = false;

            // 자식이 없는데 문자의 마지막이었다면 해당 문자만 저장된 것이므로 null 처리
            if(current.childNum == 0){
                current = null;
            }
        } else {
            char c = str.charAt(idx);
            int num = charToInt(c);

            // 삭제 후 돌아오는 부분
            delete(current.child[num], str,idx+1);

            // child가 null처리 되었다면 자식 노드의 수가 하나 줄어든 것이므로 -- 처리
            if(current.child[num] == null) current.childNum--;

            // 현재 노드의 자식이 없고, 단어의 마지막도 아니라면 삭제해야 한다.
            if(current.childNum == 0 && !current.isTerminal){
                current = null;
            }
        }
    }
```



