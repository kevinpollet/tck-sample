package com.github.kevinpollet.sample.tck;

import com.github.kevinpollet.sample.api.Hello;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ServiceLoader;

import static org.junit.Assert.assertEquals;

/**
 * @author Kevin Pollet
 */
public class HelloTest {

   private final Logger logger = LoggerFactory.getLogger(HelloTest.class);
   private Hello implToTest;


   @Before
   public void setUp() {
      logger.info("[TCK] Discover implementations");

      ServiceLoader<Hello> loader = ServiceLoader.load(Hello.class);
      implToTest = loader.iterator().next();
   }

   @Test
   public void testImplementation() {
      logger.info("[TCK] Test the implementation");

      assertEquals("Hello", implToTest.sayHello());
   }
}
