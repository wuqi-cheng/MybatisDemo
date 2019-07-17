package test;


import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mapper.BookMapper;
import mapper.DeptMapper;
import mapper.EmpMapper;

public class TestMain {

	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = ssf.openSession(true);
//		BookMapper mapper = session.getMapper(BookMapper.class);
//		System.out.println(mapper.selectAll());
		
		DeptMapper dept = session.getMapper(DeptMapper.class);
		System.out.println(dept.findDeptAndEmp());
		System.out.println("----------");
		EmpMapper emp = session.getMapper(EmpMapper.class);
		System.out.println(emp.findEmpandDept());
		System.out.println("-----sdsds--------");
		session.close();
	}

}
