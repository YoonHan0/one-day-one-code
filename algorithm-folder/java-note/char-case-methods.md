## 💡 Java에서 대문자/소문자 확인 및 변환 함수 정리

| 함수 | 설명 | 예제 |
|------|------|------|
| `Character.isUpperCase(c)` | `c`가 대문자인지 확인 | `'A' → true`, `'a' → false` |
| `Character.isLowerCase(c)` | `c`가 소문자인지 확인 | `'a' → true`, `'A' → false` |
| `Character.toUpperCase(c)` | 소문자를 대문자로 변환 | `'a' → 'A'`, `'A' → 'A'` |
| `Character.toLowerCase(c)` | 대문자를 소문자로 변환 | `'A' → 'a'`, `'a' → 'a'` |
| `String.toUpperCase()` | 문자열을 모두 대문자로 변환 | `"Hello" → "HELLO"` |
| `String.toLowerCase()` | 문자열을 모두 소문자로 변환 | `"Hello" → "hello"` |