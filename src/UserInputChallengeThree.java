public class UserInputChallengeThree {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.26, 0.75));
        System.out.println(getBucketCount(7.25,4.3,2.35));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double wallArea = width * height;
        double paintCovered = (extraBuckets * areaPerBucket);
        int morePaintsNeeded = (int) Math.ceil((wallArea - paintCovered) / areaPerBucket);
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        System.out.println(wallArea);
        System.out.println(paintCovered);
        System.out.println(morePaintsNeeded);

        return morePaintsNeeded;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double wallArea = width * height;
        int paintsNeeded = (int) Math.ceil((wallArea / areaPerBucket));

        return paintsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        int paintsNeeded = (int) Math.ceil((area / areaPerBucket));
        return paintsNeeded;
    }
}
