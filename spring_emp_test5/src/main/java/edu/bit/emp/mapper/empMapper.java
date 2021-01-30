package edu.bit.emp.mapper;

import java.util.List;

import edu.bit.emp.VO.deptVO;
import edu.bit.emp.VO.empVo;

public interface empMapper {

	public List<empVo> getListMgr();

	public List<deptVO> getListDep();

	public List<empVo> getList();

	
	

}
