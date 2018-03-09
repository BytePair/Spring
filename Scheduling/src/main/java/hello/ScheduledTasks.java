package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * The @Scheduled annotation defines when the method runs
     *
     * fixedRate: specifies the interval between method invocations measured from the start time of each invocation
     * fixedDelay: specifies the interval between invocations measured from the completion of the task
     *
     * Can also use @Scheduled(cron=". . .") for more advanced task scheduling
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }

}
