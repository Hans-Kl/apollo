package com.ctrip.framework.apollo.portal.api;


import com.ctrip.framework.apollo.portal.component.RetryableRestTemplate;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * klh 为子类提供统一的属性注入
 */
public abstract class API {

  @Autowired
  protected RetryableRestTemplate restTemplate;

}
