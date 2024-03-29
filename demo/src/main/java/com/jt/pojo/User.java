package com.jt.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * 为对象的赋值 当前的对象必须交给spring容器管理
 * @author tarena
 *
 */
@Component   //Map<K,V> key=user
@ConfigurationProperties(prefix="user")
public class User implements Serializable{
	private static final long serialVersionUID = -9129067430165774673L;
	private Integer id;
	private String username;
	private Integer age;
	
	
	
	/*@Value("${user.id}")
	private Integer id; 
	@Value("${user.username}")
	private String username;
	@Value("${user.age}")
	private Integer age;*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + "]";
	}
	
}
