package com.solo.erp.common.utils;

import java.net.NetworkInterface;
import java.security.SecureRandom;
import java.time.Instant;
import java.util.Enumeration;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 基于Twitter Snowflake算法
 */
public class SequenceGenerator {
    private static final AtomicInteger counter = new AtomicInteger(new SecureRandom().nextInt());

    private static final int TOTAL_BITS = 64;
    private static final int EPOCH_BITS = 42;
    private static final int MACHINE_ID_BITS = 10;

    private static final int MACHINE_ID;
    private static final int LOWER_ORDER_TEN_BITS = 0x3FF;
    private static final int LOWER_ORDER_TWELVE_BITS = 0xFFF;

    public static long nextId() {
        long curMs = Instant.now().toEpochMilli();
        long id = curMs << (TOTAL_BITS - EPOCH_BITS);
        id |= (MACHINE_ID << (TOTAL_BITS - EPOCH_BITS - MACHINE_ID_BITS));
        id |= (getNextCounter() & LOWER_ORDER_TWELVE_BITS);
        return id;
    }

    private static int getNextCounter() {
        return counter.getAndIncrement();
    }

    static {
        MACHINE_ID = createMachineId();
    }

    private static int createMachineId() {
        int machineId;
        try {
            StringBuilder sb = new StringBuilder();
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                byte[] mac = networkInterface.getHardwareAddress();
                if (mac != null) {
                    for (int i = 0; i < mac.length; i++) {
                        sb.append(String.format("%02X", mac[i]));
                    }
                }
            }
            machineId = sb.toString().hashCode();
        } catch (Exception ex) {
            machineId = (new SecureRandom().nextInt());
        }
        machineId = machineId & LOWER_ORDER_TEN_BITS;
        return machineId;
    }

    public static void main(String[] args) {
        for (int i=1;i<10000;i++)
            System.out.println(SequenceGenerator.nextId());
    }
}
