/**
 * @param {string} s
 * @return {number}
 */

 // abcabcbb
// bbbbbb
// pwwkew

var lengthOfLongestSubstring = function(s) {
    // 한글자식 넣는데 반복되면 x
    // 한글자식 집어넣다가 앞에 있는 값과 중복되면 x
    let number = 1;
    let strings = s.split("");
    let max = 0;
    let repeat = "";

    for(let i=0; i<strings.length; i++) {
        let s = strings[i];
        repeat += strings[i];
        
        if(s === strings[i+1]) {
            //continue;
            max = Math.max(number, max);
            repeat = repeat.slice(i+1, i+2)
            number = 1;
        } else {
            number++;
        }
        console.log(repeat.includes(strings[i]));
        console.log(number, max);
    }
    //return number;
    //console.log(max);
};

lengthOfLongestSubstring('pwwkew');