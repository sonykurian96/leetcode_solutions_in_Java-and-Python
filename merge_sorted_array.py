class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        length = len(nums1)
        
        for index in reversed(range(length)):
            print(index)
            if nums1[index] == 0 and index >= m:
                del nums1[index]
        
        for item in nums2:
            nums1.append(item)
            
        nums1.sort()
        
'''
Runtime: 72 ms, faster than 19.84% of Python3 online submissions for Merge Sorted Array.
Memory Usage: 14.2 MB, less than 5.54% of Python3 online submissions for Merge Sorted Array.
''' 

