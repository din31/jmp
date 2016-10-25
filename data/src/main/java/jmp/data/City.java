package jmp.data;

import javax.persistence.Id;
import javax.persistence.Version;

public class City {

	@Id
	public String id;

	@Version
	public Long version;

	public String name;
	
	public City() {}
	
	public City(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getName() {		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String id = getId();
		return String.format("City[id=%s, name='%s', version=%s]", id, name, version);
	}

}
