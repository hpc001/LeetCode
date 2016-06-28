public class IntersectionArraysII {
    public class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            ArrayList<Integer> ar = new ArrayList<Integer>();
            ArrayList<Integer> ha = new ArrayList<Integer>();
            
            for(int i: nums1){
                ha.add(i);
            }
            
            for(int j: nums2){
                if(ha.contains(j)){
                    ar.add(j);
                    ha.remove(ha.indexOf(j));
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