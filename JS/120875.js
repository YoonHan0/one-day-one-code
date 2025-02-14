/** 평행 */
function solution(dots) {
    // 기울기 구하는 함수
    const slope = (arr1, arr2) => (arr2[1] - arr1[1]) / (arr2[0] - arr1[0]);

    const cases = [
        [0, 1, 2, 3], 
        [0, 3, 1, 2], 
        [0, 2, 1, 3]
    ];

    for(let [a, b, c, d] of cases) {
        if(slope(dots[a], dots[b]) === slope(dots[c], dots[d])) return 1;
    }
    return 0;
}