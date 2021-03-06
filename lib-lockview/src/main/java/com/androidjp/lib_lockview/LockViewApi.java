package com.androidjp.lib_lockview;

import com.androidjp.lib_lockview.enums.LockMode;
import com.androidjp.lib_lockview.listener.OnCompleteListener;

/**
 * 总体操作接口
 * Created by androidjp on 16/9/12.
 */
public interface LockViewApi {


    /**
     * -------------------------------------------------------
     * 输入接口
     */

    /**
     * 设置允许最大输入错误次数
     * @param num 最大输入错误次数
     */
    public void setErrorCount(int num);

    /**
     * @return 组件是否显示方向三角形
     */
    public boolean isShow();


    /**
     * 设置锁屏View的模式
     * @param mode 设置密码|重置密码|删除密码|验证密码
     */
    public void setMode(LockMode mode);

    /**
     * 是否在设置密码之后,保存密码到本地
     * @param savePin 是否保存密码到本地
     */
    public void setSavePin(boolean savePin);

    /**
     * @param passwordMinLength  最小密码长度
     */
    public void setPasswordMinLength(int passwordMinLength);

    /**
     * 设置是否清空输入的密码
     */
    public void setIsClearPassword(boolean isClearPassword);

    /**
     * @param listener 操作完成后的监听方法设置
     */
    public void setOnCompleteListener(OnCompleteListener listener);

    /**
     * -------------------------------------------------------
     * 输出接口
     */

    /**
     * @return 返回 当前锁屏view的模式
     */
    public LockMode getMode();

    /**
     * @return 是否保存密码到本地
     */
    public boolean isSavePin();


}
