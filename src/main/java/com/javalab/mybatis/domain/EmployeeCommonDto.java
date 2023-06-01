package com.javalab.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

/*
 * [사원 정보 확장 클래스]
 * - 사원정보 클래스는 데이터베이스의 사원정보 테이블과 같아야 한다.
 *   그런데 순수한 사원정보만 조회하는 경우는 드물다. 사원정보를 조회할때
 *   순수한 사원정보 외에 추가로 그 사원이 속한 부서 이름도 조회할 때가
 *   있다. 그럴때 이 확장 클래스를 사용한다.
 * - 사원 클래스를 상속받기 때문에 사원 클래스가 갖고 있는 필드를 갖게
 *   되며 그 외에 departmentName 등을 추가한다.
 * - 매퍼XML 쿼리문에서 이 확장 클래스를 사용해서 사원정보 외에 추가
 *   정보를 조회해올 때 사용함.
 */
public class EmployeeCommonDto extends Employees{
	
	private String departmentName;
	private String managerName;
	private String hireDateFrom;
	private String hireDateTo;

}
