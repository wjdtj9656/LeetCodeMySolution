/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    const str = String(x);
    const size = str.length;
    for(let i=0; i<size/2; i++){
        if(str[i] != str[size-1-i]) return false;
    }
    return true;
};