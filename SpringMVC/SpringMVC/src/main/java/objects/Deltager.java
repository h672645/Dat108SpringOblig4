package objects;

import javax.validation.constraints.Pattern;


public class Deltager {

	@Pattern(regexp = "^[A-Za-z\\s-]{2,}$", message = "Fornavn must have at least 2 characters and only contain letters, spaces, or dashes")
	private String fornavn;

	@Pattern(regexp = "^[A-Za-z\\s-]{2,}$", message = "Etternavn must have at least 2 characters and only contain letters, spaces, or dashes")
	private String etternavn;

	@Pattern(regexp = "^[0-9]{8}$", message = "Mobil must contain exactly 8 numbers")
	private int mobil;

	private String passord;

	@Pattern(regexp = "^(mann|kvinne)$", message = "Kjonn must be either 'mann' or 'kvinne'")
	private Kjonn kjonn;

	public Deltager() {

	}

	public Deltager(String fornavn) {
		this.fornavn = fornavn;
	}

	public Deltager(String fornavn, String etternavn, int mobil, String passord, Kjonn kjonn) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.mobil = mobil;
		this.passord = passord;
		this.kjonn = kjonn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public String getFornavn() {
		return fornavn;
	}

	public Kjonn getKjonn() {
		return kjonn;
	}

	public int getMobil() {
		return mobil;
	}

	public String getPassord() {
		return passord;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public void setKjonn(Kjonn kjonn) {
		this.kjonn = kjonn;
	}

	public void setMobil(int mobil) {
		this.mobil = mobil;
	}

	public void setPassord(String passord) {
		this.passord = passord;
	}

	@Override
	public String toString() {
		return "Deltager [fornavn=" + fornavn + ", etternavn=" + etternavn + ", mobil=" + mobil + ", passord=" + passord
				+ ", kjonn=" + kjonn + "]";
	}

}
