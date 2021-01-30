package edu.bit.emp.VO;

import java.sql.Date;

public class empVo {
	
	private int empno;    //사원 번호
	private String ename; //사원이름             
	private String job;   //직업     
	private int mgr;      //매니저           
	private Date hiredate;//입사일                 
	private int sal;      //급여          
	private int comm;     //커밋           
	private int deptno;   //부서번호    
	
	
	public empVo() {
		super();
	}


	

	public empVo(int empno, String ename, String job, int mgr, Date hiredate, int sal, int comm, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}




	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public int getMgr() {
		return mgr;
	}


	public void setMgr(int mgr) {
		this.mgr = mgr;
	}


	


	public Date getHiredate() {
		return hiredate;
	}




	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}




	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public int getComm() {
		return comm;
	}


	public void setComm(int comm) {
		this.comm = comm;
	}


	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
	
	

}
