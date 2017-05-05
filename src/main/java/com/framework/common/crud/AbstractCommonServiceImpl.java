package com.framework.common.crud;

import java.util.List;
import java.util.Map;

public abstract class AbstractCommonServiceImpl<E> implements CommonService<E> {

	
	protected abstract CommonMapper<E> getBaseMapper();
	
	@Override
	public void add(E entity) {
		getBaseMapper().insert(entity);
	}

	@Override
	public void update(E entity) {
		getBaseMapper().updateByPrimaryKey(entity);
	}

	@Override
	public void delete(Integer id) {
		getBaseMapper().deleteByPrimaryKey(id);
	}

	@Override
	public void delete(Integer[] ids) {
		// TODO 暂时循环删除
		for( Integer id : ids ){
			getBaseMapper().deleteByPrimaryKey(id);
		}
	}

	@Override
	public E get(Integer id) {
		return getBaseMapper().selectByPrimaryKey(id);
	}

	@Override
	public List<E> query(Map<String, Object> paraMap) {
		return getBaseMapper().query(paraMap);
	}

	@Override
	public int total(Map<String, Object> paraMap) {
		return getBaseMapper().total(paraMap);
	}
	
}
