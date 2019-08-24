package com.subhadeep.protobuf;


import example.complex.Complex.ComplexMessage;
import example.complex.Complex.DummyMessage;

import java.util.Arrays;
import java.util.List;

public class ComplexMain {
    public static void main(String[] args) {
        System.out.println("Complex Example");

        DummyMessage oneDummy = newDummyMessage(55, "One Dummy Message");

        ComplexMessage complexMessage = newComplexMessage(oneDummy, Arrays.asList(
                newDummyMessage(66, "First Dummy Message"),
                newDummyMessage(77, "Second Dummy message"),
                newDummyMessage(88, "Third Dummy Message")
        ));

        // Single Dummy Message
        System.out.println(oneDummy);
        //multiple Dummy Message
        System.out.println(complexMessage);

        // GET
        complexMessage.getOneDummy();
        complexMessage.getMultipleDummyList();
    }
    private static DummyMessage newDummyMessage(Integer id, String name) {
        DummyMessage.Builder dummyMessageBuilder = DummyMessage.newBuilder();
        DummyMessage dummyMessage =  dummyMessageBuilder.setId(id)
                    .setName(name)
                    .build();
        return dummyMessage;
    }

    private static ComplexMessage newComplexMessage(DummyMessage dummyMessage, List<DummyMessage> dummyMessages) {
        ComplexMessage.Builder complexMessageBuilder = ComplexMessage.newBuilder();
        ComplexMessage complexMessage = complexMessageBuilder.setOneDummy(dummyMessage)
                .addAllMultipleDummy(dummyMessages).build();
        return complexMessage;
    }
}
