package com.framework.common.crud;

import java.util.List;
import java.util.Map;

/**
 * 常用服务接口
 * @param <E>
 *@author xuxianping
 *
 */
public interface CommonService<E> {

	public void add(E entity);
	
	public void update(E entity);
	
	public void delete(Integer id);
	
	public void delete(Integer[] ids);
	
	public E get(Integer id);
	
	public List<E> query(Map<String, Object> paraMap);
	
	public int total(Map<String, Object> paraMap);
	
}
