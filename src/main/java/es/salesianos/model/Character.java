package es.salesianos.model;

public class Character {
	private Integer id;
	private String name;
	private boolean holder;
	private Long codRace;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHolder() {
		return holder;
	}

	public void setHolder(boolean holder) {
		this.holder = holder;
	}

	public Long getCodRace() {
		return codRace;
	}

	public void setCodRace(Long codRace) {
		this.codRace = codRace;
	}

}