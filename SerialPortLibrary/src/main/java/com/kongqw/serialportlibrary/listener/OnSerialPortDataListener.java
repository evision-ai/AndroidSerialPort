package com.kongqw.serialportlibrary.listener;

import java.io.IOException;

/**
 * Created by Kongqw on 2017/11/14.
 * 串口消息监听
 */

public interface OnSerialPortDataListener {

    /**
     * 数据接收
     *
     * @param bytes 接收到的数据
     */
    void onDataReceived(byte[] bytes);

    /**
     * 数据发送
     *
     * @param bytes 发送的数据
     */
    void onDataSent(byte[] bytes);

    /**
     * 串口读写过程中遇到IO异常
     */
    void onIOException(IOException e);
}
