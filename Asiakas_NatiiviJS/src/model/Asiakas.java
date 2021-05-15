package model;

public class Asiakas {
	private String etunimi,sukunimi,puhelin,sposti;
	private int asiakas_id;
	
	public Asiakas() {
		super();
		
	}

	public Asiakas(String etunimi, String sukunimi, String puhelin, String sposti, int asiakas_id) {
		super();
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.puhelin = puhelin;
		this.sposti = sposti;
		this.asiakas_id = asiakas_id;
	}

	public String getEtunimi() {
		return etunimi;
	}

	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}

	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}

	public String getPuhelin() {
		return puhelin;
	}

	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}

	public String getSposti() {
		return sposti;
	}

	public void setSposti(String sposti) {
		this.sposti = sposti;
	}

	public int getAsiakas_id() {
		return asiakas_id;
	}

	public void setAsiakas_id(int asiakas_id) {
		this.asiakas_id = asiakas_id;
	}

	@Override
	public String toString() {
		return "Asiakas [etunimi=" + etunimi + ", sukunimi=" + sukunimi + ", puhelin=" + puhelin + ", sposti=" + sposti
				+ ", asiakas_id=" + asiakas_id + "]";
	}
	
	
	
}
