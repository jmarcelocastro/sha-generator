package com.marcelocastro;

import com.marcelocastro.security.util.SHAUtil;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

  @Test
  public void sameResultProducedForSha1() {

    String helloWorldInSHA1 = "2AAE6C35C94FCFB415DBE95F408B9CE91EE846ED";
    Assert.assertEquals(helloWorldInSHA1, SHAUtil.sha1("hello world"));
  }

  @Test
  public void differentResultProducedForSha1() {

    String helloWorldInSHA1 = "2AAE6C35C94FCFB415DBE95F408B9CE91EE846ED";
    Assert.assertNotEquals(helloWorldInSHA1, SHAUtil.sha1("hello mundo"));
  }


}
