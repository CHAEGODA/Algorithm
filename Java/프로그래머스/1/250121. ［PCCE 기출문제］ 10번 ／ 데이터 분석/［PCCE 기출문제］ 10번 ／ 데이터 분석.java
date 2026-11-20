import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        int extIndex = map.get(ext);
        int sortIndex = map.get(sort_by);

        List<int[]> list = new ArrayList<>();

        for (int[] d : data) {
            if (d[extIndex] < val_ext) {
                list.add(d);
            }
        }

        list.sort((a, b) -> Integer.compare(a[sortIndex], b[sortIndex]));
        return list.toArray(new int[list.size()][]);
    }
}