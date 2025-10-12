
public class SimpleLocation {
    // الخصائص (Attributes)
    private double latitude;   // خط العرض
    private double longitude;  // خط الطول

    // الباني (Constructor)
    public SimpleLocation(double lat, double lon) {
        this.latitude = lat;
        this.longitude = lon;
    }

    // دالة لحساب المسافة بين موقعين (Overloaded)
    public double distance(SimpleLocation other) {
        final double earthRadius = 6371; // نصف قطر الأرض بالكيلومتر
        double latDiff = Math.toRadians(other.latitude - this.latitude);
        double lonDiff = Math.toRadians(other.longitude - this.longitude);

        double a = Math.sin(latDiff / 2) * Math.sin(latDiff / 2)
                + Math.cos(Math.toRadians(this.latitude))
                * Math.cos(Math.toRadians(other.latitude))
                * Math.sin(lonDiff / 2) * Math.sin(lonDiff / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return earthRadius * c;
    }

    // دالة أخرى بنفس الاسم لكن مختلفة في المعاملات (Overloading)
    public double distance(double lat, double lon) {
        SimpleLocation other = new SimpleLocation(lat, lon);
        return distance(other);
    }

    // دالة عرض الموقع
    public void displayLocation() {
        System.out.println("Latitude: " + latitude + ", Longitude: " + longitude);
    }

    // إعادة تعريف (Override) لدالة toString()
    @Override
    public String toString() {
        return "SimpleLocation{" + "latitude=" + latitude + ", longitude=" + longitude + '}';
    }

    // دالة main للتجربة
    public static void main(String[] args) {
        // موقعي الأول: كلية تقنية المعلومات - الجمال
        SimpleLocation itCollege = new SimpleLocation(32.8243, 13.1830);

        // موقعي الثاني: مدينة الجمال - طريق المطار
        SimpleLocation myLocation = new SimpleLocation(32.8188, 13.1754);

        // حساب المسافة بين الموقعين
        double distance = myLocation.distance(itCollege);
        System.out.println("المسافة بين كلية تقنية المعلومات الجمال ومدينة الجمال طريق المطار هي: " 
                            + distance + " كم");

        // اختبار override
        System.out.println(myLocation.toString());
    }
}
