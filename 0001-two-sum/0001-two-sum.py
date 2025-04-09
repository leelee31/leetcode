class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dic = {}
        
        for i in range(len(nums)):
            current_num = nums[i]
            complement = target - current_num
            
            if complement in dic:
                return [dic[complement], i]
            
            dic[current_num] = i
        
        return []