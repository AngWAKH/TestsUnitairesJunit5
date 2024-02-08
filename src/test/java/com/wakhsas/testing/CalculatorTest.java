package com.wakhsas.testing;
import org.junit.jupiter.api.*;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;

class CalculatorTest {
private Calculator calculator;
private static Instant startedAt;

@BeforeAll
public static void initStartingTime(){
    System.out.println("Appel avant tous les tests");
    startedAt = Instant.now();
}

@AfterAll
public static void showTestDuration(){
    System.out.println("Appel après tous les tests");
    Instant endedAt = Instant.now();
    long duration = Duration.between(startedAt, endedAt).toMillis();
    System.out.println(MessageFormat.format("Durée des tests : {0} ms", duration));
}


@BeforeEach
//Avant chaque test, initialiser une instance du calculateur.
public void setUp(){
    calculator = new Calculator();
    System.out.println("Appel avant chaque test");
}

@AfterEach
//Après chaque test, mettre la valeur du calculateur à null.
public void undefCalculator(){
    System.out.println("Appel après chaque test");
    calculator = null;
}

    @Test
    public void testAddition() {
        double result = calculator.add(3, 4);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void testSubtraction() {
        double result = calculator.subtract(7, 3);
        Assertions.assertEquals(4, result);
    }
    @Test
    public void testMultiply(){
         double result = calculator.multiply(4, 5);
        Assertions.assertEquals(20, result);
    }


}