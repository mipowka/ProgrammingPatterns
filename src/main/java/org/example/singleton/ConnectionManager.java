package org.example.singleton;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ConnectionManager {
    private Service service = Service.getInstance();
    private ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);


    public void connectNewUser() {
        Runnable runnable = () -> {
            System.out.println("работает connectNewUser");
            if (service.getMaxConnections() > service.getConnectionsNow()) {
                service.setConnectionsNow(service.getConnectionsNow() + 2);
                System.out.println("new connect user number " + service.getConnectionsNow());
            }
        };
        executorService.scheduleWithFixedDelay(runnable, 1, 1, TimeUnit.SECONDS);
    }

    public void isAvailable() {
        Runnable runnable = () -> {
            boolean flag = true;
            System.out.println("работает isAvailable");
            if (service.getMaxConnections() <= service.getConnectionsNow()-1) {
                service.setStatus(false);
                System.err.println("max connections reached");
                flag = false;
            }
            if (service.getMaxConnections() > service.getConnectionsNow() && flag == false) {
                service.setStatus(true);
                System.out.println("connection available");
            }

        };
        executorService.scheduleWithFixedDelay(runnable, 1, 5, TimeUnit.SECONDS);
    }

    public void disconnect() {
        Runnable runnable = () -> service.setConnectionsNow(service.getConnectionsNow() - 3);
        executorService.scheduleWithFixedDelay(runnable, 15, 5, TimeUnit.SECONDS);
    }


}
