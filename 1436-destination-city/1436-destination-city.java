class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }
        String answer = "";
        for (String v : map.values()) {
            if (!map.containsKey(v)) {
                answer = v;
                break;
            }
        }
        return answer;
    }
}