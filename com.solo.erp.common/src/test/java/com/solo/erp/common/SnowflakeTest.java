package com.solo.erp.common;

import com.solo.erp.common.utils.BinHexUtil;
import com.solo.erp.common.utils.SnowflakeIdWorker;

public class SnowflakeTest {
    public static void main(String[] args) {
        SnowflakeIdWorker snowflake = new SnowflakeIdWorker(2, 5);
        for (int i = 0; i < 20; i++) {
            long id = snowflake.nextId();
            System.out.println(String.format("%s => id: %d, hex: %s, bin: %s", snowflake.formatId(id), id,
                    BinHexUtil.hex(id), BinHexUtil.bin(id)));
        }
    }
}
