/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let size = nums.length-1;
    for(let i=0; i<size; i++){
        let temp = 1;
        while(nums[i] !== undefined && nums[i] === nums[temp+i]){
            
            temp++;
        }
        nums.splice(i,temp-1);
    }
};