package br.com.pan.bluebank.utils;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class AppListener implements
        ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        // Add AWS access key and secret key to Java system properties as soon as the environment is available
        System.setProperty("aws.accessKeyId", "AKIA6BZRT7L4UBSLEAFZ");
        System.setProperty("aws.secretAccessKey", "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");
    }
}
