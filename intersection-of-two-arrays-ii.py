class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        empty = []
        for value in nums1:
            if value in nums2:
                empty.append(value)
                nums2.remove(value)
        return empty
