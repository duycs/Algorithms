/* Shuffle the Array
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/

public int[] Shuffle(int[] nums, int n) {
        var result = new List<int>();
        var numsLeft = new List<int>();
        var numsRight = new List<int>();
        int length = n*2;
        int middlePosition = n;

        for(int i = 0; i < length; i++){
            if(i < middlePosition){
                numsLeft.Add(nums[i]);
            }else {
                numsRight.Add(nums[i]);
            }
        }

        for(int j = 0; j < numsLeft.Count(); j++){
            result.Add(numsLeft[j]);
            result.Add(numsRight[j]);
        }

        return result.ToArray();
 }
