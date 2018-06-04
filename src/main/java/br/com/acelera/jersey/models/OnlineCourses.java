package br.com.acelera.jersey.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class OnlineCourses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(length = 64, nullable=false)
	private String name;
	@Column(length = 64, nullable=false)
	private String major;
	@Column(length = 64, nullable=false)
	private String graduationyear;
	@Column(length = 128, nullable=false)
	private String url;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGraduationyear() {
		return graduationyear;
	}
	public void setGraduationyear(String graduationyear) {
		this.graduationyear = graduationyear;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((graduationyear == null) ? 0 : graduationyear.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((major == null) ? 0 : major.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OnlineCourses other = (OnlineCourses) obj;
		if (graduationyear == null) {
			if (other.graduationyear != null)
				return false;
		} else if (!graduationyear.equals(other.graduationyear))
			return false;
		if (id != other.id)
			return false;
		if (major == null) {
			if (other.major != null)
				return false;
		} else if (!major.equals(other.major))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OnlineCourses [id=" + id + ", name=" + name + ", major=" + major + ", graduationyear=" + graduationyear
				+ ", url=" + url + "]";
	}
	
}
