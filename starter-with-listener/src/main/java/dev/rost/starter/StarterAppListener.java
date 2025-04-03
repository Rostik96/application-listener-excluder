package dev.rost.starter;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.lang.NonNull;

public class StarterAppListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    @Override
    public void onApplicationEvent(@NonNull ApplicationEnvironmentPreparedEvent __) {
        System.out.println("StarterAppListener#onApplicationEnvironmentPreparedEvent");
    }
}
