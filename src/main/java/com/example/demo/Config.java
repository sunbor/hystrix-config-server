package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.HystrixCommandProperties.ExecutionIsolationStrategy;

@Configuration
@ConfigurationProperties(prefix = "hystrix")
@RestController
public class Config {
	
	@RequestMapping("/test")
	public String connection() {
		return test;
	}
	
	HystrixCommandProperties prop;
	
	
	String test = "aaaaa";
	
	//command properties
	private ExecutionIsolationStrategy executionIsolationStrategy = ExecutionIsolationStrategy.THREAD;
	private int executionTimeoutInMilliseconds;
	private boolean executionTimeoutEnabled;
	private boolean executionIsoloationThreadInterruptOnTimeout;
	private boolean executionIsolationThreatInterruptOnFutureCancel;
	private int executionIsolationSemaphoreMaxConcurrentRequests;
	
	private int fallbackIsolationSemaphoreMaxConcurrentRequests;
	private boolean fallbackEnabled;
	
	private boolean circuitBreakerEnabled;
	private int circuitBreakerRequestVolumeThreshold;
	private int circuitBreakerSleepWindowInMilliseconds;
	private int circuitBreakerErrorThresholdPercentage;
	private boolean circuitBreakerForceOpen;
	private boolean circuitBreakerForceClosed;
	
//	private int metricsRollingStatisticalWindowInMilliseconds;
//	private int metricsRollingStatisticalWindowBuckets;
//	private boolean metricsRollingPercentileEnabled;
//	private int metricsRollingPercentileWindowInMilliseconds;
//	private int metricsRollingPercentileWindowBuckets;
//	private int metricsRollingPercentileBucketSize;
//	private int metricsHealthSnapshotIntervalInMilliseconds;
//	private boolean requestCacheEnabled;
//	private boolean requestLogEnabled;

	//thread pool properties
	private int coreSize;
	private int maximumSize;
	private int maxQueueSize;
	private int queueSizeRejectionThreshold;
	private int keepAliveTimeMinutes;
	private int allowMaximumSizeToDivergeFromCoreSize;

	
//	private int metricsRollingStatisticalWindowInMilliseconds;
//	private int metricsRollingStatisticalWindowBuckets;
	
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	
}
