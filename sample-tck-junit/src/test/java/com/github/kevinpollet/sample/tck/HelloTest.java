package com.github.kevinpollet.sample.tck;

import com.github.kevinpollet.sample.api.Hello;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ServiceLoader;


/**
 * @author Kevin Pollet
 */
public class HelloTest {

   private final Logger logger = LoggerFactory.getLogger(HelloTest.class);
   private Hello implToTest;

   @Before
   public void setUp() {
      logger.info("[TCK-JUNIT] Discover implementations");

      ServiceLoader<Hello> loader = ServiceLoader.load(Hello.class);
      implToTest = loader.iterator().next();
   }

   @Test
   public void testImplementation() {
      logger.info("[TCK-JUNIT] Test the implementation");

      Assert.assertEquals("Hello", implToTest.sayHello());
   }
}
