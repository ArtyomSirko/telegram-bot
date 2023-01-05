package pro.sky.telegrambot.scheduling;

import org.assertj.core.util.DateUtil;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TelegramEventSchedulerTest {
    @Test
    void testTime() {

        System.out.println(LocalDateTime.now().withSecond(0).withNano(0));
    }
}