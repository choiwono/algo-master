function solution(baseball) {
    var answer = 0;
    // 1000개의 배열의 기본값을 false로 채움
    let list = new Array(1000).fill().map( value => false );

    
}

function isNotOk (number) {
    let res = false;
    let check = {};

    const numberStrings = String(number).split("");

    for(const element of numberStrings) {
        if(element === "0") {
            res = true;
            break;
        }

        if(!check[element]) {
            check[element] = true;
        } else {
            res = true;
            break;
        }
    }
}