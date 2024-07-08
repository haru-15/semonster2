package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
    @Test public void appHasAsummonmonster() {
        App classUnderTest = new Monster();
        assertNotNull("スライム", classUnderTest.summonMonster(1));
    }

    @Test public void appHasAtoString() {
        App classUnderTest = new Monster();
        classUnderTest.name = "スライム";
        classUnderTest.rare = 2;
        assertNotNull("スライム:レア度[2]", classUnderTest.toString());
    }
}
