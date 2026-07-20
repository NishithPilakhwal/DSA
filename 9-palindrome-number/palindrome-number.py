class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x<0:
         return False
        m = str(x)
        hi = ""
        for i in range(len(m)-1,-1,-1):
         hi = hi + m[i]
         
        k = int(hi)
        if k == x:
         return True
        else:
         return False
