class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] startSplitedArray = startTime.split(":");
        String[] endSplitedArray = endTime.split(":");

        int totalSecondsDiff = 0;

        int hoursToSeconds = (Integer.valueOf(endSplitedArray[0]) - Integer.valueOf(startSplitedArray[0])) * 60 * 60;
        int minutesToSeconds = (Integer.valueOf(endSplitedArray[1]) - Integer.valueOf(startSplitedArray[1])) * 60;
        int seconds = Integer.valueOf(endSplitedArray[2]) - Integer.valueOf(startSplitedArray[2]);

        return hoursToSeconds + minutesToSeconds + seconds;
    }
}