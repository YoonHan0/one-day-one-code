function solution(lines) {
    let points = new Array(201).fill(0);  // 좌표의 전체 범위(-100 ~ 100), ( -100, -99, ..., 0, ..., 99, 100 )

    for(let [start, end] of lines) {
        for(let i=start; i<end; i++) {    // 프로그래밍에서 구간을 표현할 때 일반적으로 [start, end) 방식(반개구간)을 사용함
            points[i+100]++;
        }
    }
    const result = points.filter(item => item >= 2);
    return result.length;
}