x = 122

def isPalindrome( x: int):
    s = str(x)
    for i in range(int(len(s)/2)):
    	if s[i] != s[len(s)-i-1]:
    		return False
    return True

print(isPalindrome(x))
