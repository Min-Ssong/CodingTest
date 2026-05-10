# 두 개 뽑아서 더하기

- 출처: Programmers Lv.1
- URL: https://school.programmers.co.kr/learn/courses/30/lessons/68644
- 유형: (프로그래머스 분류 확인 후 기재 — 완전탐색/구현 계열)
- 풀이 시간: 30분 ~ 1시간
- 해설 참고: 아니오 (자바 syntax 부분만 외부 도움)

## 접근 방법

배열에서 서로 다른 인덱스 두 개를 뽑아 합산한 값을 중복 없이 오름차순으로 반환.

- N ≤ 100이라 O(N²) 이중 for문 허용 → 완전탐색
- 합의 중복 제거에 `HashSet<Integer>` 사용 (삽입 평균 O(1))
- 마지막에 한 번 정렬 후 `int[]` 변환

`TreeSet`도 가능하지만 삽입이 잦은 패턴이라 HashSet + 마지막 정렬 쪽이 효율 면에서 유리.

## 막힌 부분

`Set<Integer>` → `int[]` 변환에서 막혔다. 자바 제네릭이 원시 타입을 못 받아서
`set.toArray()`(Object[] 반환)나 `set.toArray(new Integer[0])`(Integer[] 반환) 모두 `int[]`로 직접 변환 안 됨.
표준 관용구가 따로 있다는 걸 몰랐다.

## 배운 점

- **`Set<Integer>` → `int[]` 변환 관용구**:
```java
  set.stream().mapToInt(Integer::intValue).sorted().toArray()
```
- `Stream<Integer>` → `IntStream` 변환은 `mapToInt(Integer::intValue)`
- `IntStream.toArray()`는 `int[]` 반환 (`Stream<T>.toArray()`는 `Object[]`)
- **Stream 체인 순서**: `sorted()`를 `mapToInt` 뒤에 두면 박싱 없이 원시 int로 정렬되어 미세하게 빠름
- **프로그래머스 메서드 시그니처**: `public static int[] solution`도 채점 통과되지만 표준 템플릿은 인스턴스 메서드(`public int[] solution`). 다음부터 `static` 제거

## 시간복잡도

- 이중 for문: O(N²)
- HashSet 삽입: 평균 O(1)
- 정렬: O(M log M), M ≤ N(N-1)/2
- 전체: O(N² log N)

N ≤ 100이라 여유 충분 (실측 2.5~7.2ms).

## 채점 결과

정확성 100.0 / 100.0, 테스트 9개 모두 통과 (2.53~7.21ms, 74.2~79.5MB)