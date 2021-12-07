package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().age(18).weight(80).gender("m").race("europium").occupation("UCU").occupation("Google").build();
        System.out.println(user.toString());
    }
}
