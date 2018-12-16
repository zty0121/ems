package com.zty.service;
import com.zty.entity.Emp;
import java.util.List;
public interface EmpService {
	public List<Emp> getAll();
	public void Delete(String id);
	public void AddOne(Emp e);
	public Emp Update(Emp e);
	public Emp Query(String id);
}
