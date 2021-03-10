// 1784. Check if Binary String Has at Most One Segment of Ones
// Given a binary string s without leading zeros, return true
// if s contains at most one contiguous segment of ones. Otherwise, return false.


class Solution {
    public boolean checkOnesSegment(String s) {
            return s.split("0").length>1?false:true;
    }
}


Java
by @blackspinner

    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
