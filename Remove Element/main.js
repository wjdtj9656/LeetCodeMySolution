/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let size = nums.length;
    for(let i=size-1; i>=0; i--){
        if(nums.indexOf(val,i) >= 0){
            nums.splice(i,1);
        }
    }
};