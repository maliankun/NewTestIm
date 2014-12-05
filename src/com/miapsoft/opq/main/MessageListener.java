package com.miapsoft.opq.main;

import com.miapsoft.opq.proto.Base.BaseProto;

/**
 * 获得消息时回调用到的接口
 * @author liyakun
 * 2014年12月4日
 */
public interface MessageListener {
	public void Message(BaseProto msg);
}
