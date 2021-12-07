package builder;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        User user = User.builder().age(18).weight(80).gender("m").race("europium").occupation("UCU").occupation("Google").build();
        assertEquals("User(name=null, age=18, gender=m, weight=80.0, height=0.0, race=europium, occupations=[UCU, Google])", user.toString());
    }
}