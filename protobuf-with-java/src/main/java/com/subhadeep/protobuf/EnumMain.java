package com.subhadeep.protobuf;

import example.enumerations.EnumExample;
import example.enumerations.EnumExample.EnumMessage;

public class EnumMain {
    public static void main(String[] args) {
        System.out.println("Example for enums");

        EnumMessage.Builder builder = EnumMessage.newBuilder();

        // Example with enums
        builder.setId(345)
                .setDayOfTheWeek(EnumExample.DayOfTheWeek.MONDAY);

        EnumMessage message = builder.build();

        System.out.println(message);
    }
}
