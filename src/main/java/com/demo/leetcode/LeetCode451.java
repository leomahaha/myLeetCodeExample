package com.demo.leetcode;




import java.util.*;

public class LeetCode451 {
    public static void main(String[] args) {
        LeetCode451 class451 = new LeetCode451();

        System.out.println(class451.frequencySort("tree"));
    }
    public String frequencySort(String s) {
        char[] chars = s.toCharArray();
        Integer[] ints = new Integer['z'+1];
        Map<Object,Integer >  map = new HashMap();
        List<Integer> list = new ArrayList<>();
        Stack stack = new Stack();
        int i =0;
        while(i<chars.length){
            if (stack.contains(chars[i])){
                ints[chars[i]]++;
            }else {
                stack.add(chars[i]);
                ints[chars[i]]=1;
            }
//            list.add(""+chars[i]);
            i++;
        }
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });
//        int max = Integer.parseInt(map.get(chars[0]).toString());
//        String c = "";
//        for (Map.Entry<Object, Integer> entry : map.entrySet()){
//           if (entry.getValue()>max) max = entry.getValue();
//           c = new String(entry.getKey().toString());
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        while(max > 0){
//            stringBuilder.append(c);
//            max--;
//        }
//         s = new String(s.replace(c,""));
//        return stringBuilder.toString()+s;
        list = Arrays.asList(ints);
        Collections.reverse(list);
//        Integer[] ints1 = list.toArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer a :list){
            while(a-->0){
//                stringBuilder.append();
            }
        }
        return stringBuilder.toString();
    }
}
