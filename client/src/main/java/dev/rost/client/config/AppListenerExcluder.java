package dev.rost.client.config;

import dev.rost.starter.StarterAppListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;

import static java.util.function.Predicate.not;

class AppListenerExcluder implements SpringApplicationRunListener {

    AppListenerExcluder(SpringApplication app, String[] args) {
        System.out.println("AppListenerExcluder#excluding...");
        app.setListeners(
                app.getListeners().stream()
                        .filter(not(listener -> listener instanceof StarterAppListener))
                        .toList());
    }
}
