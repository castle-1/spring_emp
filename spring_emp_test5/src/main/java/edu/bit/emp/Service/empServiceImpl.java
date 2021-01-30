package edu.bit.emp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.emp.VO.deptVO;
import edu.bit.emp.VO.empVo;
import edu.bit.emp.mapper.empMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@AllArgsConstructor
@Service
public class empServiceImpl implements empService {
	
	private empMapper mapper;

	@Override
	public List<empVo> getListMgr() {
		log.info("getListMgr");
		return mapper.getListMgr();
		
	}

	@Override
	public List<deptVO> getListDep() {
		log.info("getListDep");
		return mapper.getListDep();
	}

	@Override
	public List<empVo> getList() {
		log.info("getList");
		return mapper.getList();
	}

}
