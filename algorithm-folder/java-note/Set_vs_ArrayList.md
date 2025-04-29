## ArrayList.contains() vs Set.contains()

### ❌ ArrayList.contains() 코드
```java
String s = "[](){}";
String[] splitS = s.split("");
String[] openStr = {"(", "{", "["};

for(String item : splitS) {
    if(Arrays.asList(openStr).contains(item)) {
        ...
    }
    ...
}
```
- 메번 `List`를 새로 만들어서 사용
- 시간복잡도 O(n)

<br />

### ✅ Set.contains() 코드
```java
String s = "[](){}";
String[] splitS = s.split("");
Set<String> openStr = Set.of("(", "{", "[");

for(String item : splitS) {
    if(openStr.contains("(")) {
        ...
    }
    ...
}
```
- **시간복잡도 O(1)**

<br />
<br />

## `Set` 탐색의 시간복잡도는 왜 O(1)이 될까?

Java에서 `Set`의 구현체는 `HashSet`, `TreeSet`, `LinkedHashSet`, ...등 다양하게 있으나 주로 사용하는 `HashSet`으로 설명을 하자면 <br />
(`Set.of(...)`로 만들었을 때도 `HashSet`과 동일하진 않지만 내부는 비슷하게 동작)

<br />

HashSet은 데이터를 저장할 때 Hash Table 자료구조를 사용합니다.

<br />

### Hash Table이란?
- key value 구조로 이루어져 있습니다.
- 각각의 key값에 해시 함수를 적용해 배열의 고유한 index를 생성하고, 이 index를 활용해 값을 저장하거나 검색하게 됩니다.
- 해시 함수를 거치는 모든 값들은 고유한 해시 값을 가지게 됩니다.

<br />

### 코드에 적용하면
```java
Set<String> openStr = Set.of("(", "{", "[");
```
`"("`, `"{"`, `"["` 각각에 대해 해시값을 만들어서 테이블에 저장합니다.

<br />

```java
if(openStr.contains("(")) { ... }
```
- 문자열(`"("`)이 들어오면 바로 해시값을 계산해서 테이블에서 해당 위치를 검사합니다.
- 리스트처럼 앞에서부터 하나씩 비교하는게 아니라, 바로 찾아가기 때문에 O(1) 입니다.

<br />
<br />

## 추가로 알면 좋을 내용
- 문자열 비교가 아니라, **Character 타입 (char)** 으로 비교하면 더 빠르게 처리할 수 있습니다.
    
    (`'('`, `'{'`, `'['` 이런 식으로)
- `String`은 내부적으로 **equals 비교** (문자 하나 하나 비교)를 하지만, `char`는 **primitive** 값이기에 단순 비교가 됩니다.