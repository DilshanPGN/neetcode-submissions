class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        Arrays.stream(nums).forEach(set::add);

        return set.size() != nums.length;
    }
}