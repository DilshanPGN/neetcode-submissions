class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet set = new HashSet<> ();
        Arrays.stream(nums).forEach(set::add);
        return (set.size() != nums.length);
        
    }
}