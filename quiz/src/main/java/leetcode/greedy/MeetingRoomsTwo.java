package leetcode.greedy;

import java.util.Arrays;

public class MeetingRoomsTwo {

    static class Solution {
        public int minMeetingRooms(int[][] intervals) {

            // if input length is zero, then return 0
            if (intervals.length == 0) return 0;

            final int reservedRoomCount = intervals.length;

            int[] startAt = new int[reservedRoomCount];
            int[] endAt = new int[reservedRoomCount];

            int cursor = 0;

            for (int[] interval : intervals) {
                startAt[cursor] = interval[0];
                endAt[cursor] = interval[1];
                cursor++;
            }

            Arrays.sort(startAt);
            Arrays.sort(endAt);

            // reset cursor count
            cursor = 0;

            int endAtCursor = 0;

            while (reservedRoomCount > cursor) {
                if(startAt[cursor] >= endAt[endAtCursor]) {
                    endAtCursor++;
                }
                cursor++;
            }
            return reservedRoomCount - endAtCursor;
        }
    }
}
