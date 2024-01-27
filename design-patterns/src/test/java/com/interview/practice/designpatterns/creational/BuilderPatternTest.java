package com.interview.practice.designpatterns.creational;

import com.interview.practice.designpatterns.creational.builder.Computer;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class BuilderPatternTest {

    @Test
    public void testBuilderPattern() {
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder("Intel Core i7",
                "1 TB Sandisk SSD",
                "32 GB Samsung DDR4");

        Computer basicComputer = builder.build();
        log.info("Basic Computer Specs:\n{}", basicComputer);

        Computer advancedComputer = builder.withGraphics("Nvidia RTX 3080 4G VRAM")
                .withNetwork("Intel WLAN")
                .withSoundCard("RealTech Audio")
                .build();

        log.info("Advanced Computer Specs:\n{}", advancedComputer);
    }
}
