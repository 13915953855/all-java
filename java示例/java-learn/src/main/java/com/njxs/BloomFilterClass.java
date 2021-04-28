package com.njxs;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import com.google.common.io.Flushables;

import java.nio.charset.Charset;

/**
 * 布隆过滤器
 */
public class BloomFilterClass {
    public static void main(String[] args) {
        BloomFilter<String> bloomFilter = BloomFilter.create(Funnels.stringFunnel(Charset.forName("utf-8")), 10000,0.0001);


    }
}
