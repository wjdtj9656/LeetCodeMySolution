/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    let temp = strs[0];
    let tempNum = 100;
    for(let i=1; i<strs.length; i++){
        let min = 0;
        for(let j=0; j<strs[i].length; j++){
            if(strs[i][j] == strs[0][j]) {
                min++;
            }
            else{
                break;
            }
        }
        tempNum = Math.min(min, tempNum);
    }
    return temp.slice(0,tempNum);
};