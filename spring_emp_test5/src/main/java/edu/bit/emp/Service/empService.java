package edu.bit.emp.Service;

import java.util.List;

import edu.bit.emp.VO.deptVO;
import edu.bit.emp.VO.empVo;


public interface empService {
	
	
	public List<empVo> getListMgr();

	public List<deptVO> getListDep();

	public List<empVo> getList(); 
	
	
}
