public class EnumExample {
    public enum Season{Spring,Summer,Winter,Fall,RainnyDays};
    public enum Days{monday,tuseday,wednesday}

    public static void main(String[] args) {
        for (Season s: Season.values()){
            System.out.println(s);


        }
        for (Days d: Days.values()) {
            System.out.println(d);
        }
    }
}
