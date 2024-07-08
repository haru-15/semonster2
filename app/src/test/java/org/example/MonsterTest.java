package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {

    @Test public void appHasAtoString() {
        App classUnderTest = new Monster(1);

        assertNotNull("スライム:レア度[1]", classUnderTest.toString());
    }
}
