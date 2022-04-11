class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = false;
        for(int i=nums1.length-1; i>=0; i--){
            if(nums1[i] == 0 && !flag) continue;
            flag = true;
            list.add(nums1[i]);
        }
        flag = false;
        for(int i=nums2.length-1; i>=0; i--){
            if(nums2[i] == 0 && !flag) continue;
            flag = true;
            list.add(nums2[i]);
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            nums1[i] = list.get(i);
        }
    }
}