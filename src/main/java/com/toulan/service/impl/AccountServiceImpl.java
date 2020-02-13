package com.toulan.service.impl;

import com.toulan.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * @Author LOL_toulan
 * @Time 2020/2/12 15:51
 * @Message
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Override
    public void saveAccount() {

        System.out.println("账户保存成功");
        int i = 1 / 0;

    }

    @Override
    public void updateAccount(int i) {
        System.out.println("账户更新成功"+i);
    }

    @Override
    public int deleteAccount() {
        System.out.println("账户删除成功");
        return 0;
    }
}
