public class IntersectionArrays {
    public class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            ArrayList<Integer> ar = new ArrayList<Integer>();
            HashSet<Integer> ha = new HashSet<Integer>();
            
            for(int i: nums1){
                ha.add(i);
            }
            
            for(int j: nums2){
                if(ha.contains(j)){
                    ar.add(j);
                    ha.remove(j);
                }
            }
            
            int[] elem = new int[ar.size()];
            for(int i = 0; i<elem.length; i++){
                elem[i] = ar.get(i);
            }
            return elem;
        }
    }
}