/*

Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
                
        if(numRows == 0){
            return result;
        }
                 
        List<Integer> prev = new ArrayList<>();
        List<Integer> current;
        
        for(int i=0; i<numRows; i++){
            current = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    current.add(1);
                }
                else{
                    current.add(prev.get(j-1)+prev.get(j));
                }                
            }
            prev = current;
            result.add(current);
        }
        
        return result;
    }
}
