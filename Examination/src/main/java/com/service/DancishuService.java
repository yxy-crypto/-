package com.service;


import java.util.List;

import com.beans.Dancishu;

public interface DancishuService {
    List<Dancishu> searchDancishu(String meaning, String word, String collocation, String belong);
}
