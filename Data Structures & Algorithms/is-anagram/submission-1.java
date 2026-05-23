class Solution {
    public boolean isAnagram(String s, String t) {
        var sCharCount = s.length();
        var tCharCount = t.length();
        if (sCharCount != tCharCount) {
            return false;
        }

        Map<Character, Integer> sMap = HashMap.newHashMap(sCharCount);
        Map<Character, Integer> tMap = HashMap.newHashMap(tCharCount);

        for (int i = 0; i < sCharCount; i++) {
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);

            sMap.put(sChar, sMap.getOrDefault(sChar, 0) + 1);
            tMap.put(tChar, tMap.getOrDefault(tChar, 0) + 1);
        }

        // compare maps - without using map equals
        if (sMap.size() != tMap.size())
            return false;

        for (Map.Entry<Character, Integer> keyValuePair : sMap.entrySet()) {
            Character key = keyValuePair.getKey();
            Integer value = keyValuePair.getValue();

            Integer tValue = tMap.get(key);

            if (tValue == null || !tValue.equals(value))
                return false;
        }

        return true;
    }
}
