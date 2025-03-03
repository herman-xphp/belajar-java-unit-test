package muslim.dev.test;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariables;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariables;
import org.junit.jupiter.api.condition.EnabledIfSystemProperties;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionTest {

  @Test
  void testSystemProperties() {
    Properties properties = System.getProperties();
    properties.forEach((key, value) -> {
      System.out.println(key + " : " + value);
    });
  }

  @Test
  @EnabledOnOs({ OS.WINDOWS })
  public void testRunOnlyWindows() {

  }

  @Test
  @DisabledOnOs({ OS.WINDOWS })
  public void testDisableRunOnWindows() {

  }

  @Test
  @EnabledOnJre(value = { JRE.JAVA_8 })
  public void onlyRunOnJava8() {

  }

  @Test
  @DisabledOnJre(value = { JRE.JAVA_8 })
  public void disableRunOnJava8() {

  }

  @Test
  @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_21)
  public void onlyRunOnJava11ToJava21() {

  }

  @Test
  @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_21)
  public void disableRunOnJava11ToJava21() {

  }

  @Test
  @EnabledIfSystemProperties({
      @EnabledIfSystemProperty(named = "java.vendor", matches = "Amazon.com Inc.")
  })
  void testEnabledOnJavaVendorAmazon() {

  }

  @Test
  @DisabledIfSystemProperties({
      @DisabledIfSystemProperty(named = "java.vendor", matches = "Amazon.com Inc.")
  })
  void testDisabledOnJavaVendorAmazon() {

  }

  @Test
  @EnabledIfEnvironmentVariables({
      @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
  })
  void testEnabledOnProfileDev() {

  }

  @Test
  @DisabledIfEnvironmentVariables({
      @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
  })
  void testDisabledOnProfileDev() {

  }

}
