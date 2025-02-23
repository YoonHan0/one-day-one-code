## 알고리즘 문제를 풀면서 알게 된 문법들 정리


### 카드뭉치 ([No.159994](https://school.programmers.co.kr/learn/courses/30/lessons/159994))

``` java

public static String solution(String[] cards1, String[] cards2, String[] goal) {
    int x = 0;
    int y = 0;
    boolean result = false;

    /* remove()와 같은 함수를 사용하기 위해서 ArrayList로 형변환 */
    List<String> card1List = Arrays.asList(cards1);
    List<String> goalList = Arrays.asList(goal);

    // [1]
    for(int i=0; i<goalList.size(); i++) {
        String goalChar = goalList.get(i);

        if(x < card1List.size() && goalChar.equals(card1List.get(x))) {
            goalList.remove(i);     // [2]
            x++;
        }
    }

    result = Arrays.equals(cards2, goalList.toArray(new String[0]));

    return result ? "Yes" : "No";
}

```

- [1] 에서의 오류 <br />
for문 내부에서 `remove()`와 같이 요소를 제거하는 작업을 하게 되면 배열의 크기가 줄어들면서 의도한대로 데이터 접근이 어렵게 될 수 있다. <br />

    - 해결방법 <br />
    배열의 뒤에서부터 접근을 하는 방식으로 처리 가능.


- [2] 에서의 오류 <br />
Arrays.asList(cards1)로 만든 card1List는 수정 불가능 <br />
→ 따라서 `goalList.remove(i);`를 호출하면 `UnsupportedOperationException`이 발생합니다.
    - 해결방법 <br />
    ``` java
    List<String> card1List = new ArrayList<>(Arrays.asList(cards1))
    ```
    위처럼 변경하면 가능

    



