function solution(board) {
    // 총 수: 25개, 지뢰: 1개, 위험지역: 8개 = 25-(1+8)=16
    /*
    i) 방법1
    - 지뢰(=1)에 대한 위험지역을 0->1로 변경해주는 함수
        - 지뢰의 위치를 찾아냄 -> (x,y)로 정의, 반환값: 배열
        - 반환된 배열의 길이만큼 반복하면서, 위험지역을 계산하여 0->1로 변경
    - 변경된 리스트에서 0의 개수를 카운트하는 함수
        - 배열에서 0의 개수를 카운트해서 리턴
    */
    let index = [];
    for(let i = 0; i < board.length; i++) { 
        for(let j = 0; j < board[i].length; j++){
            if(board[i][j] === 1) {
                index.push({ x: i, y: j });
            }
        }
    }

    // 깊은 복사 (board 배열을 새로운 객체로 복제)
    let result = board.map(row => [...row]);  

    // 위치 계산 함수
    function calLocation (loc, oper, move) {
        if(move === 0) return loc;
        switch(oper) {
            case '+':
                return loc + move;
            case '-':
                return loc - move;
        }
    }

    // 범위 체크 함수
    function isValidPosition(x, y, xLength, yLength) {
        return x >= 0 && x < xLength && y >= 0 && y < yLength;
    }

    // 8방향 (위, 아래, 왼쪽, 오른쪽, 대각선) 
    const directions = [
        [-1, -1], [-1, 0], [-1, 1], 
        [0, -1],          [0, 1], 
        [1, -1], [1, 0], [1, 1]
    ];

    for (let i = 0; i < index.length; i++) {
        let loc = index[i];

        for (let [dx, dy] of directions) {
            let newX = loc.x + dx;
            let newY = loc.y + dy;

            if (isValidPosition(newX, newY, result.length, result[0].length)) {
                result[newX][newY] = 1;
            }
        }
    }

    function countOnes(board) {
        return board.reduce((count, row) => count + row.filter(cell => cell === 0).length, 0);
    }
    return countOnes(result);
}