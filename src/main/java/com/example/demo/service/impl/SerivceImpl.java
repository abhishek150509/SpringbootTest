package com.example.demo.service.impl;


import com.example.demo.service.Service;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class SerivceImpl implements Service {
    @Override
    public List<String> getAll() {
        List<String> res= new ArrayList<>();
        res.add("aaa");
        res.add("bbb");
        return res;
    }
}
