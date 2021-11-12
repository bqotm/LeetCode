import java.util.*;
import java.util.stream.Collectors;

public class FindModeinBinarySearchTree {


    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map=new HashMap<>();
        inorder(root, map);
        Map<Integer, Integer> sortedByCount=map.entrySet()
                .stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new
                ));
        Set<Integer> set=new HashSet<>();
        Map.Entry<Integer,Integer> en=sortedByCount.entrySet().iterator().next();
        int a=en.getKey();
        int b=en.getValue();
        for(Map.Entry<Integer, Integer> entry: sortedByCount.entrySet()){
            if(entry.getValue()>=b)
                set.add(entry.getKey());
        }
        int[] arr=set.stream().mapToInt(Number::intValue).toArray();
        return arr;

    }

    public void inorder(TreeNode root, Map<Integer, Integer> map){
        if(root!=null){
            inorder(root.left, map);
            inorder(root.right, map);
            map.put(root.val, map.getOrDefault(root.val, 0)+1);
        }

    }


}
