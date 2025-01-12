package com.library;

import com.library.entity.DailyStat;
import com.library.repository.DailyStatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Component
public class ApplicationRunner implements CommandLineRunner {
    private final DailyStatRepository dailyStatRepository;


    @Override
    public void run(String... args) {
        DailyStat dailyStat1 = new DailyStat("HTTP", LocalDateTime.now());
        DailyStat dailyStat2 = new DailyStat("HTTP", LocalDateTime.now());
        DailyStat dailyStat3 = new DailyStat("HTTP", LocalDateTime.now());
        DailyStat dailyStat4 = new DailyStat("HTTP", LocalDateTime.now());
        DailyStat dailyStat5 = new DailyStat("HTTP", LocalDateTime.now());
        DailyStat dailyStat6 = new DailyStat("HTTP", LocalDateTime.now());
        DailyStat dailyStat7 = new DailyStat("HTTP", LocalDateTime.now());

        DailyStat dailyStat8 = new DailyStat("JAVA", LocalDateTime.now());
        DailyStat dailyStat9 = new DailyStat("JAVA", LocalDateTime.now());

        DailyStat dailyStat10 = new DailyStat("Kotlin", LocalDateTime.now());
        DailyStat dailyStat11 = new DailyStat("Database", LocalDateTime.now());
        DailyStat dailyStat12 = new DailyStat("OS", LocalDateTime.now());
        dailyStatRepository.saveAll(List.of(dailyStat1, dailyStat2, dailyStat3, dailyStat4, dailyStat5, dailyStat6,
                dailyStat7, dailyStat8, dailyStat9, dailyStat10, dailyStat11, dailyStat12));
    }
}
