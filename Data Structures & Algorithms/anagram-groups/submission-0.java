class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String keyString = new String(chars);
            if(!map.containsKey(keyString)) map.put(keyString, new ArrayList<>());
            map.get(keyString).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
