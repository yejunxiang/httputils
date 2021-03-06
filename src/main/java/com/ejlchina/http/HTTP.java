package com.ejlchina.http;

import com.ejlchina.http.internal.AsyncHttpTask;
import com.ejlchina.http.internal.SyncHttpTask;
import com.ejlchina.http.internal.HttpClient.Builder;

/**
 * HTTP 客户端接口
 * @author 15735
 *
 */
public interface HTTP {

	/**
	 * 异步请求
	 * @param url 请求地址
	 * @return 异步HTTP任务
	 */
    AsyncHttpTask async(String url);

	/**
	 * 同步请求
	 * @param url 请求地址
	 * @return 同步HTTP任务
	 */
    SyncHttpTask sync(String url);
	
    /**
     * 根据标签取消HTTP任务，只要任务的标签包含指定的Tag就会被取消
     * @param tag 标签
     * @return 被取消的任务数量
     */
    int cancel(String tag);
    
    /**
     * HTTP 构建器
     * @return HTTP 构建器
     */
	static Builder builder() {
		return new Builder();
	}
    
}
