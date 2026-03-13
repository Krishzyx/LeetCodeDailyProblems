class Solution {

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        long left = 1;
        long right = (long)1e16;

        while (left < right) {

            long mid = left + (right - left) / 2;

            if (canFinish(mid, mountainHeight, workerTimes))
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    private boolean canFinish(long t, int mountainHeight, int[] workerTimes) {

        long reduced = 0;

        for (int wt : workerTimes) {

            long x = (long)(Math.sqrt(2.0 * t / wt + 0.25) - 0.5);

            reduced += x;

            if (reduced >= mountainHeight)
                return true;
        }

        return false;
    }
}
