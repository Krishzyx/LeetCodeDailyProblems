public class Solution {

    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;

        // Create a list from the gifts array and sort it
        List<Integer> sortedGifts = new ArrayList<>();
        for (int gift : gifts) {
            sortedGifts.add(gift);
        }
        Collections.sort(sortedGifts);

        // Perform the operation k times
        for (int i = 0; i < k; i++) {
            // Get the largest element (last element in the sorted list)
            int maxElement = sortedGifts.get(n - 1);
            sortedGifts.remove(n - 1);

            // Calculate the square root of the max element
            int sqrtElement = (int) Math.floor(Math.sqrt(maxElement));

            // Find the index where the square root should be inserted
            int spotOfSqrt = Collections.binarySearch(sortedGifts, sqrtElement);

            // If the value isn't found, binarySearch returns a negative index
            if (spotOfSqrt < 0) {
                spotOfSqrt = -(spotOfSqrt + 1);
            }

            sortedGifts.add(spotOfSqrt, sqrtElement); // Insert the square root at the correct index
        }

        // Calculate the sum of the remaining gifts in the array
        long numberOfRemainingGifts = 0;
        for (int gift : sortedGifts) {
            numberOfRemainingGifts += gift;
        }

        return numberOfRemainingGifts;
    }
}
