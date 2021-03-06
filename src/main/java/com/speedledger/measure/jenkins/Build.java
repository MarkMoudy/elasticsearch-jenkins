package com.speedledger.measure.jenkins;

import java.util.Map;

/**
 * Jenkins build.
 */
public class Build {
    private int number;
    private String jobName;
    private String result;
    private String timestamp;
    private long startTime;
    private long duration;
    private Map<String, String> environment;
    private Map<Object, Object> systemProperties;

    public Build() {
    }

    public Build(int number, String jobName, String result, long startTime, long duration, Map<String, String> environment, Map<Object, Object> systemProperties) {
        this.number = number;
        this.jobName = jobName;
        this.result = result;
        this.startTime = startTime;
        this.duration = duration;
        this.environment = environment;
        this.systemProperties = systemProperties;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public Map<String, String> getEnvironment() {
        return environment;
    }

    public void setEnvironment(Map<String, String> environment) {
        this.environment = environment;
        this.timestamp = environment.get("BUILD_ID");
    }

    public Map<Object, Object> getSystemProperties() {
        return systemProperties;
    }

    public void setSystemProperties(Map<Object, Object> systemProperties) {
        this.systemProperties = systemProperties;
    }

    @Override
    public String toString() {
        return "Build{" +
                "number=" + number +
                ", jobName='" + jobName + '\'' +
                ", result='" + result + '\'' +
                ", startTime=" + startTime +
                ", duration=" + duration +
                ", environment=" + environment +
                ", systemProperties=" + systemProperties +
                '}';
    }
}
