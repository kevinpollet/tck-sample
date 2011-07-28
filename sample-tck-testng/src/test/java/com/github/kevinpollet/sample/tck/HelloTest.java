package com.github.kevinpollet.sample.tck;

import com.github.kevinpollet.sample.api.Hello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ServiceLoader;


/**
 * @author Kevin Pollet
 */
public class HelloTest {

   private final Logger logger = LoggerFactory.getLogger(HelloTest.class);
   private Hello implToTest;

   @BeforeTest
   public void setUp() {
      logger.info("[TCK-TESTNG] Discover implementations");

      ServiceLoader<Hello> loader = ServiceLoader.load(Hello.class);
      implToTest = loader.iterator().next();
   }

   @Test
   public void testImplementation() {
      logger.info("[TCK-TESTNG] Test the implementation");

      Assert.assertEquals("Hello", implToTest.sayHello());
   }
}
