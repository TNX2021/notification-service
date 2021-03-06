package com.wine.to.up.notification.service.mobile.apns;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "apns")
@Component
@Getter
@Setter
/**
 * A settings class used to load credentials from application.properties
 * to later be used for pushy's ApnsClient initialization in ApnsService.
 * @see com.wine.to.up.notification.service.mobile.apns.ApnsService
 */
public class ApnsSettings {
    private String keyFile;
    private String teamId;
    private String keyId;
}
