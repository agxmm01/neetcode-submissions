class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        List<Integer> sizes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(String str : strs) sizes.add(str.length());
        for(int size : sizes) sb.append(size).append(',');
        sb.append('#');
        for(String str : strs) sb.append(str);
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while(str.charAt(i) != '#') {
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i) != ',') {
                sb.append(str.charAt(i));
                i++;
            }

            sizes.add(Integer.parseInt(sb.toString()));
            i++;
        }
        i++;
        for(int size : sizes) {
            result.add(str.substring(i, i + size));
            i += size;
        }
        return result;
    }
}
