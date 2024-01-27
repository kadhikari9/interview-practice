package com.interview.practice.designpatterns.creational.builder;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class Computer {
    private String cpu;
    private String ram;
    private String hdd;

    private String graphics;
    private String soundcard;
    private String network;

    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.graphics = builder.graphics;
        this.soundcard = builder.soundcard;
        this.network = builder.network;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CPU = ").append(this.cpu).append("\n")
                .append("RAM = ").append(this.ram).append("\n")
                .append("HDD = ").append(this.hdd).append("\n");

        if (StringUtils.isNotBlank(this.graphics)) {
            builder.append("GRAPHICS = ").append(this.graphics).append("\n");
        }
        if (StringUtils.isNotBlank(this.soundcard)) {
            builder.append("SOUNDCARD = ").append(this.soundcard).append("\n");
        }
        if (StringUtils.isNotBlank(network)) {
            builder.append("NETWORK = ").append(this.network).append("\n");
        }

        return builder.toString();
    }

    public static class ComputerBuilder {
        private final String cpu;
        private final String ram;
        private final String hdd;

        private String graphics;
        private String soundcard;
        private String network;

        public ComputerBuilder(String cpu, String hdd, String ram) {
            this.cpu = cpu;
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder withGraphics(String graphics) {
            this.graphics = graphics;
            return this;
        }

        public ComputerBuilder withSoundCard(String soundCard) {
            this.soundcard = soundCard;
            return this;
        }

        public ComputerBuilder withNetwork(String network) {
            this.network = network;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}