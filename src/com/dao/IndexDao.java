package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.po.Goods;

@Repository("indexDao")
@Mapper
public interface IndexDao {
	public Goods selectGoodsById(Integer id);
	public List<Goods> search(String mykey);
	public List<Map<String, Object>> getLastedGoods(Goods goods);
}
