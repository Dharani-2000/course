package course;

public class Membership {
    private String enrollment;
    private String course;
    private String extra_fee;
    private String discount;

    public String getCourse() {
        return course;
    }

    public void setCourse(String b) {
        this.course = b;
    }

    public String getExtra_fee() {
        return extra_fee;
    }

    public void setExtra_fee(String c) {
        this.extra_fee = c;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String d) {
        this.discount = d;
    }

}