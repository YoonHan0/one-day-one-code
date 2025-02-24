# 알고리즘 문제를 풀면서 알게 된 문법들 정리

<br />

## 카드뭉치 ([No.159994](https://school.programmers.co.kr/learn/courses/30/lessons/159994))

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

<br />
<br />

---

<br />

## 원시 타입과 참조 타입

``` java

int[] arr1 = {1, 2, 3, 4, 5, 6};
List<int[]> list1 = Arrays.asList(arr1);

String[] arr2 = {"1", "2", "3", "4", "5", "6"};
List<String> list2 = Arrays.asList(arr2);

```
위 코드에서 `arr1`, `arr2` 두 배열 모두 `Arrays.asList()`를 이용해 리스트 타입으로 변환했는데 왜 반환되는 타입이 다르게 생긴걸까?

<br />

### 우선, Arrays.asList() 란❓
`Arrays.asList()`는 **배열을 리스트로 변환하는 메서드이다.** <br />
배열의 원소 타입에 따라 반환되는 리스트의 타입이 달리진다.

- `int[]` 배열은 배열의 요소가 **원시 타입(primitive type)** 이므로 반환 타입은 `List<int[]>`가 된다.
    - 왜그럴까❓

        `int[]` 배열 자체가 하나의 객체로 취급되기 때문에 배열 자체를 리스트로 감싸는 형태로 반환된다.

- `String[]` 배열은 배열의 요소가 **참조 타입(reference type)** 이기 때문에 배열의 요소들 각각이 하나의 객체로 취급되기 때문에 `List<String>`으로 반환된다.

=> `Arrays.asList()`는 참조 타입이 되는 데이터를 기준으로 리스트로 형변환하는게 아닐까? <br />
`int[]`에서는 배열의 각 요소들이 원시 타입이고, `int[]` 배열 자체가 참조 타입이니 이 배열을 하나의 객체로써 변환하게 되고,<br />
`String[]`에서는 각 요소들이 참조 타입이므로 이 요소들 하나하나를 객체로써 변환한 것이 아닐까

<br />

### 원시 타입과 참조 타입의 차이점

| 특징                  | 원시 타입 (Primitive Type)         | 참조 타입 (Reference Type)   |
|---------------------|-----------------------------------|-----------------------------|
| **저장하는 값**       | 실제 값 자체를 저장               | 객체나 배열의 **주소(참조)**를 저장 |
| **메모리 할당**       | 스택(stack) 메모리에 저장         | 힙(heap) 메모리에 저장      |
| **크기**              | 고정된 크기 (타입에 따라 다름)     | 크기가 가변적 (객체의 크기에 따라 달라짐) |
| **null 값**           | `null`을 가질 수 없음              | `null`을 가질 수 있음       |
| **속성 및 메서드**     | 속성이나 메서드를 가질 수 없음     | 객체나 배열의 속성과 메서드를 가질 수 있음 |
| **기본값**            | `0`, `false`, `null` 없이 기본값 제공 | `null`로 초기화됨           |

<br />

### 원시 타입과 참조 타입 예시

| 타입 종류      | 예시                                       | 설명                                             |
|----------------|--------------------------------------------|--------------------------------------------------|
| **원시 타입**   | `int`, `char`, `boolean`, `float`, `double`  | 기본적인 데이터 타입으로, 값 자체를 저장         |
| **참조 타입**   | `String`, `Integer`, `Double`, `int[]`, `String[]` | 객체나 배열을 다루며, 메모리 주소를 저장         |

<br />

### `Integer`를 사용하자

``` java

int[] arr1 = {1, 2, 3, 4, 5, 6};
List<Integer> list4 = new ArrayList<>();        // 빈 리스트로 선언

    for(int num : arr1) {
        list4.add(num);
    }
System.out.println(list4);

```

<br />
<br />

---