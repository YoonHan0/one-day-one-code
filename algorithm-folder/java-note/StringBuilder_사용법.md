# StringBuilder 사용법

## 📌 StringBuilder란?
`StringBuilder`는 문자열을 **효율적으로 수정**할 수 있는 클래스입니다.
`String`은 **불변(immutable)**이지만, `StringBuilder`는 **가변(mutable)**이므로 문자열을 직접 변경할 수 있습니다.



## 📌 주요 메서드 정리

| 메서드 | 설명 | 예제 |
|--------|-----|------|
| `append(String s)` | 문자열 추가 | `sb.append("World")` |
| `insert(int offset, String s)` | 특정 위치에 문자열 삽입 | `sb.insert(5, "!!!")` |
| `delete(int start, int end)` | 특정 범위 문자열 삭제 | `sb.delete(5, 8)` |
| `deleteCharAt(int index)` | 특정 문자 1개 삭제 | `sb.deleteCharAt(0)` |
| `replace(int start, int end, String s)` | 특정 범위 문자열 교체 | `sb.replace(0, 5, "Hi")` |
| `reverse()` | 문자열 뒤집기 | `sb.reverse()` |
| `charAt(int index)` | 특정 위치 문자 가져오기 | `sb.charAt(0)` |
| `length()` | 문자열 길이 반환 | `sb.length()` |
| `toString()` | `String`으로 변환 | `sb.toString()` |



### 1. `append(String s)` – 문자열 추가
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb); // Hello World
```
**설명:** 문자열을 끝에 추가합니다.

---

### 2. `insert(int offset, String s)` – 특정 위치에 문자열 삽입
```java
StringBuilder sb = new StringBuilder("Hello");
sb.insert(5, "!!!");
System.out.println(sb); // Hello!!!
```
**설명:** 지정한 위치(`offset`)에 문자열을 삽입합니다.

---

### 3. `delete(int start, int end)` – 특정 범위 문자열 삭제
```java
StringBuilder sb = new StringBuilder("Hello World");
sb.delete(5, 11);
System.out.println(sb); // Hello
```
**설명:** `start`부터 `end-1`까지의 문자를 삭제합니다.

---

### 4. `deleteCharAt(int index)` – 특정 문자 1개 삭제
```java
StringBuilder sb = new StringBuilder("Hello");
sb.deleteCharAt(1);
System.out.println(sb); // Hllo
```
**설명:** 지정한 `index`의 문자 1개만 삭제합니다.

---

### 5. `replace(int start, int end, String s)` – 특정 범위 문자열 교체
```java
StringBuilder sb = new StringBuilder("Hello World");
sb.replace(0, 5, "Hi");
System.out.println(sb); // Hi World
```
**설명:** `start`부터 `end-1`까지의 문자열을 새로운 문자열로 변경합니다.

---

### 6. `reverse()` – 문자열 뒤집기
```java
StringBuilder sb = new StringBuilder("Hello");
sb.reverse();
System.out.println(sb); // olleH
```
**설명:** 문자열을 뒤집습니다.

---

### 7. `charAt(int index)` – 특정 위치 문자 가져오기
```java
StringBuilder sb = new StringBuilder("Hello");
char c = sb.charAt(1);
System.out.println(c); // e
```
**설명:** 지정한 `index` 위치의 문자를 반환합니다.

---

### 8. `length()` – 문자열 길이 반환
```java
StringBuilder sb = new StringBuilder("Hello");
System.out.println(sb.length()); // 5
```
**설명:** 현재 `StringBuilder`의 문자열 길이를 반환합니다.

---

### 9. `toString()` – 문자열(String)로 변환
```java
StringBuilder sb = new StringBuilder("Hello");
String str = sb.toString();
System.out.println(str); // Hello
```
**설명:** `StringBuilder` 객체를 `String`으로 변환합니다.

---

## ✅ 정리
- `StringBuilder`는 **문자열을 직접 수정할 수 있어 성능이 우수**합니다.
- `String` 대신 `StringBuilder`를 사용하면 **메모리 낭비를 줄이고 속도를 향상**시킬 수 있습니다.
- 문자열을 **추가, 삭제, 변경할 때** `StringBuilder`의 다양한 메서드를 활용하면 좋습니다! 🚀

<br />

## 문제 적용
```java
public static int solution(String s) {
    StringBuilder sb = new StringBuilder();

    for(char c : s.toCharArray()) {
        int len = sb.length();
        if(len > 0 && c == sb.charAt(len-1)) {
            sb.deleteCharAt(len-1);
        }
        else {
            sb.append(c);
        }
    }
    return sb.isEmpty() ? 1 : 0;
}
```
`StringBuilder`를 이용해서 스택처럼 구현하였습니다.
파라미터로 받은 `문자열 s`를 `s.toCharArray()`를 이용해 `char[]` 형태로 가져오고
`sb`의 마지막 요소와 `문자 c`와 비교하면서 똑같다면 제거(=pop)하고 다르다면 추가(=push)하는 식으로 처리하였습니다.