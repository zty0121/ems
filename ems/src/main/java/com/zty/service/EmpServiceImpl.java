package com.zty.service;



import com.zty.entity.Emp;
import com.zty.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
	private EmpMapper empMapper;
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public List<Emp> getAll(){
		List<Emp> list = empMapper.selectAll();
		for (Emp e: list){
			e.setBirthday(new Date());
			System.out.println(e);
		}
		return list;
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public void Delete(String id){
		empMapper.deleteByPrimaryKey(id);
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public void AddOne(Emp es){
		empMapper.insert(es);
	}


	@Transactional(propagation=Propagation.REQUIRED)
	public Emp Update(Emp es) {
		Emp e = Query(es.getId().toString());      //通过id查到人
		if(e==null)throw new RuntimeException("查无此人");
		empMapper.updateByPrimaryKey(es);
		return e;
	}


	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public Emp Query(String id) {
		Emp e = empMapper.selectByPrimaryKey(id);
		return e;
	}

	
	
	
}
