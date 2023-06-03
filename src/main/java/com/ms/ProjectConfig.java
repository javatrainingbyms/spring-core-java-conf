package com.ms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ms")	//this is a must for using stereotype annotations (@Component, @Repository etc.))
public class ProjectConfig {

	//here we are writing a method to configure a bean of Employee type
	
	@Bean
	public Employee e1() {	//method name indicates bean id
		Employee emp=new Employee();
		emp.setEno(1001);
		emp.setName("abcd");
		Set<String> emails=new HashSet<>();
		emails.add("abc@gmail.com"); emails.add("xyz@gmail.com");
		emp.setEmails(emails);
		List<String> hobbies=Arrays.asList("music","dance","singining");
		//hobbies.add(1, "drawing");

		
		/*
		List<String> hobbies=new ArrayList<>();
		hobbies.add("music");
		hobbies.add("dance");
		*/
		emp.setHobbies(hobbies);
		
		List<Project> projects=Arrays.asList(new Project("p111","erp"), new Project("112","account"));
		emp.setProjects(projects);
		
		Map<String,Address> addressMap=new HashMap<>();
		addressMap.put("temporary", new Address(555,"abroad","indore"));
		addressMap.put("permanent", new Address(666,"mbroad","bhopal"));
		
		emp.setAddresses(addressMap);
		
		
		return emp;
	}
	
	/*
	//replaced this with @Component (stereotype annotation)
	@Bean
	public MyCountry MyCountry() {
		return new MyCountry();
	}
	*/
	
	@Bean
	public Address address() {
		return new Address(555,"xyz-road","delhi");
	}
}
/*
 //In the above class the entire xml code will be replaced by java code
  
<bean id="e1" class="com.ms.Employee">
		<property name="eno" value="1001"/>
		<property name="name" value="abcd"/> 
		<property name="addresses">
			<map>
				<entry key="temporary" value-ref="adr1"/>
				<entry key="permanent" value-ref="adr2"/>
			</map>	
		</property>
		<property name="address" ref="adr1"/>
		<property name="education">
			<props>
				<prop key="btech">davv</prop>
				<prop key="mtech">rgpv</prop>
				<prop key="phd">iitb</prop>
			</props>
		</property>
		<property name="kids">
			<map>
				<entry key="kid-1" value="8"/>
				<entry key="kid-2" value="12"/>
				<entry key="kid-3" value="15"/>
			</map>
		</property>
		<property name="emails">
			<set>
				<value>ab@gmail.com</value>
				<value>ab@yahoo.com</value>
				<value>ab@gmail.com</value>
			</set>
		</property>
		<property name="projects">
			<list>
				<ref bean="proj1"/>
				<ref bean="proj2"/>
			</list>
		</property>
	</bean>
	<bean id="proj1" class="com.ms.Project">
		<property name="code" value="pr101"/>
		<property name="name" value="banking-app"/>
	</bean>
	<bean id="proj2" class="com.ms.Project">
		<property name="code" value="pr102"/>
		<property name="name" value="insurance-app"/>
	</bean>
	<bean id="adr1" class="com.ms.Address">
		<property name="hno" value="5151"/>
		<property name="street" value="mg-road"/> 
		<property name="city" value="bhopal"/> 
	</bean>
	<bean id="adr2" class="com.ms.Address">
		<property name="hno" value="6677"/>
		<property name="street" value="ab-road"/> 
		<property name="city" value="mumbai"/> 
	</bean>

*/