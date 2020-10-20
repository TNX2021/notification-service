package com.wine.to.up.notification.service.mobile;

import java.util.concurrent.ExecutionException;

/**
 * A common interface for classes that send push notifications.
 */
public interface NotificationSender<T> {
    /**
     * Sends push notification to some notification queue.
     * Implementation-agnostic.
     * 
     * @param request  Some object containing message data
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public void sendMessage(T request) throws InterruptedException, ExecutionException;
}
