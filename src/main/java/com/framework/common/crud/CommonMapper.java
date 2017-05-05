package com.framework.common.crud;

import java.util.List;
import java.util.Map;

public interface CommonMapper<E> {
	
	public int deleteByPrimaryKey(Integer id);

    public int insert(E entity);

    public int insertSelective(E entity);

    public E selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(E entity);

    public int updateByPrimaryKey(E entity);
    
    public int total(Map<String, Object> paraMap);
    
    public List<E> query(Map<String, Object> paraMap);
    
}
